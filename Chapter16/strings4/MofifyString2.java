package strings4;

public class MofifyString2 {
    public static void main(String[] args) {
        String s1 = "one";
        String s2 = s1.concat("two");
        System.out.println(s2);

        // String replace(char original, char replacement)
        String s3 = "Hello, world";
        System.out.println(s3.replace('l', 'w'));

        // String replace(CharSequence original, CharSequence replacement)
        System.out.println(s3.replace("Hell", "Shol"));

        // Trims leading and trailing whitespace
        String s4 = "   Hello,    world    ".trim();
        System.out.println(s4);
    }
}
