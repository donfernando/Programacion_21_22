

public class Ave extends Animal {
    
    public String colorPlumaje;
    public int longitudDelPico;

    
    public Ave ( String _sexo,
                 short _edad,
                 int _peso,
                 String _especie,
                 String _colorPlumaje,
                 int _longitudDelPico) {
        
        //Con super ejecutamos el constructor de la clase padre: Animal
        super(_sexo, 2, _edad, _peso, _especie);
        
        //Propiedades especificas de Ave
        longitudDelPico = _longitudDelPico;
        
    }//Constructor    
    
    
}//class Ave
