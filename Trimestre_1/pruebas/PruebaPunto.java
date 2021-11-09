import iesdomingoperezminik.bloque4.contruct.Punto;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto p;
		double x,y;
		x=8;
		y=5;
		p= new Punto(x, y);

		x = 10.0;
		p.desplazar(1, 0);
		p.desplazar(0, -3);
		p.mostrar();
	//	System.out.println("Distancia: "+p.distancia());
	
	}

}
