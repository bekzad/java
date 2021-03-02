package strings1;
// Constructing a String from byte array (ascii -> u16) and int array (int -> u16)
// Every character in a String is 16 bits
public class SubstringCons {
    public static void main(String[] args) {
        // 1 byte to two bytes for bytes
        byte ascii[] = {65, 66, 67, 68, 69, 70};

        String s1 = new String(ascii);
        System.out.println(s1);

        // Substring of a byte array
        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);

        // We can also construct a String from unicode code points
        // 4 bytes to two bytes, can also specify Charset
        int codepoints[] = {65, 66, 67, 68};
        String s3 = new String(codepoints, 0, 4);
        System.out.println(s3);

        // Length is a method in a String because String is a class with a hidden property
        // and it has a public method length to get it
        System.out.println(s3.length());
    }
}
