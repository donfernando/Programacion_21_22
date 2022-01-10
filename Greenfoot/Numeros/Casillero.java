import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExampleActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casillero extends Actor
{
    
    public final static int TAM = 7;
    final static int DESP_Y = 30;
    final static int ARRIMA_A_UN_LADO = 80;
    final static int MOVIMIENTO = 3;

    public Ficha[] tabla;
    
    public Casillero(Panel miPanel, int x, int y)
    {    
        int i;
        //miPanel.addObject(this,x,y);
        tabla = new Ficha[TAM];
        for(i=0;i<tabla.length;i++){
            tabla[i]=new Ficha();
            tabla[i].setValue((int)(Math.random()*20));
            miPanel.addObject(tabla[i],x, y+DESP_Y*i);
        }  
    }


    public Casillero(Panel miPanel, int x, int y, Ficha[] fichas)
    {    
        int i;
        //miPanel.addObject(this,x,y);
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

}
