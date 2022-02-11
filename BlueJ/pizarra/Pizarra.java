import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import figuras.*;

public class Pizarra extends JFrame{
  public static final int CIRCULO=1;
  public static final int ELIPSE=2;
  public static final int CUADRADO=3;
  public static final int RECTANGULO=4;
  public static final int TRIANGULO=5;
  public static final int ROMBO=6;
  public static final int POLIGONO=7;
  public static final int LOGOOLIMPICO=8;
  public static void main(String [] arg) {
		new Pizarra();
   }

  private final int ESP=32;
  private final int ESC=27;
  private final int ARR=38;
  private final int ABJ=40;
  private final int IZQ=37;
  private final int DER=39;

  Pincel p;

  Pizarra() {
	System.out.println("");
	System.out.println("____________________________________________________________________");
	System.out.println("Dibuja con las flechas del teclado arrastrando figuras geom�tricas");
	System.out.println();
	System.out.println("Para cambiar de figura puedes pulsar en cualquier momento");
	System.out.println();
	System.out.println("___________________________");
	System.out.println("	1 .....Circulo");
	System.out.println("	2 .....Elipse");
	System.out.println("	3 .....Cuadrado");
	System.out.println("	4 .....Rectangulo");
	System.out.println("	5 .....Triangulo");
	System.out.println("	6 .....Rombo");
	System.out.println("	7 .....Poligono");
	System.out.println("	8 .....Logo Olimpico");
	System.out.println("___________________________");
	System.out.println("la barra espaciadora levanta o apoya el pincel grafico en la pizarra");
	System.out.println("____________________________________________________________________");

	Pincel.TOP_ARR=10;
	Pincel.TOP_IZQ=5;
	Pincel.TOP_ABJ=345;
	Pincel.TOP_DER=445;
	p=new Pincel(new Circulo(50,150,40),true);

	//valores de inicializacion de la ventana del programa.
	//*****************************************************
	setSize(Pincel.TOP_DER+5,Pincel.TOP_ABJ+5);
	setResizable(false);
	setLocation(1,1);

	// hace visible la ventana.
  setVisible(true);

	addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0); 
	}
	});  // add window listener
    addKeyListener(new KeyAdapter() {
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case IZQ:p.izq();
					 break;
			case DER:p.der();
					 break;
			case ARR:p.arr();
					 break;
			case ABJ:p.abj();
					 break;
			case ESP:p.pincelActivo=!p.pincelActivo;
					 break;
			case ESC:System.exit(0);
					 break;
			case CIRCULO+48: p.cambiarPunta(new Circulo(0,0,20));
									break;
			case ELIPSE+48:  p.cambiarPunta(new Elipse(0,0,20,40));
									break;
			case CUADRADO+48: p.cambiarPunta(new Cuadrado(0,0,20));
									 break;
			case RECTANGULO+48:	p.cambiarPunta(new Rectangulo(0,0,20,40));
										break;
			case TRIANGULO+48:	p.cambiarPunta(new Triangulo(0,0,20,12,18));
										break;
			case ROMBO+48:	p.cambiarPunta(new Rombo(0,0,20,12));
										break;
			case POLIGONO+48:	int[] xx={10,45,23,12},yy={10,12,34,30};
										p.cambiarPunta(new Poligono(0,0,xx,yy));
										break;
			case LOGOOLIMPICO+48:	p.cambiarPunta(new LogoOlimpico(0,0,30));
										break;
		};
		p.dibujar(getGraphics());
	}
	});  // add key listener
  }

  public void paint(Graphics g) {
		super.paint(g);
		p.dibujar(g);
  }
};
