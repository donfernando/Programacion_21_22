//import dpm.bloque5.recorridosTablas.ListaStrings;
import dpm.bloque5.excepciones.ListaStrings;

public class Prueba {

	public static void main(String[] args) {
		ListaStrings l,lista;
		String[] datos = {"A","B","C","D"};
		
		lista = new ListaStrings(datos);
		
		System.out.println(lista);
		datos[1]=null;
		//lista.set(1, null);
		System.out.println(lista);
		for (int i = 0; i < datos.length; i++) {
			System.out.print(datos[i]+ " ");
		}
		System.out.println();
		lista.get(4);
		
		
		
//		l = new ListaStrings(5);
//		System.out.println(l);
//		l.add("A");
//		l.add("B");
//		l.add("C");
//		l.add("D");
//		System.out.println(l);
//		System.out.println(l.get(3));
//		System.out.println(l);
		
		
	}

}
