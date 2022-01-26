
public class Hombre extends Persona {
	
	public Hombre (  String _sexo,
				     int _numeroPatas,
				     short _edad,
				     int _peso,
				     String _especie,
				     String _colorPelo,
				     boolean _tieneDientes,
				     boolean _estaCasado ) {
		
		//Con super ejecutamos el constructor de la clase padre: Persona
		super(_sexo, _numeroPatas, _edad, _peso, 
			  _especie, _colorPelo, _tieneDientes, _estaCasado);
		
	}//Constructor	
	
}//class Hombre

