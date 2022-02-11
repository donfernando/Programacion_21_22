package figuras;

import java.awt.Graphics;
import java.awt.Color;

public class Rombo extends Figura{
  protected int diagonalA,diagonalB;
  
  public Rombo(int x, int y, int c, int d) {
    super(x,y);
    diagonalA=c;
    diagonalB=d;
  }
  public float area(){
  	return (diagonalA*diagonalB)/2;
  }
  
  public float perimetro(){
  	float c1,c2;
  	c1=(diagonalA/2);
  	c2=(diagonalB/2);
  	return 4*(float)Math.sqrt(c1*c1+c2*c2);
  }
  public int alto(){
  	return diagonalA;
  }
  public int ancho(){
  	return diagonalB;
  }
  public void dibujar(Graphics g){
  	int[] xx={posicion.x, posicion.x+(diagonalB/2), posicion.x,           posicion.x-(diagonalB/2)};
  	int[] yy={posicion.y, posicion.y+(diagonalA/2), posicion.y+diagonalA, posicion.y+(diagonalA/2)};
  	Color cActual=g.getColor();
  	g.fillPolygon(xx,yy,xx.length);
	  g.setColor(Color.white);
	  g.drawPolygon(xx,yy,xx.length);
	  g.setColor(cActual);
  }
} 		