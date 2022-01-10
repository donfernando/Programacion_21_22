import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panel extends World
{
    /**
     * Constructor for objects of class Panel.
     * 
     */

    public Panel()
    {   
       super(900, 400, 1); 
       new Ordenaciones(this);
    }    
    
    public void act(){
       // serieDatos1.ordenacionIntercambioDirecto();
       // serieDatos2.ordenacionIntercambioDirecto();
    }

}
