import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ordenacion de datos.
 * Algoritmo de Intercambio Directo
 * 
 * @author Fernando Toboso 
 * @version 1.0
 */


public abstract class Ordenacion
{

    protected Casillero datosParaOrdenar;
    
    public Ordenacion(Casillero c){
        datosParaOrdenar = c;
    }
    
    public abstract void mueveCasillas();
    
    
    

    public void intercambia(int posA, int posB){
        Ficha aux;      
        //intercambia las posiciones de los numeros.
        aux=datosParaOrdenar.tabla[posA];
        datosParaOrdenar.tabla[posA] = datosParaOrdenar.tabla[posB];
        datosParaOrdenar.tabla[posB] = aux;
    }
    
    // Cuando intercambia sale, se cruza con el otro y vuelve a la fila    
    
    // TODO Rehacer
    public void animacionDelIntercambio(int posA, int posB){
        int orig_x=datosParaOrdenar.tabla[posA].getX();
        int tope_x=orig_x+Casillero.ARRIMA_A_UN_LADO;
        int yDeA=datosParaOrdenar.tabla[posA].getY();
        int yDeB=datosParaOrdenar.tabla[posB].getY();
        int sentidoA_B;

        if(yDeA < yDeB)
            sentidoA_B=1;
        else
            sentidoA_B=-1;
        
        
        // Mueve el actual para un lado
        while(datosParaOrdenar.tabla[posA].getX()<tope_x){
            datosParaOrdenar.tabla[posA].move(Casillero.MOVIMIENTO);
//            Greenfoot.delay(1);
        }
        // Mueve el siguiente para arriba
        while( sentidoA_B*datosParaOrdenar.tabla[posB].getY() > sentidoA_B*yDeA ){
            datosParaOrdenar.tabla[posA].setLocation( datosParaOrdenar.tabla[posA].getX(), datosParaOrdenar.tabla[posA].getY()+sentidoA_B*Casillero.MOVIMIENTO);
            datosParaOrdenar.tabla[posB].setLocation( datosParaOrdenar.tabla[posB].getX(), datosParaOrdenar.tabla[posB].getY()-sentidoA_B*Casillero.MOVIMIENTO);
//            Greenfoot.delay(2);
        } 
        // ajusta alturas.
        datosParaOrdenar.tabla[posA].setLocation( datosParaOrdenar.tabla[posA].getX(), yDeB);    
        datosParaOrdenar.tabla[posB].setLocation( datosParaOrdenar.tabla[posB].getX(), yDeA);    

        while(datosParaOrdenar.tabla[posA].getX()>orig_x){
            datosParaOrdenar.tabla[posA].move(-Casillero.MOVIMIENTO);
//            Greenfoot.delay(1);
        }
        // ajusta pos x.
        datosParaOrdenar.tabla[posA].setLocation( orig_x, datosParaOrdenar.tabla[posA].getY());    
    }
    
    
    // Cuando no intercambia sale y vuelve a donde estaba
    public void destaca(int posActual){
        int orig_x=datosParaOrdenar.tabla[posActual].getX();
        int tope_x=orig_x+Casillero.ARRIMA_A_UN_LADO/2;
        
        // Mueve el actual para un lado
        while(datosParaOrdenar.tabla[posActual].getX()<tope_x){
            datosParaOrdenar.tabla[posActual].move(Casillero.MOVIMIENTO);
            Greenfoot.delay(1);
        }
        while(datosParaOrdenar.tabla[posActual].getX()>orig_x){
            datosParaOrdenar.tabla[posActual].move(-Casillero.MOVIMIENTO);
            Greenfoot.delay(1);
        }
        
    }

    

}
