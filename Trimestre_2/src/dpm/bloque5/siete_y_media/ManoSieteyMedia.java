package dpm.bloque5.siete_y_media;

public class ManoSieteyMedia extends Mano {

	public double cuentaPuntos() {
		double contador = 0;
		for (int i = 0; i < cartasMano.size(); i++) {
			if (cartasMano.get(i).getValor() < 8)
				contador += cartasMano.get(i).getValor();
			else
				contador += 0.5;
		}

		return contador;
	}
}
