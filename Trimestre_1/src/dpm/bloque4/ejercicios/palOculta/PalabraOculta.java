package dpm.bloque4.ejercicios.palOculta;

public class PalabraOculta {
	private String palabraOculta;
	private StringBuffer palabraOculta2 = new StringBuffer();

	public PalabraOculta(String palabra) {
		palabraOculta = palabra;
		palabraOculta2.append(palabraOculta.charAt(0));
		for (int i = 1; i < palabraOculta2.length(); i++) {
			if (Character.toUpperCase(palabraOculta.charAt(i)) != Character.toUpperCase(palabraOculta.charAt(0))) {
				palabraOculta2.append("*");
			} else
				palabraOculta2.append(palabraOculta.charAt(i));
		}
	}

	public boolean acertar(char letra) {
		int i = 0;
		boolean acierto = false;
		while (i < palabraOculta.length()) {
			if (Character.toUpperCase(letra) == Character.toUpperCase(palabraOculta.charAt(i))) {
				palabraOculta2.setCharAt(i, palabraOculta.charAt(i));
				acierto = true;
			}
			i++;
		}
		return acierto;
	}

	public String toString() {
		return palabraOculta2.toString();
	}

	public boolean acertada() {
		int i=0;
		while(i < palabraOculta2.length()-1 && palabraOculta2.charAt(i)!='*') {
			i++;
		}
		return palabraOculta2.charAt(i)!='*';
	}
}