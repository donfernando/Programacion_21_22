package dpm.bloque5.siete_y_media_2;

public class Carta {
	private static String[] nombreCarta = {
			"AS","DOS","TRES","CUATRO","CINCO", "SEIS","SIETE","*","*","J","Q","K"};
	private int valor;
	private Palo palo;
	public Carta(int valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public Palo getPalo() {
		return palo;
	}
	@Override
	public String toString() {
		return nombreCarta[valor-1]+" de "+palo;
	}
}
