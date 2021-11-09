import iesdomingoperezminik.bloque4.contruct.Punto;
import iesdomingoperezminik.bloque4.contruct.PuntoPantalla;

public class PruebaPuntoPantalla_2 {

	public static void main(String[] args) {
		PuntoPantalla v1;
		PuntoPantalla v2;
		v1= new PuntoPantalla(10, 10);
		v2= new PuntoPantalla(30, 20);

		System.out.println("pp1: "+v1.toString());
		System.out.println("pp2: "+v2.toString());
		System.out.println("distancia entre v1 y v2: "+v1.distancia(v2));
		
		
		
		
	//	System.out.println("Distancia: "+p.distancia());
	
	}

}
