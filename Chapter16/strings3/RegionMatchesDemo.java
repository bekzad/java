package strings3;
// Comparing a specific regions of two strings
public class RegionMatchesDemo {
    public static void main(String[] args) {

        //boolean regionMatches(int startIndex, String str2,
        //int str2StartIndex, int numChars)
        String greeting = "Hello";
        String greeting2 = "Hello, world";
        String greeting3 = "HELLO, WORLD";
        System.out.println(greeting.regionMatches(0, greeting2, 0, 5));

        // boolean regionMatches(boolean ignoreCase, int startIndex, String str2,
        //int str2StartIndex, int numChars)
        // Ignoring the case
        System.out.println(greeting.regionMatches(true, 0, greeting3, 0, 5));

        // boolean startsWith(String str)
        System.out.println(greeting2.startsWith(greeting));
        // boolean endsWith(String str)
        System.out.println(greeting2.endsWith("world"));

        // boolean startsWith(String str, int startIndex)
        System.out.println(greeting2.startsWith("world", 7));
    }
}
