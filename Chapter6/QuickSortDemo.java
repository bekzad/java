/* Demonstrates Quick Sort algorithm */

class QuickSort {

    static void qSort(int[] a) {
        qs(a,0, a.length - 1);
    }
    private static void qs(int[] a, int left, int right) {

        int i = left, j = right;
        int temp;
        int pivot = a[(left + right) / 2];

        // Partitioning
        do {
            while(a[i] < pivot && i < right) i++;
            while(a[j] > pivot && j > left) j--;

            // Swap a[i] and a[j]
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++; j--;
            }

        } while(i <= j);

        // Recursive part
        if (left < j) qs(a, left, j);
        if (i < right) qs(a, j + 1, right);
    }
}

public class QuickSortDemo {
    public static void main(String args[]) {
        int a[] = {25, 36, 45, 54, 8, 9, -5, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        QuickSort.qSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}
