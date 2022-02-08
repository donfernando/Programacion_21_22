package dpm.bloque5.excepciones;

public class ListaStrings {

	public final static int TAMANIO_INICIAL = 10;
	public final static int TAMANIO_CRECIMIENTO = 20;
	private String[] datos;
	private int tamanio;

//	public ListaStrings() {
//		datos = new String[TAMANIO_INICIAL];
//		//tamanio = 0;
//	}
	public ListaStrings() {
		this(TAMANIO_INICIAL);
	}

	public ListaStrings(int capacidad) {
		datos = new String[capacidad];
		// tamanio = 0;
	}
	public ListaStrings(String[] lista) {
		datos = new String[lista.length+TAMANIO_CRECIMIENTO];
		for(int i=0;i<lista.length;i++) {
			datos[i] = lista[i];
		}
//		datos = lista;
		tamanio = lista.length;
	}
	public int size() {
		return tamanio;
	}

	public int capacity() {
		return datos.length;
	}

//	public boolean add(String valorUsuario) {
//		asegurarEspacio();
//		datos[tamanio] = valorUsuario;
//		tamanio += 1;
//		return true;
//	}
	public boolean add(String valorUsuario) {
		return add(size(), valorUsuario);
	}

	public boolean add(int pos, String valorUsuario) {
		int i;
		if(pos>tamanio)
			throw new ArrayIndexOutOfBoundsException();			
		if (valorUsuario != null) {
			asegurarEspacio();
			for (i = tamanio - 1; i >= pos; i--) {
				datos[i + 1] = datos[i];
			}
			datos[pos] = valorUsuario;
			tamanio++;
			return true;
		}
		return false;
	}

	private void asegurarEspacio() {
		int i;
		String[] tablaAux;
		if (datos.length == tamanio) {
			tablaAux = new String[datos.length + TAMANIO_CRECIMIENTO];
			for (i = 0; i < tamanio; i++) {
				tablaAux[i] = datos[i];
			}
			datos = tablaAux;
		}
	}

	public String get(int pos) {
		if(pos>=tamanio)
			throw new ArrayIndexOutOfBoundsException();
		return datos[pos];
	}

	public String toString() {
		String s = "[";
		int i;
		for (i = 0; i < tamanio - 1; i++) {
			s += "\""+datos[i] + "\", ";
		}
		if (tamanio != 0)
			s += "\""+datos[i] + "\"";
		return s + "]";
	}
	
	public void clear() {
		
//		int i;
//		for (i = 0; i < tamanio - 1; i++)
//			datos[i]=null;
		tamanio=0;
	}
	public boolean isEmpty() {
		return tamanio==0;
	}
	
	// TODO	revisar excepción
	public void set(int pos, String d) {
		if(pos>=tamanio)
			throw new ArrayIndexOutOfBoundsException();
		if (d != null) 
			datos[pos]=d;
	}

	// TODO revisar excepción
	public String remove(int pos) {
        int i;
		if(pos>=tamanio)
			throw new ArrayIndexOutOfBoundsException();
        String aux = datos[pos];
        for (i = pos; i < tamanio -1; i++) {
            datos[i] = datos[i + 1];
        }
        //datos[i]=null;
        tamanio--;
        return aux;
    }

	public String[] toArray() {
		String[] resultado = new String[tamanio];
		for(int i=0;i<tamanio;i++)
			resultado[i] = datos[i];
		return resultado;
	}
}