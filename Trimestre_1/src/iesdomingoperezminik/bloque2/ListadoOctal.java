package iesdomingoperezminik.bloque2;

public class ListadoOctal {
	public static void main(String[] args) {
		int A, B, C, valorDecimal;
		valorDecimal=0;
				
		for (A = 0; A <= 7; A++) {
			for (B = 0; B <= 7; B++) {
				for (C = 0; C <= 7; C++) {
					System.out.println(""+ A + B + C + "  ----->  " + valorDecimal);
					//System.out.printf("%d%d%d ---->  %d\n",A,B,C,valorDecimal);
					valorDecimal++;
				}
			}
		}
	}
}