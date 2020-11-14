package queueWithExceptions;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        putloc = getloc = 0;
        q = new char[size];
    }

    @Override
    public void put(char ch) throws QueueFullException {
        if (isOk()) {
            q[putloc++] = ch;
        } else {
            throw new QueueFullException(q.length);
        }
    }

    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }

    @Override
    public void reset() {
        putloc = getloc = 0;
    }

    private boolean isOk() {
        return 0 <= putloc && putloc < q.length;
    }
}
