
public class Mamifero extends Animal {
	
	public String colorPelo;
	public boolean tieneDientes = true;
	
	public Mamifero ( String _sexo,
				      int _numeroPatas,
				      short _edad,
				      int _peso,
				      String _especie,
				      String _colorPelo,
				      boolean _tieneDientes ) {
		
		//Con super ejecutamos el constructor de la clase padre: Animal
		super(_sexo, _numeroPatas, _edad, _peso, _especie);
		
		//Propiedades especificas de Mamifero
		colorPelo = _colorPelo;
		tieneDientes = _tieneDientes;
		
	}//Constructor

}//class Mamifero