package pq8.extra;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class EncadenadasPersistente_bin extends PalabrasEncadenadas implements iPersistente{
	
	public EncadenadasPersistente_bin(String[] arr) throws PalabrasInvalidasException{
		super(arr);
	}
	
	public EncadenadasPersistente_bin(File f){
		cargar(f);
	}
	
	public boolean cargar(File f){
		boolean cargado = false;
		String linea="";
		ArrayList<String> lista_nueva = new ArrayList<>();
		try {
			DataInputStream entrada = new DataInputStream(new FileInputStream(f)); // para flujo bin
			try {
				while(true) 
					lista_nueva.add(entrada.readUTF());
			} catch (EOFException e) {}
			entrada.close();
			palabras = (String[])lista_nueva.toArray();
			cargado = true;
		} catch (IOException e) {}
		return cargado;
	}

	public boolean guardar(File f){
		boolean guardado = false;
		try {
			DataOutputStream salida = new DataOutputStream(new FileOutputStream(f));
			for(int i = 0; i < palabras.length; i++) {
				salida.writeUTF(palabras[i]);
				
			}
			salida.close();
			guardado = true;
		} catch (IOException e) {}
		return guardado;
	}
	
	
	
	
} 