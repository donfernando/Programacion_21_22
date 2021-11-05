package iesdomingoperezminik.bloque4.contruct;

public class AcumuladorReset {
	private double valor;
	private StringBuffer exp;

	public AcumuladorReset() {
		reset(0.0);
		//exp = new StringBuffer(String.format("%.2f",0.0));
	}
	
	public AcumuladorReset(double valorInicial) {
		reset(valorInicial);
		/*
		valor=valorInicial;
		exp = new StringBuffer(String.format("%.2f",valorInicial));
		*/
	}
	
	
	
	public void mas(double nuevoValor) {
		if (nuevoValor >= 0 && exp != null) {
			valor = valor + nuevoValor;
			exp.append(String.format(" + %.2f", nuevoValor));
//			exp.append(" + "+nuevoValor);
		}
	}

	public void menos(double nuevoValor) {
		if (nuevoValor >= 0 && exp != null) {
			valor = valor - nuevoValor;
			exp.append(String.format(" - %.2f", nuevoValor));
		}
	}

	public void por(double nuevoValor) {
		if (exp != null) {
			valor = valor * nuevoValor;
			exp.append(String.format(" x %.2f", nuevoValor));
		}
	}

	public void entre(double nuevoValor) {
		if (exp != null) {
				valor = valor / nuevoValor;
			exp.append(String.format(" / %.2f", nuevoValor));
		}
	}

	public void reset(double valorInicial) {
		exp = new StringBuffer(String.format("%.2f",valorInicial));
		valor = valorInicial;
	}

	public double get() {
		double resul;
		if (exp != null) 
			resul=valor;
		else
			resul=Double.NaN;   // 0.0/0.0;
		return resul;
	}

	public void mostrar() {
		String expresion;
		if (exp != null) {
			expresion = exp + String.format(" = %.2f", valor);
			System.out.println("La expresion completa es: " + expresion);
		}
	}

}