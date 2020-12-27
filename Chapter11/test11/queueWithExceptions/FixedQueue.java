package test11.queueWithExceptions;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;
    String state = "";

    public FixedQueue(int size) {
        putloc = getloc = 0;
        q = new char[size];
    }

    @Override
    public synchronized void put(char ch, boolean running) throws QueueFullException {
        if (!running) {
            state = "put";
            notify();
            return;
        }

        if (isOk()) {
            q[putloc++] = ch;
        } else {
            throw new QueueFullException(q.length);
        }

        state = "put";
        notify();

        try {
            while (!state.equals("got")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public synchronized char get(boolean running) throws QueueEmptyException {
        if (!running) {
            state = "got";
            notify();
            return q[getloc++];
        }

        if (getloc == putloc) {
            throw new QueueEmptyException();
        }

        return q[getloc++];
    }

    @Override
    public synchronized void reset() {
        putloc = getloc = 0;
    }

    private boolean isOk() {
        return 0 <= putloc && putloc < q.length;
    }
}
