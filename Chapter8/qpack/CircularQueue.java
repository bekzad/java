package qpack;

public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        putloc = getloc = 0;
        q = new char[size+1];
    }

    @Override
    public void put(char ch) {
        /*
            Queue is full if getloc is either one less than getloc or
            if putloc is at the end and getloc is at the beginning
         */
        if ((putloc+1 == getloc) || (putloc == q.length-1 && getloc == 0)) {
            System.out.println("Queue is full.");
            return;
        }

        q[putloc++] = ch;
        // Loop back
        if (putloc == q.length) {
            putloc = 0;
        }
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty.");
            return (char) 0;
        }
        char ch =  q[getloc++];
        if (getloc == q.length) {
            getloc = 0; // loop back
        }
        return ch;
    }

    @Override
    public void reset() {
        putloc = getloc = 0;
    }

}
