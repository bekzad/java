package Test12.enum5;

public enum TrafficLightColor {
    RED(2000), GREEN(1500), YELLOW(1000);

    private int delay;
    TrafficLightColor(int d) { delay = d; }

    public int getDelay() { return delay; }
}
