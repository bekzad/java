package threads3;

public class IsAliveDemo {
    public static void main(String[] args) {
        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");

        do {
            System.out.print(".");
        } while (mt1.isAlive() ||
                mt2.isAlive() ||
                mt3.isAlive());
        System.out.println("Main thread ending");
    }
}
