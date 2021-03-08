package strings6;

public class SubstringDemo {
    public static void main(String[] args) {
        // String substring(int startIndex)
        // String substring(int startIndex, int endIndex)
        StringBuffer sb = new StringBuffer("This is a Test");
        System.out.println(sb.substring(5, 7));
        System.out.println(sb);
    }
}
