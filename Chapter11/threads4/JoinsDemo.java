package threads4;

public class JoinsDemo {
    public static void main(String[] args) {
        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child #1 joined");
            mt2.thrd.join();
            System.out.println("Child #2 joined");
            mt3.thrd.join();
            System.out.println("Child #3 joined");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ending");
    }
}

