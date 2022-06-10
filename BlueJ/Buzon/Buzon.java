 

public class Buzon {
    private static Buzon buzon;
    private Object[][] casillas = new Object[TAMANIO][TAMANIO];
    final static int TAMANIO = 10;

    private Buzon() { // privado para que no se puede acceder
    }

    public static Buzon getBuzon() {
        if (buzon == null) {
            buzon = new Buzon();
        } // Modelo de singleton
        return buzon; // Se ejecuta solo si no existe un buzón
    }

    public Object get(int f, int c) {
        Object aux = casillas[f][c];
        casillas[f][c] = null;
        return aux;
    }

    public void set(int f, int c, Object o) {
        if (casillas[f][c] != null) {
            throw new BuzonRuntimeException();
        }
        casillas[f][c] = o;
    }
}