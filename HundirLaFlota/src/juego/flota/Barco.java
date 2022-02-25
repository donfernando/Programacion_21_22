package juego.flota;

public abstract class Barco {
	protected int tamanio, toques;
//	protected transient boolean hundido;
	
	public Barco(int tam) {
		tamanio=tam;
	}
	
	public int tocado() {
		if(toques<tamanio) {
			toques++;
		}
		return toques;	
	}
	public boolean hundido() {
		return toques==tamanio;
	}
	
	public int getTamanio() {
		return tamanio;
	}
	
	public abstract char letra();
}
