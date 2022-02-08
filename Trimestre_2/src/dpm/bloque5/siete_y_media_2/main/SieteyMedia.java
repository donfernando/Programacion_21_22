package dpm.bloque5.siete_y_media_2.main;

import dpm.bloque5.siete_y_media_2.Carta;
import dpm.bloque5.siete_y_media_2.ManoSieteyMedia;
import dpm.bloque5.siete_y_media_2.Mazo;
import dpm.bloque5.siete_y_media_2.Palo;

public class SieteyMedia {
	public static void main(String[] args) {
		// Se crea el mazo y se baraja.
		Mazo mazo = new Mazo();
		mazo.baraja();

		// Se crean el jugador y la banca
		ManoSieteyMedia manoJugUno = new ManoSieteyMedia(mazo, "Frasquito");
		ManoSieteyMedia manoBanca = new ManoSieteyMedia(mazo, "La Máquina");

		// Se reparten las cartas iniciales:
		// una al jugador y una a la banca
		manoJugUno.robaCarta();
		manoBanca.robaCarta();

		// El jugador pide cartas mientras según su estrategia
		while (manoJugUno.cuentaPuntos() <= 5) {
			System.out.printf("%s pide una carta extra\n", manoJugUno.getNombre());
			manoJugUno.robaCarta();
		}

		// La banca se planta si el jugador se ha pasado.
		// En caso contrario pide cartas
		if (manoJugUno.cuentaPuntos() <= 7.5) {
			// el jugador no se ha pasado
			while (manoBanca.cuentaPuntos() < 7.5 && manoBanca.cuentaPuntos() < manoJugUno.cuentaPuntos()) {
				System.out.printf("%s pide una carta extra\n", manoBanca.getNombre());
				manoBanca.robaCarta();
			}
		}
		// Se cuentan los puntos obtenidos y se decide el ganador
		double puntosJ = manoJugUno.cuentaPuntos();
		double puntosB = manoBanca.cuentaPuntos();
		System.out.println();
		if (puntosJ <= 7.5 && (puntosB > 7.5 || puntosJ > puntosB)) {
			System.out.printf(" Gana %s \n %s\n", manoJugUno.getNombre(), manoJugUno + " (" + puntosJ + " puntos)");
			System.out.print("  ...frente a");
			System.out.println(manoBanca + " (" + puntosB + " puntos)");
		} else if (puntosB <= 7.5 && (puntosJ > 7.5 || puntosJ < puntosB )) {
			System.out.printf(" Gana %s \n %s\n", manoBanca.getNombre(), manoBanca + " (" + puntosB + " puntos)");
			System.out.print("  ...frente a");
			System.out.println(manoJugUno + " (" + puntosJ + " puntos)");
		} else {
			System.out.println(" No hay ganador:\n"
					+ manoJugUno + " (" + puntosJ + " puntos)"
					+ manoBanca + " (" + puntosB + " puntos)");
		}
	}
}
