
import java.util.ArrayList;

import dpm.bloque4.ejercicios.Jugador;

public class PruebaEjercicioBalonvolea {

	public static void main(String[] args) {
		
		Jugador j1;
		Jugador[] eq;
		ArrayList listaJug;
		listaJug = new ArrayList();
		
		j1= new Jugador("Judit",1.89F,12);
		
		/*
		eq = new Jugador[2];
		eq[0]= new Jugador("Juan",1.5f,10);
		eq[1]= new Jugador("Ana",1.72f,11);
		*/ 
		eq = new Jugador[] {new Jugador("Juan",1.5f,10) , new Jugador("Ana",1.72f,11)};
		listaJug.add(eq[0]);
		listaJug.add(eq[1]);
		listaJug.add(j1);
		listaJug.add(new Jugador("Blasa",1.77F,15));
		
		
		
		
		System.out.println("Nombre primera jugadora: "+j1.getNombre());
		System.out.println("Nombre primera jugadora: "+j1);
		
		
		System.out.println(listaJug);
		
		System.out.println("Mi equipo");
		for (int i = 0; i < eq.length; i++) {
			System.out.println((i+1)+".-\t"+eq[i]);
		}
		
		
		
		
	}

}
