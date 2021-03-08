package strings6;

public class InsertDemo {
    public static void main(String[] args) {

        // StringBuffer insert(int index, String str)
        // StringBuffer insert(int index, char ch)
        // StringBuffer insert(int index, Object obj)
        // For inserting a string into a specific index
        StringBuffer sb2 = new StringBuffer("I Java");
        sb2.insert(1, " love");
        System.out.println(sb2);
    }
}
