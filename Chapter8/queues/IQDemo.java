package queues;

import qpack.CircularQueue;
import qpack.DynQueue;
import qpack.FixedQueue;
import qpack.ICharQ;

public class IQDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q2 = new CircularQueue(10);
        DynQueue q3 = new DynQueue(5);

        ICharQ q;
        int i;

        // Store into Fixed Queue
        q = q1;
        for(i = 0; i < 10; i++) {
            q.put((char) ('A' + i));
        }
        // Get from fixed queue
        System.out.print("Contents of Fixed Queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(q.get());
        }

        System.out.println();

        // Store into Dynamic Queue
        q = q3;
        for(i = 0; i < 11; i++) {
            q.put((char) ('A' + i));
        }
        // Get from Dynamic queue
        System.out.print("Contents of Dynamic Queue: ");
        for(i = 0; i < 11; i++) {
            System.out.print(q.get());
        }

        System.out.println();

        // Store into Circular Queue
        q = q2;
        for(i = 0; i < 10; i++) {
            q.put((char) ('A' + i));
        }
        // Get from Circular queue
        System.out.print("Contents of Circular Queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(q.get());
        }

        System.out.println();

        // Store more into Circular Queue
        for(i = 10; i < 20; i++) {
            q.put((char) ('A' + i));
        }
        // Get from Circular queue
        System.out.print("More contents of Circular Queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(q.get());
        }

        // Store and consume from circular queue as much as you want
        System.out.print("\nStore and consume from circular queue: ");
        for(i = 0; i < 20; i++) {
            q.put((char) ('A' + i));
            System.out.print(q.get());
        }
    }
}
