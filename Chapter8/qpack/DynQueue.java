package qpack;

public class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        putloc = getloc = 0;
        q = new char[size];
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length) {
            char n[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {
                n[i] = q[i];
            }
            q = n;
        }
        q[putloc++] = ch;
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

    public static DynQueue copy(ICharQ ob, int size) {

        DynQueue q = new DynQueue(size);

        for (int i = 0; i < size; i++) {
            q.put(ob.get());
        }

        return q;
    }
}
