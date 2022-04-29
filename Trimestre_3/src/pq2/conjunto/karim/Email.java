package pq2.conjunto.karim;

import pq2.conjunto.EmailIllegalArgumentException;

public class Email {
	private String email = "";
	private int estado = 0;

	public void add(char m) {
		switch (estado) {
		case 0:
			if (Character.isLetter(m) || m == '_')
				estado = 1;
			else
				throw new EmailIllegalArgumentException();
			break;
		case 1:
			if (m == '@')
				estado = 2;
			else if (m != '_' && m != '.' && !Character.isLetter(m) && !Character.isDigit(m))
				throw new EmailIllegalArgumentException();
			break;
		case 2:
			if (Character.isLetter(m) || m == '_')
				estado = 3;
			else
				throw new EmailIllegalArgumentException();
			break;
		case 3:
			if (m == '.')
				estado = 2;
			else if (m != '_' && !Character.isLetterOrDigit(m))
				throw new EmailIllegalArgumentException();
			break;
		}
		email += m;
	}

	public boolean valida() {
		return estado == 3;
	}

	public String toString() {
		return valida() ? email : "email no valido("+email+')';
	}
}
