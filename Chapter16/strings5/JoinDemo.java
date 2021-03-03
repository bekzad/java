package strings5;
// Easily join multiple strings
// static String join(CharSequence delim, CharSequence . . . strs)
public class JoinDemo {
    public static void main(String[] args) {
        // Instead of adding a delimiter every time you can add just once
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569",
                "E-mail: John@HerbSchildt.com");
        System.out.println(result);
    }
}
