package test11.queueWithExceptions;

public interface ICharQ {

    // Put a character into the queue
    void put(char ch, boolean running) throws QueueFullException;

    // Get a character from the queue
    char get(boolean running) throws QueueEmptyException;

    // Reset method
    void reset();

}
