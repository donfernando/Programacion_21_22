package dpm.bloque4.nuevasClases;


public class ContadorCircular {
	private int valor;
	private int tope=10;
	
	public void setTope(int nuevoTope) {
		if(nuevoTope>=1) {
			tope = nuevoTope;
			valor = 0;
		}
	}
	public void set(int nuevoValor) {
		if(nuevoValor>=0 && nuevoValor <=tope) {
			valor = nuevoValor;
		}
	}
	public int get() {
		return valor;
	}
	public void incrementar() {
		if(valor<tope)
			valor++;
		else
			valor=0;
	}
}
