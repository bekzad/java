package strings2;

import java.util.Arrays;

// Different ways to extract characters from the String
public class CharacterExtraction {
    public static void main(String[] args) {
        // can't use an index operator []
        char ch = "abc".charAt(1);
        System.out.println(ch);

        // To get multiple chars at a time
        // void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart)
        String s = "This is a demo of the getChars method.";
        char[] target = new char[4];
        s.getChars(10, 14, target, 0);
        System.out.println(target);

        // To convert a String to 1 byte bytes to send over the internet
        // we can use getBytes
        String s2 = "This is a demo of the getChars method.";
        byte[] target2 = new byte[4];
        s.getBytes(10, 14, target2, 0);
        System.out.println(Arrays.toString(target2));

        // Conveniently convert all the characters in a String into a character array
        // we can use char[] toCharArray()
        char[] target3 = "This is a demo of the getChars method.".toCharArray();
        System.out.println(target3);

    }
}
