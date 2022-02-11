package figuras;

import figuras.Rectangulo;

import java.awt.Graphics;
import java.awt.Color;

public class RectanguloColoreado extends Rectangulo{
	Color fondo;
	
	public RectanguloColoreado(int a,int b,int l1,int l2, Color c) {
	  super(a,b,l1,l2);
	  fondo=c;
	}
		
	public void dibujar(Graphics g) {
	  Color cActual=g.getColor();
	  g.setColor(fondo);
	  g.fillRect(posicion.x,posicion.y,lado1,lado2);
	  g.setColor(Color.white);
	  g.drawRect(posicion.x,posicion.y,lado1,lado2);
	  g.setColor(cActual);
	  
	}
}