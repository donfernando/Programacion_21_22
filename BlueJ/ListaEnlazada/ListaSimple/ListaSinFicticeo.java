package ListaSimple;



public class ListaSinFicticeo{
	
	static class Nodo{//clase anidada
		Object dato;//apilaremos objetos para que sirva para cualquier cosa
		Nodo sig;//a su vez tiene un atributo de su misma clase	
	}

	Nodo ini;
	int tamaño;
	
	public void add(int pos, Object o){
		Nodo nuevo=new Nodo();
		Nodo anterior;
		nuevo.dato=o;
		if(pos==0) {
			nuevo.sig=ini;
			ini=nuevo;
		}
		else if(pos>0 && pos<=tama�o) {
			anterior=ini;
			while(pos!=1) {
				pos--;
				anterior=anterior.sig;
			}
			nuevo.sig=anterior.sig;
			anterior.sig=nuevo;
		}
		else
			throw new RuntimeException("posicion excedida en la lista.");
		tama�o++;
	}






	public Object remove(int pos){
		Object aux;
		Nodo anterior;

		if(tama�o==0)
			throw new RuntimeException("la lista esta vacia.");
		if(pos<0 || pos>=tama�o)
			throw new RuntimeException("posicion excedida en la lista.");

		if(pos==0) {
			aux=ini.dato;
			ini=ini.sig;
		}
		else {
			anterior=ini;
			while(pos!=1) {
				pos--;
				anterior=anterior.sig;
			}
			aux=anterior.sig.dato;
			anterior.sig=anterior.sig.sig;
		}
		tama�o--;
		return aux;
	}

	public int size(){
		return tama�o;		
	}
	
	public String toString() {
		StringBuffer frase=new StringBuffer();
		Nodo i=ini;
		while(i!=null) {
			frase.append(i.dato+"\n");
			i=i.sig;
		}
		return frase.toString();
	}
	
}