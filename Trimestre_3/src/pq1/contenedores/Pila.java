package pq1.contenedores;

public class Pila<T> {
	public final static int TAMANIO_INICIAL = 10;
	public final static int TAMANIO_CRECIMIENTO = 10;
	public final static int TAMANIO_MAXIMO = 1000;
	@SuppressWarnings("unchecked")
	private T[] datos=(T[])new Object[TAMANIO_INICIAL];
	private int cima=0;
	

	@SuppressWarnings("unchecked")
	private void asegurarHueco() {
		int i;
		T[] tablaAux;
		if (datos.length == cima) {
			if(datos.length >= TAMANIO_MAXIMO) {
				throw new RuntimeException("No puede crecer más");
			}
			tablaAux = (T[])new Object[datos.length + TAMANIO_CRECIMIENTO];
			for (i = 0; i < cima; i++) {
				tablaAux[i] = datos[i];
			}
			datos = tablaAux;
		}
	}
	public Pila<T> apilar(T dato){
		if(dato==null)
			throw new NullPointerException();
		asegurarHueco();
		datos[cima++]=dato;
		//cima++;
		return this;
	}
	public T desapilar() {
		T aux;
		aux=datos[cima-1];
		cima--;
		datos[cima]=null;
		return aux;
	}
	public boolean vacia() {
		return cima==0;
	}
	public boolean llena() {
		return datos.length>=TAMANIO_MAXIMO && datos.length==cima;
	}
	
	
}





