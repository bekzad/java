class QSort {
    static void quicksort(int a[]) {
        qs(a, 0, (a.length - 1));
    }
    // Recursion of QuickSort
    static void qs(int a[], int low, int high) {
        int pi;
        if (low < high) {
            pi = partitioning(a, low, high);
            qs(a,low, pi - 1);
            qs(a,pi + 1, high );
        }
    }
    // Partitioning logic of QuickSort
    static int partitioning(int a[], int low, int high) {
        int pi, temp;
        pi = low;
        int pivot = a[high];
        for (int i = low; i < high; i++) {
            if (a[i] <= pivot) {
                temp = a[i];
                a[i] = a[pi];
                a[pi] = temp;
                pi++;
            }
        }
        temp = a[pi];
        a[pi] = pivot;
        a[high] = temp;
        return pi;
    }
}

public class QuickSort2 {
    public static void main(String args[]) {
        int a[] = {5, 6, 1, 9, 8, 4, 2, 0};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        QSort.quicksort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
