package ejerc3;

import base.LadosIlegalesException;
import base.Triangulo;

public class MiTriangulo extends Triangulo {
	private MiTriangulo(int a, int b, int c) {
		super(a, b, c);
	}

	public static MiTriangulo equilatero(int a) {
		return escaleno(a, a, a);
//		try {
//			return new MiTriangulo(a, a, a);
//		} catch (LadosIlegalesException e) {
//			return null;
//		}
	}
	public static MiTriangulo isosceles(int a, int b) {
		return escaleno(a, a, b);
//		try {
//			return new MiTriangulo(a, a, b);
//		} catch (LadosIlegalesException e) {
//			return null;
//		}
	}
	public static MiTriangulo escaleno(int a, int b, int c) {
		try {
			return new MiTriangulo(a, b, c);
		} catch (LadosIlegalesException e) {
			return null;
		}
	}
}
