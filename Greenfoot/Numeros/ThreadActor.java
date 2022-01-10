import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Greenfoot Actor allowing one or more "sequences" of actions to be implemented in
 * separate threads (as instances of Sequence).
 * 
 * <p>Typically, the Sequences would be inner classes so that they can call regular actor
 * methods.
 * 
 * <p>This probably leaks threads, seeing as there is no way to catch when the actor is
 * removed from the world, or when the world itself is destroyed.
 * 
 * @author Davin McCall
 */
public class ThreadActor  extends Actor
{
    private Sequence[] sequences;

    public ThreadActor()
    {
    }
    
    /**
     * Set the sequences that this actor will run. This should be called before the
     * first act() (i.e. normally, from within the constructor).
     */
    public void setSequences(Sequence[] sequences)
    {
        this.sequences = sequences;
        for (Sequence sequence : sequences) {
            sequence.start();
        }
    }

    /**
     * Act - do whatever the ThreadActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public final void act() 
    {
        for (Sequence sequence : sequences) {
            sequence.performSequence();
        }
    }
}
