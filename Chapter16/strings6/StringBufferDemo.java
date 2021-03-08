package strings6;
// StringBuffer allocates additional 16 chars so that not to reallocate strings
// StringBuffer is used for synchronized editable strings
// StringBuilder is for not synchronized editable strings
public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer( )
        // StringBuffer(int size)
        // StringBuffer(String str)
        // StringBuffer(CharSequence chars)
        StringBuffer sb = new StringBuffer("Hello");

        // Length and Max capacity without reallocation
        System.out.println(sb.length()); // 5
        System.out.println(sb.capacity()); // 21

        // void ensureCapacity(int minCapacity)
        // to change the minimum capacity after the creation of StringBuffer
        sb.ensureCapacity(50);
        System.out.println(sb.length()); // 5
        System.out.println(sb.capacity()); // 50

        // void setLength(int len)
        // Sets the length of a string inside a StringBuffer
        sb.setLength(2);
        System.out.println(sb.length()); // 2
        System.out.println(sb);

        sb.setLength(10);
        System.out.println(sb.length()); // 10
        System.out.println(sb);

        // char charAt(int where)
        // void setCharAt(int where, char ch)
        sb.setCharAt(0, 'B');
        System.out.println(sb.charAt(0));

        // void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart)
        // Not counting the sourceEnd
        // copy into the char array
        StringBuffer stringBuffer = new StringBuffer("Hello, world");
        char[] chars = new char[10];
        stringBuffer.getChars(0, 5, chars, 0);
        System.out.println(chars);

    }
}
