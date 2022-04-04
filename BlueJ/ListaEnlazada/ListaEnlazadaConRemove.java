import java.util.*;

public class ListaEnlazadaConRemove {
    private static class Nodo {
        Object dato;
        Nodo sig;
//        protected void finalize() {    System.out.println("Un Nodo ha finalizado"); }
    }
    private Nodo falsoNodoInicial= new Nodo();
    
    public void add(Object obj)    {
        Nodo nuevo=new Nodo();
        nuevo.dato=obj;
        nuevo.sig=falsoNodoInicial.sig;
        falsoNodoInicial.sig = nuevo;
    }
    public void vaciar () {
        falsoNodoInicial.sig=null;
    }
    public Iterator iterator() {
        return new Desplazarse();
    }
    private class Desplazarse implements Iterator
    {
        private boolean actualNoEsAutentico=true;
        private Nodo actual=falsoNodoInicial;
        private Nodo previo;
        public boolean hasNext() {
            return actual.sig != null;
        }
        public Object next()
        {
            if(!hasNext())
                throw new NoSuchElementException ("No hay mas elementos en la lista.");
            previo=actual;    
            actual= actual.sig;
            actualNoEsAutentico=false;
            return actual.dato;
        }
        public void remove() {
            if(actualNoEsAutentico)
                throw new IllegalStateException ("No hay elemento actual");
            previo.sig=actual.sig;
            actual=previo;
            actualNoEsAutentico=true;
        }
    }
}
        
        