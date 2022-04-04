package ListaSimple;

import java.util.Iterator;
import java.util.Stack;

public class Principal2 {
	public static void main(String[] arg) {
		Iterator it;
		int i;
		ListaConNodoFicticeo l=new ListaConNodoFicticeo();
		l.add(0,new StringBuffer("Cero"));
		l.add(1,new StringBuffer("Uno"));
		l.add(2,new StringBuffer("Cuatro"));
		l.add(2,new StringBuffer("Tres"));
		l.add(2,new StringBuffer("Dos"));
		System.out.println("Lista creada");
		System.out.println("------------");
		System.out.println(l);

		it=l.iterator();
		i=0;
		while(it.hasNext()) {
			System.out.println("dato "+i+": "+it.next());
			i++;
		}

		invertir(l);
		System.out.println();
		System.out.println("Lista invertida...");
		
		it=l.iterator();
		i=0;
		while(it.hasNext()) {
			System.out.println("dato "+i+": "+it.next());
			i++;
		}

	}	

	public static void invertir(ListaConNodoFicticeo l) {
		Stack p=new Stack();
		while(l.size()!=0)
			p.push(l.remove(0));

		while(!p.empty()) 
			l.add(l.size(),p.pop());
	}
	
}