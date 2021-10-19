package iesdomingoperezminik.bloque1;
import java.util.Scanner;

public class Bisiesto {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		boolean noEsBisiesto;
		int anio;
		
		
		System.out.println("Dame el año: ");
		anio= entrada.nextInt();
		noEsBisiesto = !(anio%400==0 || anio%4==0 && anio%100!=0);
		// noEsBisiesto = anio%400!=0 && (anio%4!=0 || anio%100==0);
		System.out.print(anio);
		if(noEsBisiesto)
			System.out.print(" no");
		System.out.println(" es bisiesto.");
	}
}
