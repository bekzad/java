package threads;

public class UseThreads {
    public static void main(String[] args) {
        // Creating a runnable object
        MyThread mt = new MyThread("Child #1");

        // Constructing a new thread from that object
        Thread newThrd = new Thread(mt);

        Thread newThrd2 = new Thread(mt, "Child #2");

        // Start execution
        newThrd.start();
        newThrd2.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finishing main thread");
    }
}
