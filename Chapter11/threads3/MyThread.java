package threads3;

public class MyThread extends Thread {
    MyThread (String name) {
        super(name);
    }

    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);
        myThrd.start();
        return myThrd;
    }

    public void run() {
        System.out.println(getName() + " is starting");

        for (int i = 0; i < 10; i++) {
            System.out.println("In " + getName() + " count is " + i);
        }

        System.out.println(getName() + " terminating");
    }
}
