
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import dpm.bloque5.clases.Fecha;

public class PruebaAtraparErrores01{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Date d= new Date();
		Fecha hoy = new Fecha(d.getDate(), d.getMonth()+1, d.getYear()+1900);
		Fecha fCumple;
		int dia, mes;

		System.out.println("Hoy: "+hoy);
		System.out.println("¿Cuándo es tu cumpleaños?");

		try {
			System.out.print("Día: ");
			dia = entrada.nextInt();
			System.out.print("mes: ");
			mes = entrada.nextInt();
			
			fCumple = new Fecha(dia, mes, hoy.getAnio());
			if (hoy.compareTo(fCumple) > 0)
				fCumple = new Fecha(dia, mes, hoy.getAnio()+1);
			System.out.println(fCumple);
			System.out.printf("Faltan %d dias para tu cumpleaños.\n", Fecha.diferencia(hoy, fCumple));
		} catch (InputMismatchException e) {
			System.out.println("Los datos de tu cumpleaños deben facilitarse en forma numérica.");
		} catch (RuntimeException e) {
			System.out.println("La fecha aportada no es válida.");
		}

		entrada.close();
	}

}
