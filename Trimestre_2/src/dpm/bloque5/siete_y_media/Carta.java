package dpm.bloque5.siete_y_media;

public class Carta {
	private int valor;
	private Palo palo;

	public Carta(int valor ,Palo palo ) {
		if (valor < 1 | valor > 12 | valor == 8 | valor == 9) {
			throw new ValorCartaInvalidaException("El valor introducido es inválido");
		}
		this.valor = valor;
		this.palo=palo;
	}

	public int getValor() {
		return valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public String toString() {
		return valor+" de "+palo;
	}

}