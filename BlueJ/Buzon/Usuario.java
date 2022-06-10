 

public class Usuario {
    private String nombre;
    private Buzon buzon;
    
    public Usuario(String n) {
        nombre = n;
        buzon = Buzon.getBuzon();
    }

    public void mensaje(int f, int c, Object o) {
        buzon.set(f,c,o);
    }
    
    public void print(int f, int c) {
        Object s;
        s= buzon.get(f,c);
        if(s==null)
            s = "No hay ningún elemento en esa casilla";
        System.out.println(s);
    }
} 