package dpm.bloque5.siete_y_media;

public class ValorCartaInvalidaException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public ValorCartaInvalidaException() {
	}
	public ValorCartaInvalidaException(String message) {
		super(message);
	}
}