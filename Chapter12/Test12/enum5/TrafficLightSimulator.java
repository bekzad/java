package Test12.enum5;
// A computerized traffic light
public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor color;
    private boolean stop = false; // true to stop the simulation
    private boolean changed = false; // true when the light has changed

    TrafficLightSimulator(TrafficLightColor init) {
        color = init;
    }

    TrafficLightSimulator() {
        color = TrafficLightColor.RED;
    }

    @Override
    public void run() {
        while(!stop) {
            try {
                Thread.sleep(color.getDelay());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            changeColor();
        }
    } // Run method

    synchronized void changeColor() {
        switch (color) {
            case RED -> color = TrafficLightColor.GREEN;
            case YELLOW -> color = TrafficLightColor.RED;
            case GREEN -> color = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();
            }
            changed = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized TrafficLightColor getColor() {
        return color;
    }

    synchronized void cancel() {
        stop = true;
    }
}
