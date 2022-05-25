package pq7.accesoDirecto;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Prueba {
public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
	
	String password="secreti";
	MessageDigest sha256=MessageDigest.getInstance("SHA-256");
	sha256.update(password.getBytes("UTF-8"));
	byte[] digest = sha256.digest();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<digest.length;i++){
	    sb.append(String.format("%02x", digest[i]));
	}
	String hash=sb.toString(); //2bb80d5...527a25b
	System.out.println(hash);
System.out.println(digest.length);
}
}