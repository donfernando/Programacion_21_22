package ejerc3;

import base.LadosIlegalesException;
import base.Triangulo;

public class MiTriangulo extends Triangulo {
	private MiTriangulo(double a, double b, double c) {
		super(a, b, c);
	}

	public static MiTriangulo equilatero(double a) {
		return escaleno(a, a, a);
//		try {
//			return new MiTriangulo(a, a, a);
//		} catch (LadosIlegalesException e) {
//			return null;
//		}
	}
	public static MiTriangulo isosceles(double a, double b) {
		return escaleno(a, a, b);
//		try {
//			return new MiTriangulo(a, a, b);
//		} catch (LadosIlegalesException e) {
//			return null;
//		}
	}
	public static MiTriangulo escaleno(double a, double b, double c) {
		try {
			return new MiTriangulo(a, b, c);
		} catch (LadosIlegalesException e) {
			return null;
		}
	}
}
