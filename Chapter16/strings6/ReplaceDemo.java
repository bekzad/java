package strings6;

public class ReplaceDemo {
    public static void main(String[] args) {
        // StringBuffer replace(int startIndex, int endIndex, String str)

        StringBuffer sb = new StringBuffer("This is a Test");
        sb.replace(5, 7, "was");
        System.out.println(sb);
    }
}
