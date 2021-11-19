
import java.util.ArrayList;

import iesdomingoperezminik.bloque4.ejercicios.Equipo;
import iesdomingoperezminik.bloque4.ejercicios.Jugador;

public class PruebaEjercicioBalonvolea2 {

	public static void main(String[] args) {
		Equipo eqA, eqB;
		eqA=new Equipo("Todoque");
		eqB=new Equipo("Laguna BV");
		
		System.out.println(eqA);
		eqA.incrementarPuntosLiga(2);
		System.out.println(eqA);
		
		System.out.println(eqB);
		eqB.incrementarPuntosLiga(5);
		eqB.incrementarPuntosLiga(2);
		eqB.incrementarPuntosLiga(12); // puntos ilegales (fuera del rango de 1 a 9)
		System.out.println(eqB);

		
	}
}
