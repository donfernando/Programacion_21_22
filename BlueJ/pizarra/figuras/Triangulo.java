package figuras;

import java.awt.Graphics;
import java.awt.Color;

public class Triangulo extends Figura {
	protected int lado1,lado2,lado3;
	private   int lx,altura;
	public Triangulo(int a, int b, int c, int d, int e) {
	  super(a,b);
	  int elMayor=(c>d & c>e)? c : ((d>e)? d : e );
	  if(elMayor>=(c+d+e-elMayor))
	  	throw new IllegalArgumentException("Los lados del triangulo son imposibles");
	  lado1=c; lado2=d; lado3=e; 
	  lx=(lado2*lado2-lado3*lado3-lado1*lado1)/(2*lado1);
	  altura=(int)Math.sqrt(lado3*lado3-lx*lx); }
	  
	public float area() {return (lado1*altura)/2;}
	public float perimetro() {return lado1+lado2+lado3;}
	public int alto() {return altura;}   // Segun se dibuja
	public int ancho()  {return lado1;}  // esta figura
	public void dibujar(Graphics g) {
	  Color cActual = g.getColor();
	  int[] xPuntos = {posicion.x,
			   posicion.x+lado1,
			   posicion.x+lado1+lx };
	  int[] yPuntos = {posicion.y,
			   posicion.y,
			   posicion.y+altura}; 
	  g.fillPolygon(xPuntos, yPuntos, 3);
	  g.setColor(Color.white);
	  g.drawPolygon(xPuntos, yPuntos, 3);
	  g.setColor(cActual);
	}
};
