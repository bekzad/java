package threads9;

public class UseMain {
    public static void main(String[] args) {
        // Get the main thread
        Thread thrd = Thread.currentThread();

        // Main threads name and priority
        System.out.println("Main thread is called: " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());

        // Set the name and priority for main thread
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        // Display them
        System.out.println("Main thread is now called: " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());

        // Don't add thrd.join statement here because it will never end
    }
}
