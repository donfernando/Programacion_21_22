import dpm.bloque4.nuevasClases.Acumulador;

public class PruebaObjAcumulador {
	public static void main(String[] args) {
		Acumulador misApuntes;
		misApuntes = new Acumulador();
		misApuntes.mas(0.5);
		misApuntes.mostrar();
		misApuntes.por(4);
		misApuntes.mostrar();
		misApuntes.entre(3);
		misApuntes.mostrar();
	}
}