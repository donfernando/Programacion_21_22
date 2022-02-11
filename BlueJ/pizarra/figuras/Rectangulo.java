package figuras;

import java.awt.Graphics;
import java.awt.Color;

public class Rectangulo extends Figura {
	protected int lado1, lado2;
	public Rectangulo(int a,int b,int c,int d) {
	  super(a,b);
	  lado1=c;
	  lado2=d; }
	public float area() {return lado1*lado2;}
	public float perimetro() {return lado1*2+lado2*2;}
	public int alto() {return lado2;}   // Segun se dibuja
	public int ancho()  {return lado1;} // esta figura
	public void dibujar(Graphics g) {
	  Color cActual=g.getColor();
	  g.fillRect(posicion.x,posicion.y,lado1,lado2);
	  g.setColor(Color.white);
	  g.drawRect(posicion.x,posicion.y,lado1,lado2);
	  g.setColor(cActual);
	}
};
