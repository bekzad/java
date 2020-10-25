package Test;

public class RecursiveBackwards {
    public static void main(String args[]) {
        showBackwards("ABCDE");
    }
    static void showBackwards(String str) {
        show(str, str.length() - 1);
    }
    static void show(String str, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(str.charAt(index));

        show(str, --index);
    }
}
