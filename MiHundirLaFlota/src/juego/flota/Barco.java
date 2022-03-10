package juego.flota;

import juego.base.Mundo.Estado;

public abstract class Barco {
	protected int tamanio, toques;
//	protected transient boolean hundido;
	
	public Barco(int tam) {
		tamanio=tam;
	}
	
		

	public Estado tocado() {
		if(toques<tamanio) {
			toques++;
		}
		return toques==tamanio?Estado.HUNDIDO:Estado.TOCADO;
	}
	public boolean hundido() {
		return toques==tamanio;
	}
	
	public int getTamanio() {
		return tamanio;
	}

	public abstract char letra();
}