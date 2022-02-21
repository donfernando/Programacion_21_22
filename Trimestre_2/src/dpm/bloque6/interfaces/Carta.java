package dpm.bloque6.interfaces;

import dpm.bloque5.siete_y_media.ValorCartaInvalidaException;

public class Carta implements Comparable<Carta>, Sumable<Carta>{
	private int valor;
	// Aqui Palo pasa a ser un tipo enumerado... y queda igual
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
	
	
	@Override
	public boolean equals(Object obj) {
		boolean igual=false;
		if(this==obj)
			igual=true;
		else if(obj instanceof Carta){
			Carta c = (Carta)obj;
			igual = valor==c.valor && palo.equals(c.palo) ;
		}
		return igual;
	}

	@Override
	public int compareTo(Carta laOtra) {
		return valor-laOtra.valor;
	}
	
	public int suma(Carta carta) {
		return valor+carta.valor;
	}

	
}