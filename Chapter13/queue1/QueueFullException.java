package queue1;

public class QueueFullException extends Exception {
    QueueFullException(int size) {
        super("Queue is Full! Maximum size is: " + size);
    }
}
