package pq3.ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Type {

	public static void main(String[] args) throws IOException {
		FileReader f;
		int cod;
		char ch;
		if(args.length!=0) {
			f = new FileReader(args[0],Charset.forName("UTF8"));
			cod=f.read();
			while(cod != -1) {
				ch = (char)cod;
				System.out.print(ch);
				cod=f.read();				
			}
			f.close();
		}
		else
			System.out.println("Falta el nombre del fichero...");
	}

}

