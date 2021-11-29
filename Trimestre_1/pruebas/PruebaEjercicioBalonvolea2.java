
import dpm.bloque4.ejercicios.Equipo;
import dpm.bloque4.ejercicios.Jugador;

public class PruebaEjercicioBalonvolea2 {

	public static void main(String[] args) {
		Equipo eqTod, eqLag;
		Jugador libre = new Jugador("Freeman", 1.23f, 5);
		Jugador aux;
		//libre.lesionado=true;
		eqTod=new Equipo("Todoque BV");
		eqLag=new Equipo("Laguna BV");
		eqTod.contratarJugador(new Jugador("Pedrito", 1.67f, 10));
		eqTod.contratarJugador(new Jugador("Rita Top", 1.77f, 1));
		eqTod.contratarJugador(new Jugador("Trinity", 1.56f, 5));
		aux=new Jugador("Juan Chin", 1.70f, 1);
		eqTod.contratarJugador(aux);

		eqLag.contratarJugador(new Jugador("Merche", 1.60f, 10));
		eqLag.contratarJugador(new Jugador("Mr. Topo", 1.45f, 12));
		eqLag.contratarJugador(new Jugador("Oscar", 1.90f, 6));
		
		System.out.println(eqTod);
		eqTod.incrementarPuntosLiga(2);
		eqTod.contratarJugador(libre);
		System.out.println(eqTod);
		
		System.out.println(eqLag);
		eqLag.contratarJugador(libre);
		eqLag.incrementarPuntosLiga(5);
		eqLag.incrementarPuntosLiga(2);
		eqLag.incrementarPuntosLiga(12); // puntos ilegales (fuera del rango de 1 a 9)
		System.out.println(eqLag);
		System.out.println(eqTod);

		
		
		
		
	}
}
