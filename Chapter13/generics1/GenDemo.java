package generics1;

public class GenDemo {
    public static void main(String[] args) {
        // Create a generic reference variable for Integers
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();

        // Getting the value in iOb. No cast is needed
        int i = iOb.getOb();
        System.out.println("Value in iOb: " + i);

        Gen<String> strOb = new Gen<>("Some example string");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value in strOb: " + str);
    }
}
