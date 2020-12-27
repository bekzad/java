package autoboxing1;

public class Autobox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 99;
        System.out.println("Original value of iOb is: " + iOb);

        // Unboxing incrementing reboxing
        iOb++;
        System.out.println("Iob++: " + iOb);

        // Unboxing incrementing reboxing
        iOb2 = iOb + (iOb / 3);
        System.out.println("Iob2: " + iOb2);

        // Unboxing incrementing not reboxing the result
        i = iOb + 3;
        System.out.println("i: " + i);

        // iOb unboxed inside a switch expression
        switch(iOb) {
            case 99:
                System.out.println(iOb);
                break;
            case 100:
                System.out.println(iOb);
                break;
        }
    }
}
