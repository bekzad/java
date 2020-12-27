package Test12;

public class ToolsDemo {
    public static void main(String[] args) {

        for (Tools i : Tools.values()) {
            System.out.println(i + " has an ordinal value of: " + i.ordinal());
        }
    }
}
