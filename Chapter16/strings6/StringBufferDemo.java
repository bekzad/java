package strings6;
// StringBuffer allocates additional 16 chars so that not to reallocate strings
public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer( )
        // StringBuffer(int size)
        // StringBuffer(String str)
        // StringBuffer(CharSequence chars)
        StringBuffer sb = new StringBuffer("Hello");

        // Length and Max capacity without reallocation
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        // void ensureCapacity(int minCapacity)
        // to change the minimum capacity after the creation of StringBuffer
        sb.ensureCapacity(50);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
