package dpm.bloque5.siete_y_media;

public class Carta {
	private int valor;
	private Palo palo;
	private static String[] nombreCarta = {
			"AS","DOS","TRES","CUATRO","CINCO", "SEIS","SIETE","*","*","J","Q","K"};

	public Carta(int valor ,Palo palo ) {
		if (valor < 1 | valor > 12 | valor == 8 | valor == 9) {
			throw new ValorCartaInvalidaException("El valor introducido es inválido");
		}
		if(palo==null)
			throw new ValorCartaInvalidaException("El palo introducido es nulo");
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
		return nombreCarta[valor-1]+" de "+palo;
	}

}