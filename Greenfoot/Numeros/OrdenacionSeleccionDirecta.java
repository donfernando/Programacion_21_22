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

    public OrdenacionSeleccionDirecta(Panel miPanel, int x, int y)
    {    
        super(miPanel,x,y);
        //preparando la ordenacion paso a paso...
    }
    public OrdenacionSeleccionDirecta(Panel miPanel, int x, int y, Ficha[] fichas)
    {    
        super(miPanel,x,y,fichas);
        //preparando la ordenacion paso a paso...
    }
    
    
    /**
     * Act - do whatever the Ficha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       if(posCasillaSelec<tabla.length-1){
           if(posActual==tabla.length){
               animacionDelIntercambio();
               intercambia();
               posCasillaSelec++;
               posActual=posCasillaSelec;
               posMinimo=posCasillaSelec;
           }
           else{
               destaca(posActual);
               if(posActual==posCasillaSelec)
                   tabla[posMinimo].setPrefix("* ");
               else if(tabla[posActual].getValue()<tabla[posMinimo].getValue()) {
                   tabla[posMinimo].setPrefix("");
                   posMinimo=posActual;
                   tabla[posMinimo].setPrefix("* ");
               }
               posActual++;
           }
        }
        else
           tabla[posCasillaSelec].setPrefix("* ");
        
    }  

    public void intercambia(){
        int posSiguiente=posActual+1;
        Ficha aux;      
        //intercambia las posiciones de los numeros.
        aux=tabla[posCasillaSelec];
        tabla[posCasillaSelec] = tabla[posMinimo];
        tabla[posMinimo] = aux;
    }
    
    // Cuando intercambia sale, se cruza con el otro y vuelve a la fila    
    public void animacionDelIntercambio(){
        int tope_x=tabla[posMinimo].getX()+ARRIMA_A_UN_LADO;
        int orig_x=tabla[posMinimo].getX();
        int yDeSeleccionada=tabla[posCasillaSelec].getY();
        int yDeMinimo=tabla[posMinimo].getY();

        // Mueve ambas casillas para un lado
        while(tabla[posMinimo].getX()<tope_x){
            tabla[posMinimo].move(MOVIMIENTO);
            if(posMinimo!=posCasillaSelec)
                tabla[posCasillaSelec].move(MOVIMIENTO);
            Greenfoot.delay(1);
        }
        // Las cruza...una para arriba y otra para abajo
        while(tabla[posCasillaSelec].getY()<yDeMinimo){
            tabla[posCasillaSelec].setLocation( tabla[posCasillaSelec].getX(), tabla[posCasillaSelec].getY()+MOVIMIENTO);
            tabla[posMinimo].setLocation( tabla[posMinimo].getX(), tabla[posMinimo].getY()-MOVIMIENTO);
            Greenfoot.delay(2);
        } 
        // ajusta alturas.
        tabla[posMinimo].setLocation( tabla[posMinimo].getX(), yDeSeleccionada);    
        tabla[posCasillaSelec].setLocation( tabla[posCasillaSelec].getX(), yDeMinimo);    

        while(tabla[posMinimo].getX()>orig_x){
            tabla[posMinimo].move(-MOVIMIENTO);
            if(posMinimo!=posCasillaSelec)
                tabla[posCasillaSelec].move(-MOVIMIENTO);
            Greenfoot.delay(1);
        }
        // ajusta pos x.
        tabla[posMinimo].setLocation( orig_x, tabla[posMinimo].getY());    
        tabla[posCasillaSelec].setLocation( orig_x, tabla[posCasillaSelec].getY());    
    }
    
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
    

}
