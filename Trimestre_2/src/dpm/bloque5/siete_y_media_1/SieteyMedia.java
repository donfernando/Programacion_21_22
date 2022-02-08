package dpm.bloque5.siete_y_media_1;

import java.util.Scanner;

public class SieteyMedia {
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double riesgoDeJuego = (Math.random()*2.1)+4;

		// Se crean el mazo, el jugador y la banca
		Mazo mazo = new Mazo();
		mazo.baraja();
		ManoSieteyMedia jugador = new ManoSieteyMedia();
		ManoSieteyMedia banca = new ManoSieteyMedia();

		// Se reparten las cartas iniciales:
		// Una a la banca
		banca.agnadeCarta(mazo.daCarta());

		// La banca pide cartas mientras según su estrategia
		while (banca.cuentaPuntos() <= riesgoDeJuego) {
			System.out.println("La banca pide carta extra");
			banca.agnadeCarta(mazo.daCarta());
		}

		// El jugador juega
		System.out.println("La banca tiene " + banca.cuentaPuntosVisible() + " puntos visibles sobre el tablero.");
		System.out.printf("en %d cartas ...más su carta oculta.\n",banca.numeroCartas()-1);
		System.out.print("Ve respondiendo si quieres más cartas..\n- ");
		do{
			jugador.agnadeCarta(mazo.daCarta());
			System.out.println(jugador+"...llevas: " + jugador.cuentaPuntos());
			System.out.print("- ");
		} while(entrada.nextBoolean());
		System.out.println();
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

		System.out.println(jugador + "\n" + banca);

	}
}
