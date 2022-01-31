package dpm.bloque5.herencia;

public class PotenciometroExtra extends Potenciometro {

	public PotenciometroExtra() {
		super(5);
		//super(new float[] {0,5,10,15,20,25});	
		System.out.println("Constructor PotenciometroExtra()");
	}
	public PotenciometroExtra(float[] potencias) {
		super(potencias);
		System.out.println("Constructor PotenciometroExtra(float[])");
	}

	@Override
	public void subir() {
		super.subir();
		super.subir();
	}
	public void subir(int pasos) {
		if (posicionSeleccionada + pasos >= valoresPotencia.length - 1)
			posicionSeleccionada = valoresPotencia.length - 1;
		else
			posicionSeleccionada += pasos;
//		for (int i = 0; i < pasos; i++) {
//			super.subir();
//		}

	}

	public void bajar(int pasos) {
		for (int i = 0; i < pasos; i++) {
			bajar();
		}
	}
}
