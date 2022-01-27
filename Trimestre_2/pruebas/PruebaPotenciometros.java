import dpm.bloque5.herencia.Potenciometro;
import dpm.bloque5.herencia.PotenciometroExtra;

public class PruebaPotenciometros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Potenciometro potenciometro = new PotenciometroExtra();
//		PotenciometroExtra potenciometro = new PotenciometroExtra();
		PotenciometroExtra potenciometro = new PotenciometroExtra(new float[] {0,10,20,35,60,80,100,120});

		System.out.println(potenciometro);
		potenciometro.subir();
		potenciometro.subir();
//		System.out.println(potenciometro);
//		potenciometro.subir(2);
		System.out.println(potenciometro);
		potenciometro.bajar();
		System.out.println(potenciometro);
		potenciometro.apagar();
		System.out.println(potenciometro);
	}

}
