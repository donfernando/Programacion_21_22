
public class Ficha {
        private String nombre;
        private int edad; 
        
        public void mostrar(){
            System.out.printf("%s tiene %d años\n", nombre, edad);
        }
           
        public void setNombre(String nuevoNombre) {
        	if(nombre==null)
        		nombre = nuevoNombre.toUpperCase();
        }
        public String getNombre() {
            return nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int nuevaEdad) {
        	if(nuevaEdad>=0 && nuevaEdad < 120)
        		edad=nuevaEdad;
        }
        public void cumpleAnio() {
            if(edad<119)
                edad++;
        }
}
