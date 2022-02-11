package figuras;

import java.awt.Graphics;
import java.awt.Color;

public class Elipse extends Figura {
	public final static float PI=3.1415F;
	protected int dMenor,dMayor;
	public Elipse(int a, int b, int c, int d) {
	  super(a,b);
	  dMenor=c;
	  dMayor=d; }
	public float area() {return PI * dMenor * dMayor;}
	public float perimetro() {return PI*(dMenor+dMayor);}
	public int alto() {return dMayor;}   // Segun se dibuja
	public int ancho()  {return dMenor;} // esta figura
	public void dibujar(Graphics g) {
	  Color cActual=g.getColor();
	  g.fillOval(posicion.x,posicion.y,dMenor,dMayor);
	  g.setColor(Color.white);
	  g.drawOval(posicion.x,posicion.y,dMenor,dMayor);
	  g.setColor(cActual);
	}
};
