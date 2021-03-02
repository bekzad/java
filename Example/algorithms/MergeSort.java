package algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 3, 10, -5, 6, 4};

        sort(numbers, numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    static void sort(int[] numbers, int length) {
        if (length < 2) {
            return;
        }

        int middle = (length + 1) / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for (int i = 0; i < length; i++) {
            if (i < middle) {
                leftArray[i] = numbers[i];
            } else {
                rightArray[i - middle] = numbers[i];
            }
        }

        sort(leftArray, leftArray.length);
        sort(rightArray, rightArray.length);
        merge(numbers, leftArray, rightArray, leftArray.length, rightArray.length);

    }

    static void merge(int[] numbers, int[] left, int[] right, int leftLength, int rightLength) {

        int indexLeft = 0;
        int indexRight = 0;
        int i = 0;

        // Merge two array accordingly
        while (indexLeft < leftLength && indexRight < rightLength) {
            if (left[indexLeft] <= right[indexRight]) {
                numbers[i++] = left[indexLeft++];
            } else {
                numbers[i++] = right[indexRight++];
            }
        }
        // If numbers are left merge from the left array just copy them
        while (indexLeft < leftLength) {
            numbers[i++] = left[indexLeft++];
        }
        // If numbers are left merge from the right array just copy them
        while (indexRight < rightLength) {
            numbers[i++] = right[indexRight++];
        }
    }
}
