package iesdomingoperezminik;
import java.util.Scanner;

public class Bisiesto {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		boolean esBisiesto;
		int anio;
		
		
		System.out.println("Dame el año: ");
		anio= entrada.nextInt();
		esBisiesto=  anio%400==0 || anio%4==0 && anio%100!=0;
		System.out.print(anio);
		if(!esBisiesto)
			System.out.print(" no");
		System.out.println(" es bisiesto.");
	}
}
