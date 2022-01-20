
import java.util.Date;
import java.util.Scanner;
import dpm.bloque5.clases.Fecha;

public class PruebaFecha02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Date d= new Date();
		Fecha hoy = new Fecha(d.getDate(), d.getMonth()+1, d.getYear()+1900);
		Fecha fCumple;
		int dia, mes;

		System.out.println("Hoy: "+hoy);
		System.out.println("¿Cuándo es tu cumpleaños?");

		System.out.print("Día: ");
		dia = entrada.nextInt();

		System.out.print("mes: ");
		mes = entrada.nextInt();

		
		fCumple = new Fecha(dia, mes, hoy.getAnio());
		if (hoy.compareTo(fCumple) > 0)
			fCumple = new Fecha(dia, mes, hoy.getAnio()+1);

		System.out.println(fCumple);
		System.out.printf("Faltan %d dias para tu cumpleaños.\n", Fecha.diferencia(hoy, fCumple));

		entrada.close();
	}

}
