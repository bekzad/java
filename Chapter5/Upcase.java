
public class Upcase {
    public static void main(String args[]) {
        char ch;

        for (int i = 0; i < 26; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            ch = (char) (ch | 0b0000_0000_0010_0000);
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}