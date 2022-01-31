package dpm.bloque5.herencia;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana() {
		super("Mi primera ventana");
		setVisible(true);
		setSize(400,200);
	}
	public void paint​(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawString("HOLA", 200,100);
	}
}
