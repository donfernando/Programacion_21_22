package iesdomingoperezminik.bloque4;

public class Ficha {
        public String nombre;
        public int edad; 
        
        public void mostrar(){
            System.out.printf("%s tiene %d años\n", nombre, edad);
        }
           
        public void setNombre(String nuevosNombre) {
        	if(nombre==null)
        		nombre = nuevosNombre.toUpperCase();
        }
        public String getNombre() {
            return nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void cumpleAnio() {
            edad++;
        }
}