package test11.queueWithExceptions;

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}
