package iesdomingoperezminik.bloque4.contruct;

public class PuntoPantalla {
	private int x, y;
	public PuntoPantalla(int pX, int pY) {
		if (pX >= 0 && pY >= 0 && pX <= 1023 && pY <= 767) {
			x = pX;
			y = pY;
		}
	}
	public PuntoPantalla() {
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public void desplazar(int dx, int dy) {
		int xFi, yFi;
		xFi = x + dx;
		yFi = y + dy;
		if (xFi < 0)
			xFi = 0;
		else if (xFi > 1023)
			xFi = 1023;
		if (yFi < 0)
			yFi = 0;
		else if (yFi > 767)
			yFi = 767;
		x = xFi;
		y = yFi;
	}

	/*
	 * public void mostrar() { System.out.println(toString()); }
	 */
	public double distancia() {
		return Math.sqrt(x * x + y * y);
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}

	public void arriba() {
		if (y > 0)
			y -= 1;
	}

	public void abajo() {
		if (y < 767)
			y += 1;
	}

	public void derecha() {
		if (x < 1023)
			x += 1;
	}

	public void izquierda() {
		if (x > 0)
			x -= 1;
	}

}