package iesdomingoperezminik.bloque4.bolichesCuanticos;

import java.awt.Color;
import java.util.Random;

public class Boliche {

	private float peso;
	private Color color;
	private String nombre;

	public Boliche(String bNombre) {
		nombre = bNombre;
	}

	public float getPeso() {
		Random rand;
		if (this.peso == 0) {
			this.color = null;
			rand = new Random();
			this.peso = 50 + (200*rand.nextFloat());
		}
		return peso;
	}

	public Color getColor() {
		Random rand;
		int r, g, b;
		if (color == null) {
			this.peso = 0;
			rand = new Random();
			r = rand.nextInt(256);
			g = rand.nextInt(256);
			b = rand.nextInt(256);
			color = new Color(r, g, b);
		}
		return color;
	}

	public String toString() {
		String miPeso, miColor;
		if (peso == 0) {
			miPeso = "peso: indeterminado";
		} else
			miPeso = String.format("peso: %.2f gr.",peso);
		if (color == null) {
			miColor = "color: indeterminado";
		} else
			miColor = "color: [R:" + color.getRed()+",G:"+color.getGreen()+",B:"+color.getBlue()+"]";
		return String.format("%s(%s,%s)",nombre,miPeso,miColor);
	}
}