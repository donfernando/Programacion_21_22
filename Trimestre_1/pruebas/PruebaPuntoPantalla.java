import dpm.bloque4.contruct.Punto;
import dpm.bloque4.contruct.PuntoPantalla;

public class PruebaPuntoPantalla {

	public static void main(String[] args) {
		Punto p;
		PuntoPantalla pp;
		p= new Punto(8, 12);
		pp= new PuntoPantalla(8, 12);

		p.desplazar(1000, 0);
		p.desplazar(0, -30);
		System.out.println("p: "+p.toString());

		pp.desplazar(1000, 0);
		pp.desplazar(0, -30);
		System.out.println("pp: "+pp.toString());
		
	//	System.out.println("Distancia: "+p.distancia());
	
	}

}
