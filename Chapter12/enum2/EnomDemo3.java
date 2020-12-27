package enum2;

public class EnomDemo3 {
    public static void main(String[] args) {
        Transport tp;
        // Speed of an Airplane
        System.out.println("Airplane speed: " + Transport.AIRPLANE.getSpeed());

        // Speed of all transports
        for (Transport t : Transport.values()) {
            System.out.println(t + " has a speed of " + t.getSpeed());
        }
    }
}
