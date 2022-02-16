import dpm.bloque5.contenedores.*;

public class PruebaTabla {

	public static void main(String[] args) {
		Tablero<Number> t;
		t = new Tablero<Number>(5,3);
//		t = new TableroCuadrado<Number>(3);
	//	t.set
		System.out.println(t);
		t.set(1, 2, 34);
		t.set(1, 1, 34.34);
		System.out.println(t);
	}

}
