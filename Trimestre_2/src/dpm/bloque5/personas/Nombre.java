package dpm.bloque5.personas;

public class Nombre {
	private String nombre;
	private String apellidos;
	
	public Nombre(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos ;
	}
}
