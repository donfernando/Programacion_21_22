package pruebas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

@SuppressWarnings("unused")
public class TiempoEjecucionTipoListas {
	public static void main(String[] args) {
//		ArrayList<Integer> lista = new ArrayList<Integer>(50000);
		LinkedList<Integer> lista = new LinkedList<Integer>();
		int valor;
		for (int i = 1; i <= 50000; i++) {
			lista.add(i);
		}
		long actual = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			valor = lista.get(i);
			//valor = lista.get((int)(Math.random()*50000));
			//lista.add(0,999);
		}
		System.out.printf("Tardó %d mSeg.\n",System.currentTimeMillis() - actual);
	}
}
