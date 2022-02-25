import dpm.bloque6.interfaces.HojaCalculo;
import dpm.bloque6.interfaces.HojaCalculo_CON_ERRORES;

public class HojaCalculoMain {
	public static void main(String[] args) {
		String tabla = "| ", s = "";
		String tabla2 = "| ";
//		HojaCalculo_CON_ERRORES hojacalculo = new HojaCalculo_CON_ERRORES(4, 6);
//		hojacalculo.rellenarAleatorio();
		HojaCalculo hojacalculo = new HojaCalculo(4, 6);
		hojacalculo.set(1, 1, 10.0);
		hojacalculo.set(1, 2, 20.0/3);
		hojacalculo.set(2, 1, 50.0);
		System.out.println(hojacalculo);

		for (int i = 0; i < hojacalculo.subTotalColumnas().length; i++) {
			double tab = hojacalculo.subTotalColumnas()[i];
			tabla += String.format("%." + HojaCalculo.decimales + "f%s ", tab, " |");
		}

		for (int i = 0; i < hojacalculo.subTotalFilas().length; i++) {
			double tab = hojacalculo.subTotalFilas()[i];
			tabla2 += String.format("%." + HojaCalculo.decimales + "f%s ", tab, " |");
		}
		s += String.format("\nSubtotal Columnas: " + tabla);
		s += String.format("\nSubtotal Filas: " + tabla2);
		s += String.format("\nSuma total de los números del tablero: %." + HojaCalculo.decimales + "f",
				hojacalculo.total());
		System.out.println(s);
	}

}
