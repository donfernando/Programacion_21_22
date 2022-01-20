

import dpm.bloque5.clases.Fecha;
import dpm.bloque5.clases.Persona;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona p = new Persona("Luisa",new Fecha(20,2,1997));
		Fecha hoy = new Fecha(20,1,2022);
		System.out.printf("%s, solo faltan %d días para tu cumple.\n",
				p.getNombre(),p.diasParaCumpleanios(hoy));
	}

}
