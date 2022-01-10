import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ordenacion de datos.
 * Algoritmo de Intercambio Directo
 * 
 * @author Fernando Toboso 
 * @version 1.0
 */
public class Ordenacion extends Actor
{
    Casillero casillero;
   
    public Ordenacion(Casillero c)
    {    
        casillero=c;
    }
     

    public void intercambia(int posA, int posB){
        Ficha aux;      
        //intercambia las posiciones de los numeros.
        aux=casillero.tabla[posA];
        casillero.tabla[posA] = casillero.tabla[posB];
        casillero.tabla[posB] = aux;
    }
    
    // Cuando intercambia sale, se cruza con el otro y vuelve a la fila        
    public void animacionDelIntercambio(int posA, int posB){
        int orig_x=casillero.tabla[posA].getX();
        int tope_x=orig_x+Panel.ARRIMA_A_UN_LADO;
        int yDeA=casillero.tabla[posA].getY();
        int yDeB=casillero.tabla[posB].getY();
        int sentidoA_B;

        if(yDeA < yDeB)
            sentidoA_B=1;
        else
            sentidoA_B=-1;
        
        
        // Mueve el actual para un lado
        while(casillero.tabla[posA].getX()<tope_x){
            casillero.tabla[posA].move(Panel.MOVIMIENTO);
            Greenfoot.delay(1);
        }
        // Mueve el siguiente para arriba
        while( sentidoA_B*casillero.tabla[posB].getY() > sentidoA_B*yDeA ){
            casillero.tabla[posA].setLocation( casillero.tabla[posA].getX(), casillero.tabla[posA].getY()+sentidoA_B*Panel.MOVIMIENTO);
            casillero.tabla[posB].setLocation( casillero.tabla[posB].getX(), casillero.tabla[posB].getY()-sentidoA_B*Panel.MOVIMIENTO);
            Greenfoot.delay(2);
        } 
        // ajusta alturas.
        casillero.tabla[posA].setLocation( casillero.tabla[posA].getX(), yDeB);    
        casillero.tabla[posB].setLocation( casillero.tabla[posB].getX(), yDeA);    

        while(casillero.tabla[posA].getX()>orig_x){
            casillero.tabla[posA].move(-Panel.MOVIMIENTO);
            Greenfoot.delay(1);
        }
        // ajusta pos x.
        casillero.tabla[posA].setLocation( orig_x, casillero.tabla[posA].getY());    
    }
    
    
    // Cuando no intercambia sale y vuelve a donde estaba
    public void destaca(int posActual){
        int orig_x=casillero.tabla[posActual].getX();
        int tope_x=orig_x+Panel.ARRIMA_A_UN_LADO/2;
        
        // Mueve el actual para un lado
        while(casillero.tabla[posActual].getX()<tope_x){
            casillero.tabla[posActual].move(Panel.MOVIMIENTO);
            Greenfoot.delay(1);
        }
        while(casillero.tabla[posActual].getX()>orig_x){
            casillero.tabla[posActual].move(-Panel.MOVIMIENTO);
            Greenfoot.delay(1);
        }
        
    }
}
