package dpm.bloque5.personas;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Persona persona;
//		persona = new Persona(new Fecha(5, 12, 2000), 45853744,'R', new Nombre("Francisco Javier", "Dorta Vargas"));
		persona = new Socio(new Fecha(5, 12, 2000), 45853744,'R', new Nombre("Francisco Javier", "Dorta Vargas"),
					new Fecha(12,1,2022),"23333");
		System.out.println(persona);
	}

}
