public class Mujer extends Persona {
	
	public boolean embarazada = false;

	public Mujer (  int _numeroPatas,
				    short _edad,
				    int _peso,
				    String _especie,
				    String _colorPelo,
				    boolean _tieneDientes,
				    boolean _estaCasado,
				    boolean _embarazada ) {
		
		//Con super ejecutamos el constructor de la clase padre: Persona
		super("F", _numeroPatas, _edad, _peso, 
			  _especie, _colorPelo, _tieneDientes, _estaCasado);

		//Propiedades especificas de Mujer
		embarazada = _embarazada;
			  
	}//Constructor

}//class Mujer