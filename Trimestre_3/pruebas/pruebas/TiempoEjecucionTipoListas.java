package pruebas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TiempoEjecucionTipoListas {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
//		LinkedList<Integer> lista = new LinkedList<Integer>();
		int maximo = 49999, minimo = 1, acum;
		Random aleatorio = new Random();

		for (int i = 1; i <= 50000; i++) {
			lista.add(i);
		}
		long actual = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			acum = lista.get(i);
			//acum = lista.get(aleatorio.nextInt(50000));
		}
		System.out.println(System.currentTimeMillis() - actual);
	}
}
