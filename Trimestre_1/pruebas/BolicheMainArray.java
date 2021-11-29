import java.util.Scanner;

import dpm.bloque4.bolichesCuanticos.Boliche;
import dpm.bloque4.bolichesCuanticos.CajaDeBoliches;

public class BolicheMainArray {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		CajaDeBoliches caja;
		Boliche[] tabla;
		int i, numBol;
		String idBol;

		System.out.print("Qué cantidad de boliches quiere?: ");
		numBol = entrada.nextInt();
		tabla = new Boliche[numBol];

		for (i = 0; i < tabla.length; i++) {
			idBol = "B" + (i + 1);
			tabla[i] = new Boliche(idBol);
		}
		caja = new CajaDeBoliches();
		for (i=tabla.length-1;i>=0;i--) {
			caja.add(tabla[i]);
		}
		System.out.println(caja);
	}

}