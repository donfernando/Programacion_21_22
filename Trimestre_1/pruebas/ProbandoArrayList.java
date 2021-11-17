import java.util.ArrayList;

public class ProbandoArrayList {

	public static void main(String[] args) {
		ArrayList lista;
		lista = new ArrayList();
		lista.add("Juan");
		lista.add("Ana");
		lista.add("Julia");
		lista.add("Abraham");
		System.out.println("\t\t\t"+lista+ "    elementos:("+lista.size()+")");
		lista.remove(1);
		System.out.println(lista+ "\telementos:("+lista.size()+")");
		
	}

}
