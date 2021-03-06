package dpm.bloque5.siete_y_media;

import java.util.ArrayList;

public abstract class Mano {
	private static final int TOPE = 20;
	protected ArrayList<Carta> cartasMano;

	public Mano() { 
		this(10);
	}

	public Mano(int numCartas) {
	if(numCartas > TOPE )
		throw new TopeCartasExcedidoException("Numero de cartas no valido");
	cartasMano = new ArrayList<>(numCartas);
	}

	public void descartaTodas() {
		cartasMano.clear();
	}

	public void agnadeCarta(Carta c) {
	if(cartasMano.size() == TOPE)
		throw new TopeCartasExcedidoException("Numero de cartas no valido");
	cartasMano.add(c);
	}

	public int numeroCartas() {
	return cartasMano.size();
	}

	public abstract double cuentaPuntos();

	public String toString() {
	return cartasMano.toString()+"\n";
	}}
