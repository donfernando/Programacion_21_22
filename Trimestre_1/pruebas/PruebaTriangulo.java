import dpm.bloque4.contruct.PuntoPantalla;
import dpm.bloque4.contruct.Triangulo;

public class PruebaTriangulo {

	public static void main(String[] args) {
		Triangulo t;
		PuntoPantalla p1,p2,p3;
		p1=new PuntoPantalla(10,10);
		p2=new PuntoPantalla(200,150);
		p3=new PuntoPantalla(150,10);
		
		t = new Triangulo(p1,p2,p3);
		System.out.printf("Perimetro= %.2f",t.perimetro());
		
		p1.arriba();
		
	}

}
