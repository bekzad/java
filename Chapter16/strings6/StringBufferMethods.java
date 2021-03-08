package strings6;
// Showing various other methods of StringBuffer
public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a Test Test Test");

        System.out.println(sb.appendCodePoint(65));
        System.out.println(sb.codePointAt(0));
        System.out.println(sb.codePointBefore(1));
        System.out.println(sb.codePointCount(0, 3));

        System.out.println("indexOf: " + sb.indexOf("Test"));
        System.out.println("fromIndex(11): " + sb.indexOf( "Test", 11));
        System.out.println("lastIndexOf: " + sb.lastIndexOf("Test"));
        System.out.println("lastIndexOf fromIndex(11): " + sb.lastIndexOf("Test", 11));

        System.out.println(sb.offsetByCodePoints(0, 5));

        // CharSequence subSequence(int startIndex, int stopIndex)
        // The same as substring method
        System.out.println(sb.subSequence(0, 4));

        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}
