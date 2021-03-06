package dpm.bloque5.herencia;

public class Potenciometro {
	protected float[] valoresPotencia;
	protected int posicionSeleccionada;

	public Potenciometro() {
		this(10);
		System.out.println("Constructor Potenciometro()");
	}

	public Potenciometro(int size) {
		if (size < 2) {
			throw new RuntimeException();
		}
		valoresPotencia = new float[size];
		for (int i = 0; i < valoresPotencia.length; i++) {
			valoresPotencia[i] = i;
		}
	}

	public Potenciometro(float[] potencias) {
		int i = 0;
		System.out.println("Constructor Potenciometro(float[])");
		if (potencias.length < 2) {
			throw new RuntimeException();
		}
		while (i < potencias.length - 2 && potencias[i] < potencias[i + 1]) {
			i++;
		}
		if (potencias[i] >= potencias[i + 1]) {
			throw new RuntimeException("Las potencias no están en orden.");
		}
		this.valoresPotencia = new float[potencias.length];
		for (i = 0; i < potencias.length; i++) {
			this.valoresPotencia[i] = potencias[i];
		}
	}

	// TODO Ejercicio
//	public static float potenciaTotal(Potenciometro[] potenciometros) {
//		potenciometros[3].getPotencia()
//	}
	
	
	
	public void subir() {
		if (posicionSeleccionada < valoresPotencia.length - 1) {
			posicionSeleccionada++;
		}
	}

	public void bajar() {
		if (posicionSeleccionada > 0) {
			posicionSeleccionada--;
		}
	}

	public void apagar() {
		posicionSeleccionada = 0;
	}

	public float getPotencia() {
		return valoresPotencia[posicionSeleccionada];

	}

	public int getPosicion() {
		return posicionSeleccionada;
	}

	public String toString() {
		String s;
		s = "[";
		for (int i = 0; i < posicionSeleccionada; i++) {
			s += valoresPotencia[i] + ", ";
		}
		s += "<" + valoresPotencia[posicionSeleccionada] + ">";
		for (int i = posicionSeleccionada + 1; i < valoresPotencia.length; i++) {
			s += ", " + valoresPotencia[i];
		}
		s += "]";
		return s;
	}
//	public String toString() {
//		String s = "[";
//		int i;
//		for (i = 0; i < posicionSeleccionada; i++) {
//			s += valoresPotencia[i] + ", ";
//		}
//		//potencia seleccionada
//		s += "<"+valoresPotencia[i]+">";
//		if(i<valoresPotencia.length-1)
//			s+=", ";
//		for (i++ ; i < valoresPotencia.length-1; i++) {
//			s += valoresPotencia[i] + ", ";
//		}
//		if(i < valoresPotencia.length)
//			s += valoresPotencia[i];			
//		return s + "]";
//	}

}