package dpm.bloque5.clases;

import java.time.LocalDate;


public class Persona {
	private String nombre;
	private Fecha fechaNacimiento;
	

	
	
	public Persona(String nombre, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int diasParaCumpleanios(Fecha fReferencia){
		Fecha fCumple = new Fecha(fechaNacimiento.getDia(),
				  fechaNacimiento.getMes(),
				  LocalDate.now().getYear());
		if(fCumple.compareTo(fReferencia)<0)
			fCumple = new Fecha(fCumple.getDia(),
								fCumple.getMes(),
								fCumple.getAnio()+1);
			
		return Fecha.diferencia(fReferencia, fCumple);
	}
	@Override
	public String toString() {
		LocalDate ahora= LocalDate.now();
		Fecha fCumple = new Fecha(fechaNacimiento.getDia(),
				  fechaNacimiento.getMes(),
				  ahora.getYear());
		Fecha hoy = new Fecha(ahora.getDayOfMonth(),
							  ahora.getMonthValue(),
							  ahora.getYear());
		int misAnios;
		
		misAnios = ahora.getYear()-fechaNacimiento.getAnio();
		if(fCumple.compareTo(hoy)>0)
			misAnios--;
		
		return String.format("%s tiene unos %d años.\n", nombre, misAnios);
	}
}
