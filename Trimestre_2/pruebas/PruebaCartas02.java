import java.util.ArrayList;
import java.util.Arrays;

import dpm.bloque6.interfaces.Carta;
import dpm.bloque6.interfaces.Palo;

public class PruebaCartas02 {

	public static void main(String[] args) {
		Carta p1, p2, p3;
		int pos;
		p1= new Carta(4,Palo.CORAZON);
		p2= new Carta(1,Palo.PICA);
		p3= new Carta(11,Palo.CORAZON);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		ArrayList<Carta> cartas = new ArrayList<>();
		cartas.add(p1);
		cartas.add(p2);
		cartas.add(p3);
		System.out.println(cartas);
		pos = cartas.indexOf(new Carta(1,Palo.PICA));
//		pos = cartas.indexOf(p3);
		System.out.println(pos);
		
		
		
		System.out.println("---------");
		Object[] t = null; 
		t = cartas.toArray();
		for (int i = 0; i < t.length; i++) {
			System.out.println((i+1)+"---> "+t[i]);
		}
		Arrays.sort(t);
		for (int i = 0; i < t.length; i++) {
			System.out.println((i+1)+"---> "+t[i]);
		}
		
	}

}
