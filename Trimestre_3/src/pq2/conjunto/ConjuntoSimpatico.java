package pq2.conjunto;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConjuntoSimpatico extends AbstractSet<Integer>{
	
	private ArrayList<Integer> datos = new ArrayList<>();

	
//	public ConjuntoSimpatico() {
//	}
//	public ConjuntoSimpatico(Collection<Integer> c) {
//		for (Integer i : c) {
//			if(!datos.contains(i))
//				datos.add(i);
//		}
//	}
	public ConjuntoSimpatico(int[] c) {
		for (Integer i : c) {
			if(!datos.contains(i))
				datos.add(i);
		}
	}
	
//	@Override
//	public boolean add(Integer e) {
//		if(!datos.contains(e)) {
//			datos.add(e);
//			return true;
//		}
//		return false;			
//	}

	@Override
	public int size() {
		return datos.size();
	}	
	
	@Override
	public Iterator<Integer> iterator() {
		return new Recorre();
	}

	private class Recorre implements Iterator<Integer>{
		private int actual=-1;

		@Override
		public boolean hasNext() {
			return actual<datos.size()-1;
		}

		@Override
		public Integer next() {
			if(!hasNext())
				throw new NoSuchElementException();
			actual++;
			return datos.get(actual);
		}
		
	}
}
