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

    public OrdenacionIntercambioDirecto(Panel miPanel, int x, int y)
    {    
        super(miPanel,x,y);
        //preparando la ordenacion paso a paso...
        tope=tabla.length-1;
    }
    public OrdenacionIntercambioDirecto(Panel miPanel, int x, int y, Ficha[] fichas)
    {    
        super(miPanel,x,y,fichas);
        //preparando la ordenacion paso a paso...
        tope=tabla.length-1;
    }
    
    
    /**
     * Act - do whatever the Ficha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       if(tope>0){
           if(posActual==tope){
               posActual=0;
               tabla[tope].setPrefix("* ");
               tope--;
           }
           else{
               if(tabla[posActual].getValue()>tabla[posActual+1].getValue()) {
                  animacionDelIntercambio();
                  intercambia();
               }
               else
                  destaca(posActual);
               posActual++;
           }
        }
        else {
           tabla[tope].setPrefix("* ");
           
        }
        
    }  

    public void intercambia(){
        int posSiguiente=posActual+1;
        Ficha aux;      
        //intercambia las posiciones de los numeros.
        aux=tabla[posActual];
        tabla[posActual] = tabla[posSiguiente];
        tabla[posSiguiente] = aux;
    }
    
    // Cuando intercambia sale, se cruza con el otro y vuelve a la fila    
    public void animacionDelIntercambio(){
        int posSiguiente=posActual+1;
        int tope_x=tabla[posActual].getX()+ARRIMA_A_UN_LADO;
        int orig_x=tabla[posActual].getX();
        int yDeActual=tabla[posActual].getY();
        int yDeSiguiente=tabla[posSiguiente].getY();

        // Mueve el actual para un lado
        while(tabla[posActual].getX()<tope_x){
            tabla[posActual].move(MOVIMIENTO);
            Greenfoot.delay(1);
        }
        // Mueve el siguiente para arriba
        while(tabla[posSiguiente].getY()>yDeActual){
            tabla[posSiguiente].setLocation( tabla[posSiguiente].getX(), tabla[posSiguiente].getY()-MOVIMIENTO);
            tabla[posActual].setLocation( tabla[posActual].getX(), tabla[posActual].getY()+MOVIMIENTO);
            Greenfoot.delay(2);
        } 
        // ajusta alturas.
        tabla[posActual].setLocation( tabla[posActual].getX(), yDeSiguiente);    
        tabla[posSiguiente].setLocation( tabla[posSiguiente].getX(), yDeActual);    

        while(tabla[posActual].getX()>orig_x){
            tabla[posActual].move(-MOVIMIENTO);
            Greenfoot.delay(1);
        }
        // ajusta pos x.
        tabla[posActual].setLocation( orig_x, tabla[posActual].getY());    
    }
    
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
    

}
