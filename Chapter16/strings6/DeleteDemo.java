package strings6;

public class DeleteDemo {
    public static void main(String[] args) {
        // StringBuffer delete(int startIndex, int endIndex)
        // StringBuffer deleteCharAt(int loc)
        StringBuffer sb = new StringBuffer("012345678910");
        sb.delete(4, 7);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
