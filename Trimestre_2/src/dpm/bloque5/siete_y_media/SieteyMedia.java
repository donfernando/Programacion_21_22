package dpm.bloque5.siete_y_media;

public class SieteyMedia {
	public static void main(String[] args) {
		// Se crean el mazo, el jugador y la banca
		Mazo mazo = new Mazo();
		mazo.baraja();
		Mano jugador = new ManoSieteyMedia();
		Mano banca = new ManoSieteyMedia();

		// Se reparten las cartas iniciales:
		// Una al jugador y una a la banca
		jugador.agnadeCarta(mazo.daCarta());
		banca.agnadeCarta(mazo.daCarta());

		// El jugador pide cartas mientras según su estrategia
		while (jugador.cuentaPuntos() <= 5) {
			System.out.println("El jugador pide una carta extra");
			jugador.agnadeCarta(mazo.daCarta());
		}

		// La banca se planta si el jugador se ha pasado.
		// En caso contrario pide cartas
		if (jugador.cuentaPuntos() <= 7.5) {
			// el jugador no se ha pasado
			while (banca.cuentaPuntos() < 7.5 && banca.cuentaPuntos() < jugador.cuentaPuntos()) {
				System.out.println("La banca pide una carta extra");
				banca.agnadeCarta(mazo.daCarta());
			}
		}
		// Se cuentan los puntos obtenidos y se decide el ganador
		double puntosJ = jugador.cuentaPuntos();
		double puntosB = banca.cuentaPuntos();

		if (puntosJ <= 7.5 && (puntosB > 7.5 || puntosJ > puntosB)) {

			System.out.println("Gana el jugador con " + jugador + " (" + puntosJ + " puntos) frente a " + banca + " ("
					+ puntosB + " puntos) de la banca");
		} else if (puntosB <= 7.5) {
			System.out.println("Gana la banca con " + banca + " (" + puntosB + " puntos) frente a " + jugador + " ("
					+ puntosJ + " puntos) del jugador");
		} else {
			System.out.println("No hay ganador: Jugador " + jugador + " (" + puntosJ + " puntos) y banca " + banca
					+ " (" + puntosB + " puntos) se han pasado");
		}
	}
}
