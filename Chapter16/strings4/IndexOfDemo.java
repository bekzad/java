package strings4;
// Searching for an index of a specified character or a substring
public class IndexOfDemo {
    public static void main(String[] args) {
        // int indexOf(int ch)
        String str = "Hello, world wide web";
        System.out.println(str.indexOf('w'));
        System.out.println(str.indexOf("world"));

        // int lastIndexOf(int ch)
        System.out.println(str.lastIndexOf('w'));

        // int indexOf(int ch, int startIndex)
        // search runs from startIndex to the end of the string
        System.out.println(str.indexOf('w', 8));

        // int lastIndexOf(int ch, int startIndex)
        // search runs from startIndex to zero
        System.out.println(str.lastIndexOf('w', 14));
    }
}
