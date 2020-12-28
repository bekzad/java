package queue1;

public class FixedQueueDemo {
    public static void main(String[] args) throws QueueEmptyException,
                                                    QueueFullException{

        Integer[] a = new Integer[5];

        FixedQueue<Integer> queue = new FixedQueue<>(a);

        for (int i = 0; i < 5; i++) queue.put(i);

        try {
            queue.put(5);
        } catch (QueueFullException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 5; i++) System.out.println(queue.get());

        try {
            queue.get();
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }


    }
}
