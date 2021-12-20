import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExampleActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExampleActor  extends ThreadActor
{
    public ExampleActor()
    {
        setSequences(new Sequence[] { new MoveSequence(), new TurnSequence() });
    }

    class MoveSequence extends Sequence
    {
        public void doRun() throws InterruptedException
        {
            // This corresponds roughly to a Scratch
            //   "when running, do forever: move(..)"
            
            while (true) {
                setLocation(getX() + 1, getY());
                waitForNextSequence();
            }
        }
    }
    
    class TurnSequence extends Sequence
    {
        public void doRun() throws InterruptedException
        {
            while (true) {
                setRotation(getRotation() + 1);
                waitForNextSequence();
            }
        }
    }
}
