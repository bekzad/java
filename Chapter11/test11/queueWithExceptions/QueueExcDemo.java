package test11.queueWithExceptions;

public class QueueExcDemo {
    public static void main(String args[]) {

        FixedQueue q1 = new FixedQueue(10);
        MyThread mt1 = MyThread.createAndStart("Child #1", q1);
        MyThread mt2 = MyThread.createAndStart("Child #2", q1);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
