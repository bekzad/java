package queue1;

public class FixedQueue<T> implements IGenQ<T> {

    private T[] a;
    private int putIndex, getIndex;

    FixedQueue(T[] a) {
        this.a = a;
        putIndex = getIndex = 0;
    }

    public void put(T o) throws QueueFullException {
        if (putIndex >= a.length) throw new QueueFullException(a.length);
        a[putIndex++] = o;
    }

    public T get() throws QueueEmptyException {
        if (getIndex >= putIndex) throw new QueueEmptyException();
        return a[getIndex++];
    }
}
