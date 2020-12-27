package enum3;

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp, tp2, tp3;

        System.out.println("Ordinal values of all transports: ");
        for (Transport t : Transport.values()) {
            System.out.println(t + "'s ordinal values is " + t.ordinal());
        }

        tp = Transport.AIRPLANE;
        tp2 = Transport.CAR;
        tp3 = Transport.AIRPLANE;

        if (tp.compareTo(tp2) < 0) System.out.println(tp + " comes before " + tp2);
        if (tp.compareTo(tp2) > 0) System.out.println(tp2 + " comes before " + tp);
        if (tp.compareTo(tp3) == 0) System.out.println(tp + " has the same ordinal value as " + tp3);
    }
}
