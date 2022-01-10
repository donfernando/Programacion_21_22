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

    public Ficha[] tabla;
 
    public Casillero(Panel miPanel, int x, int y)
    {    
        int i;
        //miPanel.addObject(this,x,y);
        tabla = new Ficha[TAM];
        for(i=0;i<tabla.length;i++){
            tabla[i]=new Ficha();
            tabla[i].setValue((int)(Math.random()*20));
            miPanel.addObject(tabla[i],x, y+Panel.DESP_Y*i);
        }  
    }

    public Casillero(Panel miPanel, int x, int y, Ficha[] fichas,String titulo)
    {    
        int i;
        //miPanel.addObject(this,x,y);
        miPanel.showText(titulo, x+15, y-22);
        tabla = new Ficha[fichas.length];
        for(i=0;i<tabla.length;i++){
            try{
                tabla[i]=fichas[i].clone();
            }catch(CloneNotSupportedException e){
                tabla[i]=fichas[i];
            }
            miPanel.addObject(tabla[i],x, y+Panel.DESP_Y*i);
        }  
 
    }
}
