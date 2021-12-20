import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExampleWorld  extends World
{

    /**
     * Constructor for objects of class TestWorld.
     */
    public ExampleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(new ExampleActor(), 100, 300);
    }
}
