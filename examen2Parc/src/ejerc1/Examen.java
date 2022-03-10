package ejerc1;

import java.awt.Point;

public class Examen {
	public static double[][] getZona(Point p1, Point p2, double[][] datos) throws IndicesNoValidosException {
		int fDesde,fHasta;
		int cDesde,cHasta;
		int f,f2,c,c2;
		if(p1.x<0 || p1.y<0 || p1.x > p2.x || p1.y > p2.y  ||
		   p2.x >= datos.length || p2.y >= datos[0].length)		
			throw new IndicesNoValidosException();
		fDesde=p1.x;
		fHasta=p2.x;
		cDesde=p1.y;
		cHasta=p2.y;
		double [][] nueva = new double[fHasta-fDesde+1][cHasta-cDesde+1];
		for (f = fDesde,f2=0; f <= fHasta; f++, f2++) {
			for (c = cDesde, c2 = 0; c <= cHasta; c++, c2++) {
				nueva[f2][c2] = datos[f][c];
			}
		}
		return nueva;
	}
}
