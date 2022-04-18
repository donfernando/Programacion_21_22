package pq2.menu;

public class Opcion {
	private String texto;
	private boolean selec = false;

	public Opcion(String op) {
		if(op != null && op.length()!=0 && !op.equals("\n")) {
			texto = op;
		}
		else {
			throw new OpcionIllegalArgumentException();
		}
	}

	public void check() {
		selec = true;
	}

	public void uncheck() {
		selec = false;
	}

	public String getTexto() {
		return texto;
	}

	public boolean seleccionada() {
		return selec;
	}

	public String toString() {
//		String a = "";
//		if(seleccionada()) {
//			a = "* " + getTexto();
//		}
//		else {
//			a = getTexto();
//		}
//		return a;
		return (seleccionada()?"* ":"")+getTexto();
	}

}
