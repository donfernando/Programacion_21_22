import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ordenacion de datos.
 * Algoritmo de Intercambio Directo
 * 
 * @author Fernando Toboso 
 * @version 1.0
 */
public class OrdenacionSeleccionDirecta extends Ordenacion
{
    // Para mantener el estado en proceso de ordenacion (ordenacion paso a paso)
    private int posActual;
    private int posCasillaSelec;
    private int posMinimo;

    public OrdenacionSeleccionDirecta(Casillero datos)
    {    
        super(datos);
        //preparando la ordenacion paso a paso...
    }
    
    /**
     * Act - do whatever the Ficha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void mueveCasillas() { 
       if(posCasillaSelec<datosParaOrdenar.tabla.length-1){
           if(posActual==datosParaOrdenar.tabla.length){
               animacionDelIntercambio(posMinimo,posCasillaSelec);
               intercambia(posMinimo,posCasillaSelec);
               posCasillaSelec++;
               posActual=posCasillaSelec;
               posMinimo=posCasillaSelec;
           }
           else{
               destaca(posActual);
               if(posActual==posCasillaSelec)
                   datosParaOrdenar.tabla[posMinimo].setPrefix("* ");
               else if(datosParaOrdenar.tabla[posActual].getValue()<datosParaOrdenar.tabla[posMinimo].getValue()) {
                   datosParaOrdenar.tabla[posMinimo].setPrefix("");
                   posMinimo=posActual;
                   datosParaOrdenar.tabla[posMinimo].setPrefix("* ");
               }
               posActual++;
           }
        }
        else
           datosParaOrdenar.tabla[posCasillaSelec].setPrefix("* ");
        
    }  

/*    
    // Este seria el algoritmo imperativo ejecutado de la manera secuencial clasica.
    public void ordenacionSeleccionDirecta(){
       posCasillaSelec=0;
       while(posCasillaSelec<tabla.length-1){
           posActual=posCasillaSelec;
           posMinimo=posCasillaSelec;
           tabla[posMinimo].setPrefix("* ");
           while(posActual<tabla.length){
               destaca(posActual);
               if(tabla[posActual].getValue()<tabla[posMinimo].getValue()) {
                   tabla[posMinimo].setPrefix("");
                   posMinimo=posActual;
                   tabla[posMinimo].setPrefix("* ");
               }
               posActual++;
           }
           animacionDelIntercambio();
           intercambia();
           posCasillaSelec++;
        }
    }
*/  

}
