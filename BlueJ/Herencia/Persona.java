public class Persona extends Mamifero {
    
    public boolean estaCasado = false;
    
    public Persona (  String _sexo,
                      short _edad,
                      int _peso,
                      String _especie,
                      String _colorPelo,
                      boolean _tieneDientes,
                      boolean _estaCasado ) {
        
        //Con super ejecutamos el constructor de la clase padre: Mamifero
        super(_sexo, 2, _edad, _peso,
              _especie, _colorPelo, _tieneDientes);
        
        //Propiedades especificas de Persona
        estaCasado = _estaCasado;
    
    }//Constructor

}//class Persona
