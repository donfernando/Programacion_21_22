package pq2.listas;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class Ejercicios {
	static final int NUM_FILAS=8;
	static final int NUM_COLUM=8;
	private static Point[] desplCaballo = { new Point(2, 1), new Point(2, -1), new Point(-2, 1), new Point(-2, -1),
			new Point(1, 2), new Point(1, -2), new Point(-1, 2), new Point(-1, -2) };

	public static List<Point> saltoCaballo(Point p) {
		ArrayList<Point> l = new ArrayList<>();
		if (!dentroTablero(p))
			throw new NullPointerException();
		for (int i = 0; i < desplCaballo.length; i++) {
			Point aux = new Point(desplCaballo[i].x + p.x , desplCaballo[i].y + p.y);
			if(dentroTablero(aux))
				l.add(aux);
		}
		return l;
	}
	private static boolean dentroTablero(Point p) {
		return (p.x >= 0 && p.x < NUM_FILAS && p.y >= 0 && p.y < NUM_COLUM);
	}

	public static int totalizar(List<Integer> l) {
		int tot = 0;
		int i;
		if (l instanceof RandomAccess)
			for (i = 0; i < l.size(); i++) {
				tot += l.get(i);
			}
		else {
			Iterator<Integer> it;
			it = l.iterator();
			while (it.hasNext())
				tot += it.next();
		}

		return tot;
	}

	public static int totalizar(Iterator<Integer> i) {
		int tot = 0;
		while (i.hasNext())
			tot += i.next();
		return tot;
	}
}
