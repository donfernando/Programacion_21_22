package iesdomingoperezminik.bloque4.contruct;

public class PuntoPantalla {
	private int x, y;
	private final int TOP_X=1023;
	private final int TOP_Y=767;

	public PuntoPantalla(int pX, int pY) {
		if (pX >= 0 && pY >= 0 && pX <= TOP_X && pY <= TOP_Y) {
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
		else if (xFi > TOP_X)
			xFi = TOP_X;
		if (yFi < 0)
			yFi = 0;
		else if (yFi > TOP_Y)
			yFi = TOP_Y;
		x = xFi;
		y = yFi;
	}

	public double distancia() {
		return Math.sqrt(x * x + y * y);
	}

	public double distancia(PuntoPantalla otro) {
		int dx, dy;
		dx = this.x - otro.x;
		dy = this.y - otro.y;
		double distancia = Math.sqrt(dx * dx + dy * dy);
		return distancia;
	}
	

	
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}

	public void arriba() {
		if (y > 0)
			y -= 1;
	}

	public void abajo() {
		if (y < TOP_Y)
			y += 1;
	}

	public void derecha() {
		if (x < TOP_X)
			x += 1;
	}

	public void izquierda() {
		if (x > 0)
			x -= 1;
	}

}