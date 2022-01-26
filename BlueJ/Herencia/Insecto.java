public class Insecto extends Animal {
	
	public byte numeroDeAlas;
	
	public Insecto ( String _sexo,
				     int _numeroPatas,
				     short _edad,
				     int _peso,
				     String _especie,
				     byte _numeroDeAlas ) {
		
		//Con super ejecutamos el constructor de la clase padre: Animal
		super(_sexo, _numeroPatas, _edad, _peso, _especie);
		
		//Propiedades especificas de Insecto
		numeroDeAlas = _numeroDeAlas;
		
	}//Constructor
	
}//class Insecto
