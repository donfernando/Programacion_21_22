package figuras;

import java.awt.Point;
import java.awt.Graphics;

public abstract class Figura {
	public Point posicion;
	public Figura(int a, int b) {
		posicion= new Point(a,b);}
	abstract public float area();
	abstract public float perimetro();
	abstract public int alto();
	abstract public int ancho();
	abstract public void dibujar(Graphics g);
};

