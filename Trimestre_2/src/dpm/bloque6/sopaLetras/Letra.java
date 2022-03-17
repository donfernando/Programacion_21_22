package dpm.bloque6.sopaLetras;

public class Letra {
	// Si es mayuscula se considerará resaltada
	private char letra;
	
	public Letra(char l) {
		letra = Character.toLowerCase(l);
	}
	public void resaltar() {
		letra = Character.toUpperCase(letra);
	}

	public boolean estaResaltada() {
		return Character.isUpperCase(letra);
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	
	@Override
	public String toString() {
		return Character.toString(letra);
	}
}
