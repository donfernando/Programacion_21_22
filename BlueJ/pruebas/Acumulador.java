public class Acumulador {
	private double valor;
	private String exp = "0";

	public void mas(double nuevoValor) {
		if (nuevoValor >= 0) {
			valor = valor + nuevoValor;
			exp = exp + String.format(" + %.2f",nuevoValor);
		}
	}

	public void menos(double nuevoValor) {
		if (nuevoValor >= 0) {
			valor = valor - nuevoValor;
			exp = exp + String.format(" - %.2f",nuevoValor);
		}
	}

	public void por(double nuevoValor) {
		valor = valor * nuevoValor;
		exp = exp + String.format(" x %.2f",nuevoValor);
	}

	public void entre(double nuevoValor) {
		valor = valor / nuevoValor;
		exp = exp + String.format(" / %.2f",nuevoValor);
	}

	public void reset() {
		valor = 0;
		exp = "0";
	}

	public double get() {
		return valor;
	}

	public void mostrar() {
		String expresion;
		expresion = exp + String.format(" = %.2f",valor);
		System.out.println("La expresion completa es: " + expresion);
	}

}