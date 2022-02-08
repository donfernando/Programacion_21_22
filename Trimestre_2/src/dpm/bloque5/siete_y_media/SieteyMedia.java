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

		if (puntosJ <= 7.5 && (puntosB > 7.5 || puntosJ > puntosB))
			System.out.println("El ganador es el jugador con: " + puntosJ + " frente a los de la banca: " + puntosB);
		else if (puntosB <= 7.5 && (puntosJ > 7.5 || puntosB > puntosJ)) {
			System.out.println("El ganador es la banca con: " + puntosB + " frente a los dejugador: " + puntosJ);
		} else if (puntosB > 7.5 & puntosJ > 7.5) {
			System.out.println("No hay ganador, puntos jugador: " + puntosJ + " puntos banca: " + puntosB);
		} else {
			System.out.println("Empate, puntos jugador: " + puntosJ + " puntos banca: " + puntosB);
		}

		System.out.println("\nJugador: "+jugador + "\nBanca:" + banca);
	}
}
