public class Dni {
	private int numero;
	private char letra = '*';
	public final static String LETRAS_VALIDACION = "TRWAGMYFPDXBNJZSQVHLCKE";

	/**
	 * Permite obtener el valor del número del dni (sin letra)
	 * 
	 * @return El número del dni
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Permite obtener el valor de la letra del dni
	 * 
	 * @return La letra del dni
	 */
	public char getLetra() {
		return letra;
	}

	/**
	 * Permite asignar un dni válido. Para ello, la letra facilitada debe cumplir la
	 * regla de validación de los dni españoles. Dicha norma obliga a que la letra
	 * coincida con la correspondiente a la posición que marca el resto de dividir
	 * el número del dni entre 23 dentro de este listado de letras...
	 * TRWAGMYFPDXBNJZSQVHLCKE.
	 * <br/>Si los valores facilitados no encajan, el dni no será asignado al objeto.
	 * <br/>
	 * <br/>Una vez asignado un dni válido, ya no se podrá cambiar.
	 * 
	 * @param numero El número del dni, sin incluir la letra.
	 * @param letra La letra del dni.
	 */
	public void setDni(int numero, char letra) {
		int modulo;
		if (this.letra == '*') {
			letra=Character.toUpperCase(letra);
			modulo = numero % 23;
			if (letra == LETRAS_VALIDACION.charAt(modulo)) {
				this.numero = numero;
				this.letra = letra;
				
			}
		}
	}

	/**
	 * 
	 * @return El texto "inválido" en caso de que al dni no se le haya 
	 * asignado aún un dni válido. O bien, el dni seguido de su letra.
	 * 
	 */
	public String toString() {
		String text;
		if (letra == '*')
			text = "inválido";
		else
			text = "" + numero + letra;
		return text;
	}
}

