import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ordenacion de datos.
 * Algoritmo de Intercambio Directo
 * 
 * @author Fernando Toboso 
 * @version 1.0
 */
public class OrdenacionIntercambioDirecto extends Ordenacion
{
    // Para mantener el estado en proceso de ordenacion (ordenacion paso a paso)
    private int posActual;
    private int tope;

    public OrdenacionIntercambioDirecto(Casillero datos)
    {    
        super(datos);
        //preparando la ordenacion paso a paso...
        tope=datos.tabla.length-1;
    }
    

    public void mueveCasillas() {
       if(tope>0){
           if(posActual==tope){
               posActual=0;
               datosParaOrdenar.tabla[tope].setPrefix("* ");
               tope--;
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
        else {
           datosParaOrdenar.tabla[tope].setPrefix("* ");
           
        }
        
    }  

/*    
    // Este seria el algoritmo imperativo ejecutado de la manera secuencial clasica.
    public void ordenacionIntercambioDirecto(){
       tope=tabla.length-1;
       while(tope>0){
           posActual=0;
           while(posActual<tope){
               if(tabla[posActual].getValue()>tabla[posActual+1].getValue()) {
                    animacionDelIntercambio();
                    intercambia();
               }
               else
                    destaca(posActual);
               posActual++;
           }
           tabla[tope].setPrefix("* ");
           tope--;
        }
       tabla[tope].setPrefix("* ");
    }  
*/
}
