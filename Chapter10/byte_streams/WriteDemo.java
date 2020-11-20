/*
    Writing to a console using write method
 */

package byte_streams;

public class WriteDemo {
    public static void main(String[] args) {
        int b;
        b = 'X';

        System.out.printf("%c", b);

        System.out.write(b);
        System.out.write('\n');
    }
}
