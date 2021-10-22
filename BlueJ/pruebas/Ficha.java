
public class Ficha {
    public String nombre;
    public int edad; 
    
    public void mostrar(){
        System.out.printf("%s tiene %d años\n", nombre, edad);
    }
       
    public void setNombre(String nuevosNombre) {
        nombre = nuevosNombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void cumpleAnio() {
        edad++;
    }

}
