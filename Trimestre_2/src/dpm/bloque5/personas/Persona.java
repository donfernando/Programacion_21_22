package dpm.bloque5.personas;

public class Persona {
	public Fecha fechaNac;
	public Nif nif;
	public Nombre nombre;
	
	public Persona(Fecha fechaNac,int numDni,char letraDni,Nombre nombre) {
		this.nif=new Nif(numDni,letraDni);
		this.nombre=nombre;
		this.fechaNac=fechaNac;
	}

	public String toString() {
		return this.nombre+" con DNI "+this.nif+" nació el "+this.fechaNac;
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona)obj;
		return this.nif.getNumero()==p.nif.getNumero();
	}
	
}
