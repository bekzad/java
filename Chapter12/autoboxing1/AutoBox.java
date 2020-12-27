package autoboxing1;

public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100; // this automatically creates the object

        int i = iOb; // This automatically unboxes the object

        i = iOb + 1;

        System.out.println(i + " " + iOb);
    }
}
