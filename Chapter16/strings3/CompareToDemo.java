package strings3;
// Compares to strings
public class CompareToDemo {
    static String arr[] = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };
    public static void main(String[] args) {
        // Bubble sort case sensitive
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("\n");

        // Case insensitive
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
