package dpm.bloque5.personas;


public class Socio extends Persona{
	private Fecha fechaAlta;
	private String codigoSoc;
	
	public Socio(Fecha fechaNac,int numDni,char letraDni,Nombre nombre,
					Fecha fechAlta, String codSocio) {
		super(fechaNac,numDni,letraDni,nombre);
		this.fechaAlta=fechAlta;
		codigoSoc=codSocio;
	}
	public Fecha getFechaAlta() {
		return fechaAlta;
	}

	public String getCodigoSoc() {
		return codigoSoc;
	}
	
	@Override
	public String toString() {

		return super.toString()+"\nSocio: "+codigoSoc+" (desde "+fechaAlta+")";
	}

	
	
}


