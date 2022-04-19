package pq2.menu;

import java.util.ArrayList;

public class Menu implements IMenu {

	private ArrayList<Opcion> listaOpciones = new ArrayList<>();
	private boolean nuevasOpcionesBloqueadas = false;
	private int posSelect = 0;

	public Menu(String op) {
		Opcion aux = new Opcion(op);
		aux.check();
		listaOpciones.add(aux);
	}

	public void add(String op) {
		if (nuevasOpcionesBloqueadas)
			throw new MenuIllegalEstateException();
		listaOpciones.add(new Opcion(op));
	}

	public void add(int pos, String op) {
		if (nuevasOpcionesBloqueadas)
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
		listaOpciones.get(posSelect).uncheck();
		if (posSelect == listaOpciones.size() - 1) {
			posSelect = 0;
			listaOpciones.get(posSelect).check();
		} else {
			posSelect = posSelect + 1;
			listaOpciones.get(posSelect).check();
		}
		nuevasOpcionesBloqueadas = true;
		return posSelect;
	}

	public int previous() {
		listaOpciones.get(posSelect).uncheck();
		if (posSelect == 0) {
			posSelect = listaOpciones.size() - 1;
			listaOpciones.get(posSelect).check();
		} else {
			posSelect = posSelect - 1;
			listaOpciones.get(posSelect).check();
		}
		nuevasOpcionesBloqueadas = true;
		return posSelect;
	}

	public int read() {
		return 1;
	}

	public void select(int pos) {
		if (pos >= 0 && pos <= listaOpciones.size() - 1) {
			listaOpciones.get(posSelect).uncheck();
			posSelect = pos;
			listaOpciones.get(posSelect).check();
		}
		else {
			throw new MenuIndexOutOfBoundsException();
		}
		nuevasOpcionesBloqueadas = true;

	}

	public String toString() {
		String lista = "";
		for (int i = 0; i < listaOpciones.size(); i++) {
			lista = lista + "- " + listaOpciones.get(i).toString() + "\n";
		}
		return lista;
	}
}
