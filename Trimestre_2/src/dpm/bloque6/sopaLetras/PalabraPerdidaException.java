package dpm.bloque6.sopaLetras;

public class PalabraPerdidaException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public PalabraPerdidaException() {
	}
	public PalabraPerdidaException(String message) {
		super(message);
	}
}
