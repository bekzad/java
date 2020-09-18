
public class LengthDemo {
    public static void main(String args[]) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = {
            {1, 1, 1},
            {2, 4},
            {3, 9, 10, 11}
        };
        System.out.println("The lenght of list " + list.length);
        System.out.println("The lenght of nums " + nums.length);
        System.out.println("The lenght of table " + table.length);
        System.out.println("The lenght of table[0] " + table[0].length);
        System.out.println("The lenght of table[1] " + table[1].length);
        System.out.println("The lenght of table[2] " + table[2].length);
        System.out.println();

        // Initialize list
        for (int i = 0; i < list.length; i++) {
            list[i] = i * i;
        }

        System.out.println("Here is the list:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}