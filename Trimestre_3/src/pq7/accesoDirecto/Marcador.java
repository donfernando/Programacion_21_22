package pq7.accesoDirecto;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Marcador {
	private static class Reg implements Comparable<Reg>{
		public final static int TAM_NOMBRE = 10;
		public final static int TAM_REG = 
				TAM_NOMBRE * Character.BYTES + Integer.BYTES;
		public char[] nombre;
		public int puntos;

		public Reg() {
			nombre = new char[TAM_NOMBRE];
			puntos = 0;
		}
		
		public Reg(String n, int p) {
			String nAjustado;
			// no más de TAM_NOMBRE chars
			if(n.length()>TAM_NOMBRE)
				nAjustado = n.substring(0, TAM_NOMBRE);
			else
				nAjustado = n;
			// no menos de TAM_NOMBRE chars
			nombre = String.format("%-" + TAM_NOMBRE + "s", nAjustado).toCharArray();
			puntos = p;
		}

		@Override
		public int compareTo(Reg o) {
			return puntos-o.puntos;
		}
	}

	RandomAccessFile fDirecto;
	RandomAccessFile fExtra;
	public final static String POS_LIBRE = "##########";
	public final static int NUM_DATOS = 20;
	private final static int NUM_HUECOS = NUM_DATOS / 4;
	private final static int NUM_POSICIONES = NUM_DATOS + NUM_HUECOS;

	public Marcador(String nFich) throws IOException {
		File f = new File(nFich+".dat");
		if (f.exists()) {
			fDirecto = new RandomAccessFile(f, "rw");
		} else {
			fDirecto = crearFichero(f);
		}
		fExtra = new RandomAccessFile(nFich+".ext", "rw");
	}

	/** Consulta los puntos del nombre facilitado.
	 * 
	 * @param nombre Nombre cuya puntuacion se desea consultar.
	 * @return Los puntos. Retorna -1 si no existe este nombre.
	 * @throws IOException 
	 */
	public int getPuntos(String nombre) throws IOException {
		if(nombre.equals(POS_LIBRE))
			throw new IllegalArgumentException("Nombre inválido");
		Reg buscado = new Reg(nombre,0);
		Reg leido = new Reg();
		boolean encontrado = false;
		int posQueLeCorresponde=Codigo.hash(new String(buscado.nombre), NUM_POSICIONES);
		//Busqueda en fichero principal		
		fDirecto.seek(posQueLeCorresponde*Reg.TAM_REG);
		leeNombre(fDirecto, leido.nombre);
		encontrado=Arrays.equals(leido.nombre, buscado.nombre);
		if(encontrado)
			leido.puntos=fDirecto.readInt();
		else {
			//Búsqueda secuencial en fichero secundario
			fExtra.seek(0);
			try {
				while(!encontrado) {
					leeNombre(fExtra, leido.nombre);
					leido.puntos=fExtra.readInt();
					encontrado=Arrays.equals(leido.nombre, buscado.nombre);
				}
			} catch (EOFException e) {}
		}
		if(!encontrado)
			return -1;
		return leido.puntos;
	}		

	/** Actualiza los puntos (pero solo si son más de los que tenía).
	 *  Si en nombre no existe, la da de alta.
	 *  
	 * @param nombre Nombre cuya puntuacion se desea actualizar.
	 * @param puntos Nueva puntuación
	 * @throws IOException 
	 */
	public void setPuntos(String nombre, int puntos) throws IOException {
		Reg nuevo = new Reg(nombre,0);
		int puntosActuales = getPuntos(nombre);
		if(puntos>puntosActuales) {
			String nombreAjustado = new String(nuevo.nombre);
			Reg leido = new Reg();
			boolean posEncontrada = false;
			int posQueLeCorresponde=Codigo.hash(nombreAjustado, NUM_POSICIONES);
			//Busqueda en fichero principal		
			fDirecto.seek(posQueLeCorresponde*Reg.TAM_REG);
			leeNombre(fDirecto, leido.nombre);
			if(new String(leido.nombre).equals(POS_LIBRE)) {
				fDirecto.seek(posQueLeCorresponde*Reg.TAM_REG);
				fDirecto.writeChars(nombreAjustado);
				fDirecto.writeInt(puntos);
			}
			else if(Arrays.equals(leido.nombre, nuevo.nombre))
				fDirecto.writeInt(puntos);
			else {
				// su posicion está ocupada. Buscar/Grabar en fExtra
				//Búsqueda secuencial en fichero secundario
				fExtra.seek(0);
				try {
					leeNombre(fExtra, leido.nombre);
					posEncontrada=Arrays.equals(leido.nombre, nuevo.nombre);
					while(!posEncontrada) {
						leido.puntos=fExtra.readInt();
						leeNombre(fExtra, leido.nombre);
						posEncontrada=Arrays.equals(leido.nombre, nuevo.nombre);
					}
					fExtra.writeInt(puntos);
				} catch (EOFException e) {
					fExtra.writeChars(nombreAjustado);
					fExtra.writeInt(puntos);
				}
			}
		}
	}
	
	public void close() throws IOException {
		fDirecto.close();
		fExtra.close();
	}

	/**
	 * Método para leer la tabla de chars que compone el nombre de tamaño fijo
	 * 
	 * @param in Canal de entrada de acceso random
	 * @param nombre Referencia a la tabla que recibirá los caracteres leidos
	 * @throws IOException
	 */
	private static void leeNombre(RandomAccessFile in, char[] nombre) throws IOException {
		for (int i = 0; i < nombre.length; i++) {
			nombre[i] = in.readChar();
		}	
	}
	
	
	private static RandomAccessFile crearFichero(File f) throws IOException {
		RandomAccessFile fich = new RandomAccessFile(f, "rw");
		for (int i = 0; i < NUM_POSICIONES; i++) {
			fich.writeChars(POS_LIBRE);
			fich.writeInt(0);
		}
		fich.seek(0);
		return fich;
	}

	@Override
	public String toString() {
		String listadoMarcador = "Ranking de Puntuaciones\n"
				+  "-----------------------\n";
		String linea;
		ArrayList<Reg> lista = new ArrayList<>();
		Reg reg = new Reg();
		String nombre;
		try {
			fDirecto.seek(0);
			fExtra.seek(0);
			try {
				while(true) {
					leeNombre(fDirecto, reg.nombre);
					nombre = new String(reg.nombre);
					reg.puntos = fDirecto.readInt();
					if(!nombre.equals(POS_LIBRE)) {
						lista.add(reg);
						reg = new Reg();				
					}
				}
			} catch (EOFException e) {}
			try {
				while(true) {
					leeNombre(fExtra, reg.nombre);
					nombre = new String(reg.nombre);
					reg.puntos = fExtra.readInt();
					lista.add(reg);
					reg = new Reg();				
				}
			} catch (EOFException e) {}
			Collections.sort(lista);
			for (Reg r : lista) {
				nombre = new String(r.nombre);
				linea = String.format("%s: %2d puntos.\n",
						nombre,r.puntos);
				listadoMarcador += linea ;
			}
		} catch (IOException e) {
			listadoMarcador += "Problemas leyendo marcador...\n";
		}
		return listadoMarcador;
	}
}
