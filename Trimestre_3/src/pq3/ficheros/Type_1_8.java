package pq3.ficheros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Type_1_8 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr;
		FileInputStream fis;
		int cod;
		char ch;
		if(args.length!=0) {
			fis = new FileInputStream(args[0]);
			isr = new InputStreamReader(fis,Charset.forName("ISO-8859-15"));
//			isr = new InputStreamReader(fis,Charset.forName("UTF8"));
			cod=isr.read();
			while(cod != -1) {
				ch = (char)cod;
				System.out.printf("%c - (%d)\n",ch,(int)ch);
				cod=isr.read();				
			}
			isr.close();
		}
		else
			System.out.println("Falta el nombre del fichero...");
	}

}
