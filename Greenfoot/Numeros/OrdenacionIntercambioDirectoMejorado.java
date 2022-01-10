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

    public OrdenacionIntercambioDirectoMejorado(Casillero datos)
    {    
        super(datos);
        //preparando la ordenacion paso a paso...
        tope_der=datosParaOrdenar.tabla.length-1;
    }
    
    /**
     * Act - do whatever the Ficha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void mueveCasillas() {
       if(tope_izq<tope_der){
           if(incremento == 1){
               if(posActual==tope_der){
                   incremento = -1;
                   datosParaOrdenar.tabla[tope_der].setPrefix("* ");
                   tope_der--;
                   posActual=tope_der;
                }
                else{
                   if(datosParaOrdenar.tabla[posActual].getValue()>datosParaOrdenar.tabla[posActual+1].getValue()) {
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
                   datosParaOrdenar.tabla[tope_izq].setPrefix("* ");
                   tope_izq++;
                   posActual=tope_izq;
              }
              else{
                   if(datosParaOrdenar.tabla[posActual-1].getValue()>datosParaOrdenar.tabla[posActual].getValue()) {
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
            datosParaOrdenar.tabla[tope_izq].setPrefix("* ");
        
        
    }  
    // Este seria el algoritmo imperativo ejecutado de la manera secuencial clasica.
    // TODO .....

}
