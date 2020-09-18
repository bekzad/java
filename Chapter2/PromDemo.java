
public class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        // No cast needed because the result is promoted to an int
        b = 10;
        i = b * b;

        // Cast back to byte needed because the result is int
        b = 10;
        b = (byte) (b * b);

        // Cast back to a char is needed because the result is an int
        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);

        // Answer is in int
        System.out.println(ch1 + ch1);

        // Answer is in char
        System.out.println(ch1);

        // Integer division and casting it to double
        System.out.println(1 / 3);
        System.out.println((double) 1 / 3);

    }
}