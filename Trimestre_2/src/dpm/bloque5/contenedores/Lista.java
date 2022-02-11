package dpm.bloque5.contenedores;

import java.util.AbstractList;

public class Lista extends AbstractList<String> {
	public final static int TAMANIO_INICIAL = 10;
	public final static int TAMANIO_CRECIMIENTO = 20;
	private String[] datos;
	private int tamanio;

	@Override
	public boolean add(String valorUsuario) {
		if (valorUsuario != null) {
			add(size(), valorUsuario);
			return true;
		} else
			return false;
	}

	@Override
	public void add(int pos, String valorUsuario) {
		int i;
		if (pos > tamanio)
			throw new ArrayIndexOutOfBoundsException();
		if (valorUsuario != null) {
			asegurarEspacio();
			for (i = tamanio - 1; i >= pos; i--) {
				datos[i + 1] = datos[i];
			}
			datos[pos] = valorUsuario;
			tamanio++;
		}
	}

	private void asegurarEspacio() {
		int i;
		String[] tablaAux;
		if (datos.length == tamanio) {
			tablaAux = new String[datos.length + TAMANIO_CRECIMIENTO];
			for (i = 0; i < tamanio; i++) {
				tablaAux[i] = datos[i];
			}
			datos = tablaAux;
		}
	}

	@Override
	public String get(int pos) {
		if (pos >= tamanio)
			throw new ArrayIndexOutOfBoundsException();
		return datos[pos];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String set(int pos, String d) {
		if(pos>=tamanio)
			throw new ArrayIndexOutOfBoundsException();
		String aux = datos[pos];
		if (d != null)
			datos[pos]=d;
		return aux;
	}

	@Override
	public String remove(int pos) {
        int i;
		if(pos>=tamanio)
			throw new ArrayIndexOutOfBoundsException();
        String aux = datos[pos];
        for (i = pos; i < tamanio -1; i++) {
            datos[i] = datos[i + 1];
        }
        //datos[i]=null;
        tamanio--;
        return aux;
    }

}
