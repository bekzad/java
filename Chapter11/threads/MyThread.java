package threads;

public class MyThread implements Runnable {
    String thrdName;
    MyThread(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + " is starting");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + " count is " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thrdName + " terminating");
    }
}
