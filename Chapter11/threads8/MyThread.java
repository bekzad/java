package threads8;

public class MyThread implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;
    MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static MyThread createAndStart(String name) {
        MyThread newThread = new MyThread(name);
        newThread.thrd.start();
        return newThread;
    }

    public void run() {
        System.out.println(thrd.getName() + " is starting");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");

                if (i % 10 == 0) {
                    System.out.println();
                    thrd.sleep(250);
                }

                // Use synchronized block to check suspended and stopped
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException e) {
            System.err.println(thrd.getName() + " is interrupted");
        }
        System.out.println(thrd.getName() + " terminating");
    } // run

    synchronized void myStop() {
        stopped = true;

        // This makes sure that a suspended thread can be stopped
        suspended = false;
        notify();
    }

    synchronized void mySuspend() {
        suspended = true;
    }

    synchronized void myResume() {
        suspended = false;
        notify();
    }
}
