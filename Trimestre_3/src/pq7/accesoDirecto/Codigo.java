package pq7.accesoDirecto;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

public class Codigo {
	public static void main(String[] args) {
		// prueba
		String[] textos = {"Juan      ","Jonás     ","Antonio   ",
						   "David     ","Ana       ","Álvaro    ",
						   "Paulo     ","Blasa     ","Sandra    "};
		for (String s : textos) {
			System.out.printf("'%s': %d\n",s,hash(s,25));
		}
	}
	public static int hash(String texto,int rango) {
		int hash=-1;
		try {
			MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
			sha256.update(texto.getBytes("UTF-8"));
			byte[] digest = sha256.digest();
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(digest));
			hash = Math.abs(in.readInt());
			hash = hash%rango;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hash;
	}
}