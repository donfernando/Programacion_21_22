package pq2.listas;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class Ejercicios {
	public static int totalizar(List<Integer> l) {
		int tot=0;
		int i;
		if(l instanceof RandomAccess)
			for (i = 0; i < l.size(); i++) {
				tot += l.get(i);
			}
		else {
			Iterator<Integer> it;
			it= l.iterator();
			while(it.hasNext())
				tot += it.next();
		}
			
		return tot;
	}
	public static int totalizar(Iterator<Integer> i) {
		int tot=0;
		while(i.hasNext())
			tot += i.next();
		return tot;
	}
}
