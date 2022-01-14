
public class Ficha {
    private String nombre;
    private int edad;
    private static String club = "desconocido";

    public Ficha(String nombre, int edad) {
    if(nombre == null || edad<0 || edad > 125)
            throw new RuntimeException("No es valida una ficha con esto valores");
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void actualizaNombreClub(String club) {
        Ficha.club = club;
    }

    public String toString() {
        String s;
        s = this.nombre + ", " + this.edad + " años, es socio de " + club;
        return s;
    }

}
