package dpm.bloque4.ejercicios.palOculta;

public class PalabraOculta {
	private String pSecreta;
	private StringBuffer pVisible = new StringBuffer();

	public PalabraOculta(String palabra) {
		pSecreta = palabra;
		pVisible.append(pSecreta.charAt(0));
		for (int i = 1; i < pVisible.length(); i++) {
			if (Character.toUpperCase(pSecreta.charAt(i)) != Character.toUpperCase(pSecreta.charAt(0))) {
				pVisible.append("*");
			} else
				pVisible.append(pSecreta.charAt(i));
		}
	}

	public boolean acertar(char letra) {
		int i = 0;
		boolean exito = false;
		while (i < pSecreta.length()) {
			if (Character.toUpperCase(letra) == Character.toUpperCase(pSecreta.charAt(i))) {
				pVisible.setCharAt(i, pSecreta.charAt(i));
				exito = true;
			}
			i++;
		}
		return exito;
	}

	public String toString() {
		return pVisible.toString();
	}

	public boolean acertada() {
		int i=0;
		while(i < pVisible.length()-1 && pVisible.charAt(i)!='*')
			i++;
		return pVisible.charAt(i)!='*';
	}
}