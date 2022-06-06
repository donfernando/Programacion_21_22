package pq8.extra;

import java.util.Random;

public class PalabrasEncadenadas {

	public static final int minPalabras = 4;
	protected String[] palabras;
	private String ultimaPalabra;

	public PalabrasEncadenadas(String[] palabras) throws PalabrasInvalidasException {

		if (palabras == null || minPalabras > palabras.length) {
			throw new PalabrasInvalidasException();
		}

		int i = 0;
		while (i < palabras.length && !(palabras[i] == null || palabras[i].length() == 0))
			i++;
		if (i < palabras.length) {
			throw new PalabrasInvalidasException();
		}

		this.palabras = new String[palabras.length];
		for (i = 0; i < palabras.length; i++) {
			this.palabras[i] = palabras[i];
		}
	}

	public PalabrasEncadenadas() {
		 palabras = new String[] { "resulta", "estudiar", "alienante2", "alucinante" };		
	}

	public String iniciar() {
		String pal = null;
		if (ultimaPalabra == null) {
			Random r = new Random();

			int numero = r.nextInt(palabras.length);

			ultimaPalabra = palabras[numero];

			pal = palabras[numero];
		}
		return pal;
	}

	public String siguiente() throws PalabrasInvalidasException {
		String pal=null;
		int i;
		if (ultimaPalabra != null) {
			i = 0;
			while(i < palabras.length && !(ultimaPalabra.charAt(ultimaPalabra.length()-1) == palabras[i].charAt(0)))
				i++;
			if (i < palabras.length) {
				ultimaPalabra = palabras[i];
				pal = palabras[i];
			}
			else
				throw new PalabrasInvalidasException();
		}
		return pal;
	}

}