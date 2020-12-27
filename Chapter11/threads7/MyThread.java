package threads7;

public class MyThread implements Runnable {
    Thread thrd;
    TickTock tickTock;

    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        tickTock = tt;
    }

    public static MyThread createAndStart(String name, TickTock tt) {
        MyThread newThread = new MyThread(name, tt);
        newThread.thrd.start();
        return newThread;
    }

    public void run() {

        if (thrd.getName().compareTo("Tick") == 0) {
            System.out.println("Thread tick started running");
            for (int i = 0; i < 5; i++) tickTock.tick(true);
            // This is the last one
            tickTock.tick(false);
        } else {
            System.out.println("\nThread tock started running");
            for (int i = 0; i < 5; i++) tickTock.tock(true);
            // This is the last one
            tickTock.tock(false);
        }
    }
}
