package pq2.conjunto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumeroSimpatico {

	private static boolean valida(String numero) {
		// Se usarán para analizar los cambios de estado desde 0
		final List<Integer> DIGITOS_DESDE_ESTADO_0_A_1 = Arrays.asList(2, 3, 9);
		final List<Integer> DIGITOS_DESDE_ESTADO_0_A_2 = Arrays.asList(6, 7, 8);
		int digito;
		int estado = 0;
		for (int i = 0; i < numero.length(); i++) {
			digito = numero.charAt(i)-'0';
			switch (estado) {
			case 0:
				if (DIGITOS_DESDE_ESTADO_0_A_1.contains(digito))
					estado = 1;
				else if (DIGITOS_DESDE_ESTADO_0_A_2.contains(digito))
					estado = 2;
				break;
			case 1:
				if (digito % 2 != 0)
					estado = 0;
				break;
			case 2:
				if (digito < 5)
					estado = 0;
				else if (digito > 5)
					estado = 1;
				break;
			}
		}
		return estado == 0;
	}

	public static boolean valida(int num) {
		Integer numAbsoluto = Math.abs(num);
		return valida(numAbsoluto.toString());
	}
}