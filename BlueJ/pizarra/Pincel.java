// Pincel.java

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import figuras.*;

public class Pincel { 
  private static final int INCREMENTO=5;
  public static int TOP_ARR;
  public static int TOP_ABJ;
  public static int TOP_IZQ;
  public static int TOP_DER;
	
  private Figura punta;
  public boolean pincelActivo;

  public Pincel(Figura forma) {
    this(forma, false);
  }

  public Pincel(Figura forma,boolean activo) {
    pincelActivo=activo;
		punta=forma;
  }
  public void cambiarPunta(Figura forma) {
		forma.posicion.x=punta.posicion.x;
		forma.posicion.y=punta.posicion.y;
		punta=forma;
  }
  

  public void dibujar(Graphics g) {
    if(pincelActivo) 
		punta.dibujar(g); // no se sabe que m�todo concreto se ejecutar�.
    dibujarPaneles(g,10,40);
  }

  private void dibujarPaneles(Graphics g, int xCoord, int yCoord) {
    int xPunta, yPunta;
    Color cActual;

    xPunta=punta.posicion.x;
    yPunta=punta.posicion.y;
    cActual=g.getColor();
    g.setColor(Color.white);
	// Cajas de informacion
    g.fillRect(xCoord,yCoord   ,60,15);
    g.fillRect(xCoord,yCoord+20,250,15);
    g.fillRect(xCoord,yCoord+40,260,15);
    g.fillRect(xCoord,yCoord+60,100,15);
    // Canal de cursores
	g.fillRect(1,1,5,Pincel.TOP_ABJ);
	g.fillRect(1, Pincel.TOP_ABJ-1, Pincel.TOP_DER, 3);
    g.setColor(cActual);
	// Cursores
	g.fillRect(1,yPunta,5,punta.alto());
	g.fillRect(xPunta, Pincel.TOP_ABJ-1, punta.ancho(), 3);
	// Informacion del pincel
    g.drawString("(" + xPunta + "," + yPunta +")",
			xCoord+1,yCoord+11);
    g.drawString("Area de la figura (punta de pincel): "+punta.area(),
			xCoord+1,yCoord+31);
    g.drawString("Perimetro de la figura (punta de pincel): "+punta.perimetro(),
			xCoord+1,yCoord+51);
    if(pincelActivo)
	g.drawString("Pincel Apoyado", xCoord+1,yCoord+71);
    else
	g.drawString("Pincel Levantado", xCoord+1,yCoord+71);
  }

  public void arr() {
    if(punta.posicion.y > TOP_ARR)
	punta.posicion.y -= INCREMENTO;
    else
	punta.posicion.y = TOP_ABJ;
  }

  public void abj() {
    if(punta.posicion.y < TOP_ABJ)
	punta.posicion.y += INCREMENTO;
    else
	punta.posicion.y = TOP_ARR;
  }

  public void izq() {
    if(punta.posicion.x > TOP_IZQ)
	punta.posicion.x -= INCREMENTO;
    else
	punta.posicion.x = TOP_DER;
  }

  public void der() {
    if(punta.posicion.x < TOP_DER)
	punta.posicion.x += INCREMENTO;
    else
	punta.posicion.x = TOP_IZQ;
  }
  public int posicionX() {
    return punta.posicion.x;
  }
  public int posicionY() {
    return punta.posicion.y;
  }
}