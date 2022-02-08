package dpm.bloque5.siete_y_media_2;

public class ManoSieteyMedia extends Mano {
	public ManoSieteyMedia(Mazo m, String nJugador) {
		super(m, nJugador);
	}
	@Override
	public double cuentaPuntos() {
		double total=0.0;
		int valor;
		for (int i = 0; i < cartas.size(); i++) {
			valor = cartas.get(i).getValor();
			if(valor >= 10)
				total += 0.5;
			else
				total += cartas.get(i).getValor();				
		}
		return total;
	}
}