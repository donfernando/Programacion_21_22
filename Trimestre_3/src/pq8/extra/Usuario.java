package pq8.extra;

public class Usuario {
	String nombre;
	Buzon buzon;
	
	public Usuario(String n) {
		nombre = n;
	}

	public void mensaje(int f, int c, Object o) {
		if(buzon.casillas[f][c]==null) {
			buzon.casillas[f][c]= o;
		} else {
			throw new BuzonRuntimeException();
		}
	}
	
	public void print(int f, int c) {
		String s = "No hay ningún elemento en esa casilla";
		if(buzon.casillas[f][c]!=null)
			s = buzon.casillas[f][c].toString();
		System.out.println(s);
	}
} 