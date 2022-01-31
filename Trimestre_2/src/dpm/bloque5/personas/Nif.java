package dpm.bloque5.personas;


public class Nif {
	private int numero;
	private  char letra = ' ';
	private char lista[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			'H', 'L', 'C', 'K', 'E' };

	public Nif(int numero,char letra) {
		int validacion;
		char letra2;
		validacion = numero % 23;
		letra2 = this.lista[validacion];
		
		if (Character.toUpperCase(letra) == letra2) {
			this.numero = numero;
			this.letra = Character.toUpperCase(letra);
		} else
			throw  new RuntimeException();
	}

	public int getNumero() {
		return this.numero;
	}

	public char getLetra() {
		return this.letra ;
	}

	public String toString() {
		String s;
		s = "" + this.numero + this.letra;
		return s;
	}

}
