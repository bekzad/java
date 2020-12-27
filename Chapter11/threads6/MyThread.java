package threads6;

public class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    public static MyThread createAndStart(String name, int nums[]) {
        MyThread newThread = new MyThread(name, nums);
        newThread.thrd.start();
        return newThread;
    }

    public void run() {
        System.out.println(thrd.getName() + " is starting");

        // You can have synchronized calls like this or have synchronized methods
        synchronized (sa) {
            answer = sa.sumArray(a);
        }

        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating");
    }
}
