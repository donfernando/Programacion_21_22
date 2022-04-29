package pq2.conjunto;

public class Email {
	private int estado;
	StringBuilder email = new StringBuilder();

	public void add(char c) {
		switch (estado) {
		case 0:
			if (Character.isLetter(c) | c == '_')
				estado = 1;
			else
				throw new EmailIllegalArgumentException();
			break;
		case 1:
			if (c == '@')
				estado = 2;
			else if (c != '_' & c != '.' & !Character.isLetterOrDigit(c))
				throw new EmailIllegalArgumentException();
			break;
		case 2:
			if (Character.isLetter(c) | c == '_')
				estado = 3;
			else
				throw new EmailIllegalArgumentException();
			break;
		case 3:
			if (c == '.')
				estado = 2;
			else if (!Character.isLetterOrDigit(c) & c != '_')
				throw new EmailIllegalArgumentException();
			break;
		}
		email.append(c);
	}

	public boolean valida() {
		return estado == 3;
	}

	public String toString() {
//		String texto = email.toString();
//		if (!valida())
//			texto += " (es invalido)";
//
//		return texto;
		return valida()?email.toString():"Inválido ("+email+')';
	}
}
