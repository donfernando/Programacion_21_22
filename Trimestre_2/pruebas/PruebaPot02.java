import java.util.ArrayList;
import java.util.Arrays;

//import dpm.bloque5.herencia.Potenciometro;
import dpm.bloque6.interfaces.Potenciometro;

public class PruebaPot02 {

	public static void main(String[] args) {
		Potenciometro p1, p2, p3;
		int pos;
		p1= new Potenciometro(new float[] {0,5,10});
		p2= new Potenciometro(new float[] {0,5,10});
		p3= new Potenciometro(new float[] {0,5,15});
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		//p1.subir();
		p2.subir();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		ArrayList<Potenciometro> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		System.out.println(lista);
//		pos = lista.indexOf(new Potenciometro(new float[] {0,5,15}));
		pos = lista.indexOf(p3);
		System.out.println(pos);
		
		
		
		System.out.println("---------");
		Object[] t = null; 
		t = lista.toArray();
		for (int i = 0; i < t.length; i++) {
			System.out.println((i+1)+"---> "+t[i]);
		}
		Arrays.sort(t);
		for (int i = 0; i < t.length; i++) {
			System.out.println((i+1)+"---> "+t[i]);
		}
		
	}

}
