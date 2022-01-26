
import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import dpm.bloque5.clases.Fecha;

public class PruebaAtraparErrores02{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		LocalDate ahora= LocalDate.now();
		boolean peticionCompletada=false;
		int intentos=0;
		final int INTENTOS_PERMITIDOS=3;
		Fecha hoy;
		Fecha fCumple;
		int dia, mes;
		hoy = new Fecha(ahora.getDayOfMonth(), 
		          ahora.getMonthValue(),
		          ahora.getYear());			
		System.out.println("Hoy: "+hoy);
		do {
			try {
				System.out.println("¿Cuándo es tu cumpleaños?");
				System.out.print("Día: ");
				dia = entrada.nextInt();
				System.out.print("mes: ");
				mes = entrada.nextInt();

				fCumple = new Fecha(dia, mes, hoy.getAnio());
				if (hoy.compareTo(fCumple) > 0)
					fCumple = new Fecha(dia, mes, hoy.getAnio() + 1);
				System.out.println(fCumple);
				System.out.printf("Faltan %d dias para tu cumpleaños.\n", Fecha.diferencia(hoy, fCumple));
				peticionCompletada=true;
			} catch (InputMismatchException e) {
				System.out.println("Los datos de tu cumpleaños deben facilitarse en forma numérica.");
				entrada.nextLine();
				intentos++;
			} catch (RuntimeException e) {
				System.out.println("La fecha aportada no es válida.");
				intentos++;
			} 
		} while (!peticionCompletada && intentos < INTENTOS_PERMITIDOS);
		if(!peticionCompletada)
			System.out.println("TORPEEEE !!!");
		
		entrada.close();
	}

}
