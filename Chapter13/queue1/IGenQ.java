package queue1;

public interface IGenQ<T> {

    void put(T o) throws QueueFullException;

    T get() throws QueueEmptyException;
}
