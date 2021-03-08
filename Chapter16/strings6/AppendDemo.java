package strings6;

public class AppendDemo {
    public static void main(String[] args) {
        // StringBuffer append(String str)
        // StringBuffer append(int num)
        // StringBuffer append(Object obj)
        int a = 42;
        StringBuffer sb = new StringBuffer(5);
        System.out.println(sb.capacity());

        String s = sb.append("a = ").append(a).append('!').toString();
        System.out.println(s);
        System.out.println(sb);

        // Capacity will increase by itself if needed
        System.out.println(sb.capacity());
    }
}
