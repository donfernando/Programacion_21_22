package iesdomingoperezminik.bloque4.contruct;

public class Punto {
	private double x;
	private double y;

	public Punto(double xIni, double y) {
		x = xIni;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void desplazar(double dx, double dy) {
		x += dx;
		y += dy;
	}

	//imprime en la Salida Estandar
	public void mostrar() {
		System.out.println(toString()); 
	}

	//retorna un resultado String
	public String toString() {
		return "[" + x + "," + y + "]"; 
	}
}