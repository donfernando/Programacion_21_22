package pq2.menu;

import java.util.ArrayList;

public class Menu implements IMenu {

	private ArrayList<Opcion> listaOpciones = new ArrayList<>();
	private boolean nuevasOpcionesBloqueadas = false;
	private int opcActualSelect = 0;

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
	
	public String get(int pos) {
		if (pos < 0 || pos >= listaOpciones.size())
			throw new MenuIndexOutOfBoundsException();
		return listaOpciones.get(pos).getTexto();
	}

	public int next() {
		listaOpciones.get(opcActualSelect).uncheck();
		if (opcActualSelect == listaOpciones.size() - 1) {
			opcActualSelect = 0;
		} else {
			opcActualSelect = opcActualSelect + 1;
		}
		listaOpciones.get(opcActualSelect).check();
		nuevasOpcionesBloqueadas = true;
		return opcActualSelect;
	}

	public int previous() {
		listaOpciones.get(opcActualSelect).uncheck();
		if (opcActualSelect == 0) {
			opcActualSelect = listaOpciones.size() - 1;
		} else {
			opcActualSelect--;
		}
		listaOpciones.get(opcActualSelect).check();
		nuevasOpcionesBloqueadas = true;
		return opcActualSelect;
	}

	public int read() {
		nuevasOpcionesBloqueadas = true;
		return opcActualSelect;
	}

	public void select(int pos) {
		if (pos >= 0 && pos < listaOpciones.size()) {
			listaOpciones.get(opcActualSelect).uncheck();
			opcActualSelect = pos;
			listaOpciones.get(opcActualSelect).check();
		}
		else {
			throw new MenuIndexOutOfBoundsException();
		}
		nuevasOpcionesBloqueadas = true;
	}

	public String toString() {
		String txtMenu = "";
		for (int i = 0; i < listaOpciones.size(); i++) {
			txtMenu = txtMenu + "- " + listaOpciones.get(i) + "\n";
		}
		return txtMenu;
	}
}
