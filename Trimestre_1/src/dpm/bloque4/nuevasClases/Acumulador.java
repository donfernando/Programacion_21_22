package dpm.bloque4.nuevasClases;

public class Acumulador {
	private double valor;
	private StringBuffer exp = new StringBuffer("0");
	
	
	public void mas(double nuevoValor) {		
		if (nuevoValor >= 0) {
			valor = valor + nuevoValor;
			exp.append(String.format(" + %.2f",nuevoValor));
//			exp.append(" + "+nuevoValor);
		}
	}

	public void menos(double nuevoValor) {
		if (nuevoValor >= 0) {
			valor = valor - nuevoValor;
			exp.append(String.format(" - %.2f",nuevoValor));
		}
	}

	public void por(double nuevoValor) {
		valor = valor * nuevoValor;
		exp.append(String.format(" x %.2f",nuevoValor));
	}

	public void entre(double nuevoValor) {
		valor = valor / nuevoValor;
		exp.append(String.format(" / %.2f",nuevoValor));
	}

	public void reset() {
		valor = 0;
		exp.setLength(1);
		//exp.append(0);
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