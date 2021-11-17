
import java.util.ArrayList;
import iesdomingoperezminik.bloque4.ejercicios.Jugador;

public class PruebaEjercicioBalonvolea {

	public static void main(String[] args) {
		
		Jugador j1;
		Jugador[] eq;
		ArrayList eq1;
		eq1 = new ArrayList();
		
		j1= new Jugador("Judit",1.89F,12);
		
		/*
		eq = new Jugador[2];
		eq[0]= new Jugador("Juan",1.5f,10);
		eq[1]= new Jugador("Ana",1.72f,11);
		*/ 
		eq = new Jugador[] {new Jugador("Juan",1.5f,10) , new Jugador("Ana",1.72f,11)};
		eq1.add(eq[0]);
		eq1.add(eq[1]);
		eq1.add(j1);
		eq1.add(new Jugador("Blasa",1.77F,15));
		
		
		
		
		System.out.println(j1.getNombre());
		System.out.println(eq[1]);
		System.out.println(eq1);
		
		System.out.println("Mi equipo");
		for (int i = 0; i < eq.length; i++) {
			System.out.println("\t"+eq[i]);
		}
		
		
		
	}

}
