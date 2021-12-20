/**
 * A thread performing a sequence of actions.
 */
public abstract class Sequence extends Thread
{
    private Object sequenceLock;
    private boolean doneSequence;
    private boolean terminated;

    /**
     * Constructor for objects of class Sequence
     */
    public Sequence()
    {
        this.sequenceLock = this;
        doneSequence = true;
    }

    public void run()
    {
        try {
            synchronized (sequenceLock) {
                while (doneSequence) {
                    sequenceLock.wait();
                }
                
                doRun();
            }
        }
        catch (InterruptedException ie) {}
        catch (Throwable t) {
            t.printStackTrace();
        }
        
        terminated = true;
        doneSequence = true;
    }
    
    /**
     * The sequence should be implemented in this method. Call waitForNextSequence() at any
     * time to relinquish control and wait until the next sequence.
     */
    public abstract void doRun() throws InterruptedException;
    
    /**
     * Call this to relinquish control and wait for the next sequence.
     */
    public void waitForNextSequence() throws InterruptedException
    {
        doneSequence = true;
        sequenceLock.notify();
        
        while (doneSequence) {
            sequenceLock.wait();
        }
    }
    
    /**
     * The controller calls this when a sequence should be executed. The sequence thread
     * will be notified, and allowed to run until it relinquishes control, at which point
     * this method will return.
     */
    public void performSequence()
    {
        try {
            synchronized (sequenceLock) {
                if (terminated) {
                    return;
                }
            
                doneSequence = false;
                sequenceLock.notify();  // Thread now continues
    
                while (! doneSequence) {
                    sequenceLock.wait(); // Wait for thread to notify us it's done
                }
            }
        }
        catch (InterruptedException ie) {}
    }
}
