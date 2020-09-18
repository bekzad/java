
class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("- Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("- Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

public class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != '0') 
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("Using small Q to generate errors");
        for (i = 0; i < 5; i++) {
            System.out.println("Attempting to store " + (char) ('A' + i));
            smallQ.put((char) ('A' + i));
        }

        System.out.println("Contents of smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != '0') System.out.print(ch);
        }

    }
}