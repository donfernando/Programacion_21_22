package pq2.conjunto;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class ConjuntoSimpatico extends AbstractSet<Integer>{
	
	private ArrayList<Integer> datos = new ArrayList<>();

	
	public ConjuntoSimpatico() {
	}
	public ConjuntoSimpatico(Collection<Integer> c) {
		for (Integer i : c) {
			if(!datos.contains(i) && NumeroSimpatico.valida(i))
				datos.add(i);
		}
	}
	public ConjuntoSimpatico(int[] c) {
		for (Integer i : c) {
			if(!datos.contains(i) && NumeroSimpatico.valida(i))
				datos.add(i);
		}
	}
	
//	@Override
//	public boolean add(Integer i) {
//		if(!NumeroSimpatico.valida(i))
//			throw new IllegalArgumentException();
//		if(!datos.contains(i)) {
//			datos.add(i);
//			return true;
//		}
//		return false;			
//	}

	
	public static ConjuntoSimpatico union(Set<Integer> c1, Set<Integer> c2) {
		ConjuntoSimpatico nuevo = new ConjuntoSimpatico();
		for (Integer i : c1) {
			if(!nuevo.datos.contains(i) && NumeroSimpatico.valida(i))
				nuevo.datos.add(i);
		}
		for (Integer i : c2) {
			if(!nuevo.datos.contains(i) && NumeroSimpatico.valida(i))
				nuevo.datos.add(i);
		}
		return nuevo;
	}
	
	
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
