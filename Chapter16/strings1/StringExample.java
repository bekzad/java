package strings1;

public class StringExample {
    public static void main(String[] args) {
        // Creating a String from char array
        char chars[] = { 'a', 'b', 'c' };
        String s = new String(chars);
        System.out.println(chars);
        System.out.println(s);

        // Accessing a subarray
        char chars2[] = { 'a', 'b', 'c', 'd', 'e' };
        String s2 = new String(chars2, 2, 3);
        System.out.println(s2);

        // Accessing a length in char array is not a method but a property
        System.out.println(chars.length);

    }
}
