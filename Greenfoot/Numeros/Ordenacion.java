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
    public final static int TAM = 4;
    final static int DESP_Y = 30;
    final static int ARRIMA_A_UN_LADO = 80;
    final static int MOVIMIENTO = 3;

    Ficha[] tabla;

    public Ordenacion(Panel miPanel, int x, int y)
    {    
        int i;
        miPanel.addObject(this,x,y);
        tabla = new Ficha[TAM];
        for(i=0;i<tabla.length;i++){
            tabla[i]=new Ficha();
            tabla[i].setValue((int)(Math.random()*20));
            miPanel.addObject(tabla[i],x, y+DESP_Y*i);
        }  
    }
    public Ordenacion(Panel miPanel, int x, int y, Ficha[] fichas)
    {    
        int i;
        miPanel.addObject(this,x,y);
        tabla = new Ficha[fichas.length];
        for(i=0;i<tabla.length;i++){
            try{
                tabla[i]=fichas[i].clone();
            }catch(CloneNotSupportedException e){
                tabla[i]=fichas[i];
            }
            miPanel.addObject(tabla[i],x, y+DESP_Y*i);
        }  
    }
    
    
    // Cuando no intercambia sale y vuelve a donde estaba
    public void destaca(int posActual){
        int orig_x=tabla[posActual].getX();
        int tope_x=orig_x+ARRIMA_A_UN_LADO/2;
        
        // Mueve el actual para un lado
        while(tabla[posActual].getX()<tope_x){
            tabla[posActual].move(MOVIMIENTO);
            Greenfoot.delay(1);
        }
        while(tabla[posActual].getX()>orig_x){
            tabla[posActual].move(-MOVIMIENTO);
            Greenfoot.delay(1);
        }
        
    }

    

}
