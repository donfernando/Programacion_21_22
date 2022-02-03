package dpm.bloque5.personas;

import java.time.LocalDate;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	public static String[] nombreMeses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Noviembre", "Diciembre" };

	public static boolean esBisiesto(int anio) {
		boolean esBisiesto;
		esBisiesto = anio % 4 == 0 & anio % 100 != 0 | anio % 400 == 0;
		return esBisiesto;
	}

	public Fecha(int dia, int mes, int anio) {
		setFecha(dia, mes, anio);
	}

	private static boolean fechaValida(int dia, int mes, int anio) {
		if (mes < 1 | mes > 12 | anio == 0 | dia < 1 | dia > 31 | mes < 1) {
			throw new RuntimeException("Fecha inv�lido");
		}

		if ((mes == 4 | mes == 6 | mes == 9 | mes == 11) & dia > 30) {
			throw new RuntimeException("D�a inv�lido");
		}

		if (mes == 2 && !Fecha.esBisiesto(anio) && dia > 28) {
			throw new RuntimeException("Febrero tiene 28 d�as");
		}
		if (mes == 2 && dia > 29) {
			throw new RuntimeException("El a�o es bisiesto, por lo tanto Febrero tiene 29 d�as");
		}
		return true;
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setFecha(int dia, int mes, int anio) {
		fechaValida(dia, mes, anio);
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public void incrementar() {
		if (this.mes == 1 | this.mes == 3 | this.mes == 5 | this.mes == 7 | this.mes == 8 | this.mes == 10) {
			if (this.dia == 31) {
				this.dia = 1;
				this.mes++;
			} else {
				this.dia++;
			}
		} else if (this.mes == 12) {
			if (this.dia == 31) {
				this.dia = 1;
				this.mes = 1;
				this.anio++;
			} else {
				this.dia++;
			}
		} else if (this.mes == 4 | this.mes == 6 | this.mes == 9 | this.mes == 11) {
			if (this.dia == 30) {
				this.dia = 1;
				this.mes++;
			} else {
				this.dia++;
			}
		} else if (this.mes == 2) {
			if (this.dia == 28 & !esBisiesto(this.anio)) {
				this.dia = 1;
				this.mes++;
			} else if (this.dia == 29) {
				this.dia = 1;
				this.mes++;
			} else {
				this.dia++;
			}
		}
	}

	// Resolver que decrementa infinito, hasta a�os negativos
	public void decrementar() {

		if (this.mes == 5 | this.mes == 7 | this.mes == 10 | this.mes == 12) {
			if (this.dia == 1) {
				this.dia = 30;
				this.mes--;
			} else {
				this.dia--;
			}
		} else if (this.mes == 1) {
			if (this.dia == 1) {
				this.dia = 31;
				this.mes = 12;
				if (this.anio > 1)
					this.anio--;
			} else {
				if (this.anio >= 1)
					this.dia--;
			}
		} else if (this.mes == 3) {
			if (this.dia == 1) {
				if (esBisiesto(anio)) {
					this.dia = 29;
					this.mes--;
				} else {
					this.dia = 28;
					this.mes--;
				}
			} else {
				this.dia--;
			}
		} else if (this.mes == 2 | this.mes == 4 | this.mes == 6 | this.mes == 8 | this.mes == 9 | this.mes == 11) {
			if (this.dia == 1) {
				this.dia = 31;
				this.mes--;
			} else {
				this.dia--;
			}
		}
	}

	public static int diferencia(Fecha a, Fecha b) {
		return dias(b) - dias(a);
	}

	private static int dias(Fecha f) {
		int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int numDias, numBisiestos, resto, anioAnteriro, numNoBisiestos;
		final int BISIESTOS_CADA_400 = 97;
		anioAnteriro = f.anio - 1;
		numBisiestos = anioAnteriro / 400 * BISIESTOS_CADA_400;
		resto = anioAnteriro / 400;
		numBisiestos += resto / 4 - resto / 100;
		numNoBisiestos = anioAnteriro - numBisiestos;
		numDias = numBisiestos * 366 + numNoBisiestos * 365;
		if (esBisiesto(f.anio))
			diasPorMes[2] = 29;
		for (int i = 1; i < f.mes; i++) {
			numDias += diasPorMes[i];
		}
		return numDias + f.dia;
	}

	public int compareTo(Fecha fecha) {
		int resultado;
		if (this.anio < fecha.anio) {
			resultado = -1;
		} else if (this.anio == fecha.anio) {
			resultado = 0;
		} else {
			resultado = 1;
		}
		return resultado;
	}
	
	public void diaHoy() {
	LocalDate diaHoy=LocalDate.now();
	this.setFecha(diaHoy.getDayOfMonth(), diaHoy.getMonthValue(),diaHoy.getYear());
	}

	public String toString() {
		String s;
		s = this.dia + " de " + nombreMeses[this.mes - 1] + " de " + this.anio;
		return s;
	}
	@Override
	public boolean equals(Object obj) {
		Fecha f = (Fecha)obj;
		return dia==f.dia & mes==f.mes & anio==f.anio ;
	}
}
