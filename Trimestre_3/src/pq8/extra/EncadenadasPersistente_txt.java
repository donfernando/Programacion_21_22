package pq8.extra;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class EncadenadasPersistente_txt extends PalabrasEncadenadas implements iPersistente {

	public EncadenadasPersistente_txt(String[] s) throws PalabrasInvalidasException {
		super(s);
	}
	
	public EncadenadasPersistente_txt(File f) {
		cargar(f);
	}

	@Override
	public boolean guardar(File f) {
		try {
			FileWriter o = new FileWriter(f,StandardCharsets.UTF_8);
//			FileOutputStream file = new FileOutputStream(f);
//			OutputStreamWriter o = new OutputStreamWriter(file, StandardCharsets.UTF_8);
			PrintWriter pw = new PrintWriter(o,false);
			for (int i = 0; i < palabras.length; i++) {
				pw.println(palabras[i]);
			}
			pw.close();
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}

		return true;
	}

	@Override
	public boolean cargar(File f) {
		String s;
		try {
			FileInputStream file = new FileInputStream(f);
			InputStreamReader i = new InputStreamReader(file, StandardCharsets.UTF_8);
			BufferedReader bf = new BufferedReader(i);
			ArrayList<String> p = new ArrayList<>();
			s = bf.readLine();
			while (s != null) {
				p.add(s);
				s = bf.readLine();
			}
			palabras = p.toArray(new String[0]);
			bf.close();
			i.close();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}

		return true;
	}
	
} 