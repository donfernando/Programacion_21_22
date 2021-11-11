package iesdomingoperezminik.bloque4.contruct;

public class Triangulo {
	private PuntoPantalla v1,v2,v3;
	public Triangulo(PuntoPantalla v1,
			 		 PuntoPantalla v2,
			 		 PuntoPantalla v3) {
		this.v1 = new PuntoPantalla(v1.getX(),v1.getY());
		this.v2 = v2;
		this.v3 = v3;
	}
	public double perimetro() {
		double perim;
		perim = v1.distancia(v2);
		perim+= v3.distancia(v2);
		perim+= v1.distancia(v3);
		return perim;
	}
	
	
}
