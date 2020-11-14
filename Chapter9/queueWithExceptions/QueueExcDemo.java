package queueWithExceptions;

public class QueueExcDemo {
    public static void main(String args[]) {

        FixedQueue q1 = new FixedQueue(10);

        ICharQ q;
        int i;

        // Store into Fixed Queue
        q = q1;
        try {
            for (i = 0; i < 12; i++) {
                q.put((char) ('A' + i));
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }

        // Get from fixed queue
        System.out.print("Contents of Fixed Queue: ");
        try {
            for (i = 0; i < 12; i++) {
                System.out.print(q.get());
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
