import dpm.bloque6.interfaces.Potenciometro;

public class PruebaPot {

	public static void main(String[] args) {
		Potenciometro p1, p2;
		p1= new Potenciometro(new float[] {0,5,10});
		p2= new Potenciometro(new float[] {0,5,10});
		System.out.println(p1);
		System.out.println(p2);
		//p1.subir();
		p2.subir();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("El menor es..");
		if(p1.compareTo(p2)<0)
			System.out.println(p1);
		else if(p1.compareTo(p2)>0)
			System.out.println(p2);
		else
			System.out.println("Son equivalentes en orden");
		
		if(p1.equals(p2))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
	}

}
