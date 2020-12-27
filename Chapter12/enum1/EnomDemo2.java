package enum1;

public class EnomDemo2 {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("All Transport constants");
        Transport[] allTransports = Transport.values();
        for (Transport t: allTransports) {
            System.out.print(t + " ");
        }

        System.out.println();

        // We could write the for loop this way without creating allTransports variable
        for (Transport t: Transport.values()) {
            System.out.print(t + " ");
        }

        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);

        // This will throw illegal argument exception if the
        // enum type doesn't contain the string inside valueOf()
//        tp = Transport.valueOf("MOTORCYCLE");
    }
}
