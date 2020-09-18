/* First in First out queue by using constructor overloading */

class Queue2 {
    private char q[];
    private int putloc, getloc;

    Queue2(int size) {
        this.q = new char[size];
        this.putloc = this.getloc = 0;
    }
    Queue2(Queue2 obj) {
        this.putloc = obj.putloc;
        this.getloc = obj.getloc;
        this.q = new char[obj.q.length];

        for (int i = getloc; i < putloc; i++) {
            this.q[i] = obj.q[i];
        }
    }
    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) {
            put(a[i]);
        }
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

class QDemo2 {
    public static void main(String args[]) {
        // Construct 10 element empty Queue
        Queue2 q1 = new Queue2(10);

        // Construct queue from array
        char name[] = {'T', 'o', 'm'};
        Queue2 q2 = new Queue2(name);

        int i;
        // Put some character into q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Construct queue from another queue
        Queue2 q3 = new Queue2(q1);

        // Show the queues
        System.out.print("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            System.out.print(q1.get());
        }
        System.out.println();

        System.out.print("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            System.out.print(q2.get());
        }
        System.out.println();

        System.out.print("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            System.out.print(q3.get());
        }
        System.out.println();
    }
}