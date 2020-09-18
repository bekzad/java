
public class StringArray {
    public static void main(String args[]) {
        String strs[] = {"This", "is", "test"};

        for(String s: strs) {
            System.out.print(s + " ");
        }
        System.out.println();

        strs[1] = "was";
        strs[2] = "a test, too";

        for(String s: strs) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}