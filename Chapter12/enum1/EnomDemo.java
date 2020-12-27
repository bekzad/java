package enum1;

public class EnomDemo {
    public static void main(String[] args) {
        Transport tp; // Declare a transport reference


        tp = Transport.AIRPLANE; // Assign tp the constant AIRPLANE

        System.out.println("Value of tp is: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("tp contains TRAIN\n");

        switch(tp) {
            case CAR:
                System.out.println("The value of tp in switch is CAR");
                break;
            case TRUCK:
                System.out.println("The value of tp in switch is TRUCK");
                break;
            case AIRPLANE:
                System.out.println("The value of tp in switch is AIRPLANE");
                break;
            case TRAIN:
                System.out.println("The value of tp in switch is TRAIN");
                break;
            case BOAT:
                System.out.println("The value of tp in switch is BOAT");
                break;
        }
    }
}
