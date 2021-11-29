
package dpm.bloque2;

import java.util.Scanner;

public class TareaStrings {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, cont1, cont2;
		String exp1, exp2, expresion, ext1, ext2, expact;
		StringBuffer sbtotal;

		//Anidando expresiones con y sin Buffer
		System.out.println("Escribe la primera expresion: ");
		exp1 = entrada.nextLine();
		System.out.println("Escribe la segunda expresion: ");
		exp2 = entrada.nextLine();

		expresion = exp1 + "+" + exp2;
		System.out.println("La expresion completa es: " + expresion);

		sbtotal = new StringBuffer(exp1);
		sbtotal.append('+');
		sbtotal.append(exp2);
		System.out.println("La expresión completa es: " + sbtotal);

//Insertando parentesis en las expresiones con y sin Buffer

		cont1 = exp1.length();
		cont2 = exp2.length();
		x = expresion.length();

		sbtotal.insert(x, ')');
		sbtotal.insert(cont1 + 1, '(');
		sbtotal.insert(cont1, ')');
		sbtotal.insert(0, '(');
		System.out.println("La expresión con parentesis con StringBuffer es: " + sbtotal);

		ext1 = '(' + expresion.substring(0, cont1) + ')';
		ext2 = '(' + expresion.substring(x - cont2) + ')';
		expact = ext1 + '+' + ext2;
		System.out.println("La expresión con parentesis con String es: " + expact);

		entrada.close();
	}

}
