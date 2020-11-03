package qpack;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        putloc = getloc = 0;
        q = new char[size];
    }

    @Override
    public void put(char ch) {
        if (isOk()) {
            q[putloc++] = ch;
        } else {
            System.out.println("Queue is full.");
        }
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty.");
            return (char) 0;
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
