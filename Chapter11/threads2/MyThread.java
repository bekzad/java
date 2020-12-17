package threads2;

public class MyThread implements Runnable {
    Thread thrd;
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    public static MyThread createAndStart(String name) {
        MyThread newThread = new MyThread(name);
        newThread.thrd.start();
        return newThread;
    }

    public void run() {
        System.out.println(thrd.getName() + " is starting");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " count is " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thrd.getName() + " terminating");
    }
}
