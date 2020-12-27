package generics2;

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> object = new TwoGen<>(25, "A string example");

        object.showTypes();

        int i = object.getOb1();
        String str = object.getOb2();

        System.out.println("Values: " + i + "\n" + str);
    }
}
