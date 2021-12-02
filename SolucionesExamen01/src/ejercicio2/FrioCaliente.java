package ejercicio2;
import java.util.Random;

/**
 * Los objetos FrioCaliente se podrán utilizar para realizar fácilmente el juego
 * de adivinar un número, en el que a cada intento se retorna una pequeña pista que 
 * facilite la resolución.
 * 
 * @author Profernando
 */
public class FrioCaliente {
	private final int TOPE;
	private int numeroOculto;
	private boolean adivinado;
	
	/**
	 * El contructor nos pide necesariamente que se facilite un número que hará de
	 * límite máximo. Se generará un número al azar entre <i>1</i> y el número <i>tope</i>
	 * facilitado que deberá ser posteriormente averiguado.
	 * @param tope es el límite máximo para el número al azar.
	 */
	public FrioCaliente(int tope) {
		numeroOculto=(new Random().nextInt(tope))+1;
		TOPE = tope;
	}
	/**
	 * Cada llamada a esta función, será un intento de adivinar el número oculto.
	 * @param x El número con el que se intenta acertar.
	 * @return Un código int que da una pista sobre el intento de acertar...
	 * <br/>codigo -> 9   el número propuesto está fuera de los límites entre 1 y el tope máximo
	 * <br/>codigo -> -1  el número propuesto es menor que el número oculto.
	 * <br/>codigo -> 1   el número propuesto es mayor que el número oculto.
	 * <br/>codigo -> 0   el número propuesto es el número oculto (ACERTADO).
	 * 
	 * 
	 */
	public int adivinar(int x) {
		int codigo;
		if(x<=0 || x>TOPE)
			codigo = 9;
		else if(x>numeroOculto) 
			codigo = 1;
		else if(x<numeroOculto)
			codigo = -1;
		else {
			adivinado=true;
			codigo = 0;
		}
		return codigo;
	}

	/**
	 * @return El texto "???" en caso de que el número oculto aún no haya sido acertado.
	 * En caso de que ya haya sido acertado, se retornará dicho número. <i>(como String)</i>. 
	 */
	public String toString() {
		String text;
		if(!adivinado)
			text = "???";
		else
			text = ""+numeroOculto;
		return text;
	}
}
