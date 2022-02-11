package figuras;
import java.awt.Graphics;
import java.awt.Color;

public class Poligono extends Figura {
	protected int [] puntosX,puntosY;
	private int i;
	public Poligono (int a, int b, int [] px, int [] py){
		super (a,b);
		puntosX=new int[px.length+1];
		puntosY=new int[py.length+1];
		puntosX[0]=a;
		puntosY[0]=b;

		for(i=0; i<px.length;i++){
			puntosX[i+1]=px[i]+a;
			puntosY[i+1]=py[i]+b;
		}
	}
	
	public float area(){return 0.0F;}
	
	public float perimetro(){
		double total,distY,distX;
		distX=Math.abs(puntosX[0]-puntosX[puntosX.length-1]);
		distY=Math.abs(puntosY[0]-puntosY[puntosY.length-1]);
		total=Math.sqrt((distX*distX)+(distY*distY));
		for (i=0;i<puntosY.length-1;i++){
			distX=Math.abs(puntosX[i]-puntosX[i+1]);
			distY=Math.abs(puntosY[i]-puntosY[i+1]);
			total+=Math.sqrt((distX*distX)+(distY*distY));
		}
		return (float)total;
	}
	
	public int alto(){
		int masArriba,masAbajo;
		masArriba=puntosY[0];
		masAbajo=puntosY[0];
		for(i=1;i<puntosY.length;i++)
			if(masArriba>puntosY[i])
				masArriba=puntosY[i];
			else 
				if(masAbajo<puntosY[i])
					masAbajo=puntosY[i];
		return (masAbajo-masArriba); 
	}
	
	public int ancho(){
		int masDerecha,masIzquierda;
		masDerecha=puntosX[0];
		masIzquierda=puntosX[0];
		for(i=1;i<puntosX.length;i++)
			if(masDerecha<puntosX[i])
				masDerecha=puntosX[i];
			else 
				if(masIzquierda>puntosX[i])
					masIzquierda=puntosX[i];
		return (masDerecha-masIzquierda); 

	}
	
	public void dibujar(Graphics g){
		int[] xx=new int[puntosX.length]; 
		int[] yy=new int[puntosY.length];
		int despX,despY;
		int i;
		despX=posicion.x-puntosX[0];
		despY=posicion.y-puntosY[0];

		for(i=0;i<puntosX.length;i++){
			xx[i]=puntosX[i]+despX;
			yy[i]=puntosY[i]+despY;
		}
	  Color cActual=g.getColor();
	  g.fillPolygon(xx,yy,xx.length);
	  g.setColor(Color.white);
	  g.drawPolygon(xx,yy,xx.length);
	  g.setColor(cActual);
	}
}