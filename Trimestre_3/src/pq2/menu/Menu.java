package pq2.menu;

import java.util.ArrayList;

public class Menu implements IMenu {

	private ArrayList<Opcion> listaOpciones = new ArrayList<>();
	private boolean control = false;
	private int posicion = 0;

	public Menu(String op) {
		Opcion aux = new Opcion(op);
		aux.check();
		listaOpciones.add(aux);
	}

	public void add(String op) {
		if (control)
			throw new MenuIllegalEstateException();
		listaOpciones.add(new Opcion(op));
	}

	public void add(int pos, String op) {
		if (control)
			throw new MenuIllegalEstateException();
		try {
			listaOpciones.add(pos, new Opcion(op));
			if (pos == 0) {
				listaOpciones.get(1).uncheck();
				listaOpciones.get(0).check();
			}
		} catch (IndexOutOfBoundsException e) {
			throw new MenuIndexOutOfBoundsException();
		}
	}
	
// TODO ...aún por revisar
	public String get(int pos) {
		String op = "";
		if (pos >= 0 && pos <= listaOpciones.size() - 1) {
			op = listaOpciones.get(pos).getTexto();
		}
		return op;
	}

	public int next() {
		listaOpciones.get(posicion).uncheck();
		if (posicion == listaOpciones.size() - 1) {
			posicion = 0;
			listaOpciones.get(posicion).check();
		} else {
			posicion = posicion + 1;
			listaOpciones.get(posicion).check();
		}
		control = true;
		return posicion;
	}

	public int previous() {
		listaOpciones.get(posicion).uncheck();
		if (posicion == 0) {
			posicion = listaOpciones.size() - 1;
			listaOpciones.get(posicion).check();
		} else {
			posicion = posicion - 1;
			listaOpciones.get(posicion).check();
		}
		control = true;
		return posicion;
	}

	public int read() {
		return 1;
	}

	public void select(int pos) {
		if (pos >= 0 && pos <= listaOpciones.size() - 1) {
			listaOpciones.get(posicion).uncheck();
			posicion = pos;
			listaOpciones.get(posicion).check();
		}
		else {
			throw new MenuIndexOutOfBoundsException();
		}
		control = true;

	}

	public String toString() {
		String lista = "";
		for (int i = 0; i < listaOpciones.size(); i++) {
			lista = lista + "- " + listaOpciones.get(i).toString() + "\n";
		}
		return lista;
	}
}
