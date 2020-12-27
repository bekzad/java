package threads3;

public class ExtendThread {
    public static void main(String[] args) {
        // Create and start a thread
        MyThread mt = MyThread.createAndStart("Child #1");

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
