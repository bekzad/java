package queues;

import qpack.CircularDynQueue;
import qpack.ICharQ;

public class IQDemo2 {
    public static void main(String args[]) {
        CircularDynQueue q1 = new CircularDynQueue(5);

        ICharQ q;
        int i;

        q = q1;
        // Store more into Circular Queue
        for(i = 0; i < 10; i++) {
            q.put((char) ('A' + i));
        }

        System.out.print("Contents of Circular Dynamic Queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(q.get());
        }

        for(i = 0; i < 10; i++) {
            q.put((char) ('A' + i));
        }

        // Get from Circular queue
        System.out.print("\nContents of Circular Dynamic Queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(q.get());
        }

        q.reset();
        for(i = 0; i < 10; i++) {
            q.put((char) ('A' + i));
        }
        System.out.print("\nContents of Circular Dynamic Queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(q.get());
        }
    }
}