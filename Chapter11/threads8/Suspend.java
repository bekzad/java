package threads8;

public class Suspend {
    public static void main(String[] args) {
        MyThread mt1 = MyThread.createAndStart("Child #1");

        try {
            Thread.sleep(1000); // let the mt1 start executing

            mt1.mySuspend();
            System.out.println("Suspending a thread");
            Thread.sleep(1000);

            mt1.myResume();
            System.out.println("Resuming a thread");
            Thread.sleep(1000);

            mt1.mySuspend();
            System.out.println("Suspending a thread");
            Thread.sleep(1000);

            mt1.myResume();
            System.out.println("Resuming a thread");
            Thread.sleep(1000);

            mt1.mySuspend();
            System.out.println("Stopping a thread");
            mt1.myStop();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            mt1.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread exiting");
    }
}