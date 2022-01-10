import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ordenacion de datos.
 * Algoritmo de Intercambio Directo
 * 
 * @author Fernando Toboso 
 * @version 1.0
 */
public class OrdenacionIntercambioDirectoMejorado extends Ordenacion
{
    // Para mantener el estado en proceso de ordenacion (ordenacion paso a paso)
    private int posActual;
    private int incremento=1;
    private int tope_izq, tope_der;

    public OrdenacionIntercambioDirectoMejorado(Casillero c)
    {    
        super(c);
        //preparando la ordenacion paso a paso...
        tope_der=c.tabla.length-1;
    }
    
    
    /**
     * Act - do whatever the Ficha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       if(tope_izq<tope_der){
           if(incremento == 1){
               if(posActual==tope_der){
                   incremento = -1;
                   casillero.tabla[tope_der].setPrefix("* ");
                   tope_der--;
                   posActual=tope_der;
                }
                else{
                   if(casillero.tabla[posActual].getValue()>casillero.tabla[posActual+1].getValue()) {
                      animacionDelIntercambio(posActual,posActual+1);
                      intercambia(posActual,posActual+1);
                   }
                   else
                      destaca(posActual);
                   posActual++;
                }
                
           }
           else{
              if(posActual==tope_izq){
                   incremento = 1;
                   casillero.tabla[tope_izq].setPrefix("* ");
                   tope_izq++;
                   posActual=tope_izq;
              }
              else{
                   if(casillero.tabla[posActual-1].getValue()>casillero.tabla[posActual].getValue()) {
                      animacionDelIntercambio(posActual,posActual-1);
                      intercambia(posActual,posActual-1);
                   }
                   else
                      destaca(posActual);
                   posActual--;
                }
            }
        }
        else
            casillero.tabla[tope_izq].setPrefix("* ");
    }  
    // Este seria el algoritmo imperativo ejecutado de la manera secuencial clasica.
    // TODO .....

}
