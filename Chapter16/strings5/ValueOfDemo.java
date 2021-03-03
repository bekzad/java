package strings5;

// The valueOf( ) method converts data from its internal format into a human-readable form
// For the most part toString and valueOf methods are the same
public class ValueOfDemo {
    public static void main(String[] args) {
        double d = 14.5;
        long l = 20;
        Object ob = new Box();
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        int[] ints = {1, 2, 3};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(l));

        System.out.println(String.valueOf(ob));

        // valueOf in arrays returns address of an array
        System.out.println(ints.toString());
        System.out.println(String.valueOf(ints));
        System.out.println(ints);

        // valueOf in a char array returns a String object
        System.out.println(String.valueOf(chars));
        System.out.println(chars.toString());
        System.out.println(chars);

        // static String valueOf(char chars[ ], int startIndex, int numChars)
        // subset of a char array
        System.out.println(String.valueOf(chars, 0, 2));
    }
}

class Box {}

