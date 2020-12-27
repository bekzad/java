package test11;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {

        // This is the last statement of the thread
        if (!running) {
            state = "ticked";
            // Notify any waiting threads at the end of the program
            // Otherwise the program will never finish
            notify();
            return;
        }

        System.out.print("Tick ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set the current state to ticked
        state = "ticked";
        // Let the tock run
        notify();
        try {
            while (!state.equals("tocked")) {
                wait(); // Wait for the tock to finish
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void tock(boolean running) {

        // This is the last statement of the thread
        if (!running) {
            state = "tocked";
            notify(); // Notify any waiting threads
            return; // stop the clock
        }

        System.out.println("Tock");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set the current state to tocked
        state = "tocked";

        // Let the tick run
        notify();
        try {
            while (!state.equals("ticked")) {
                wait(); // Wait for the tick to finish
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
