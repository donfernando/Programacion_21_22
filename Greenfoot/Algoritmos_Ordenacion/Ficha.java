import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ficha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ficha extends Counter  implements Cloneable
{
    /**
     * Act - do whatever the Ficha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    
    public Ficha clone() throws CloneNotSupportedException{
        return (Ficha)super.clone();
    }
}
