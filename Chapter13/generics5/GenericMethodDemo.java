package generics5;

public class GenericMethodDemo {

    // Generic method
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) return false; // arrays differ
        }

        return true; // contents of arrays are the same
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4, 5};
        Integer[] nums3 = {1, 2, 7, 4, 5};

        if (arraysEqual(nums1, nums2)) {
            System.out.println("nums1 and nums2 are equal");
        }

        if (arraysEqual(nums1, nums3)) {
            System.out.println("nums1 and nums3 are equal");
        } else {
            System.out.println("nums1 and nums3 differ");
        }

        Double[] dvals = {1.1, 2.2, 3.3};
        Double[] dvals2 = {1.1, 2.2, 3.3};
        if (arraysEqual(dvals, dvals2)) {
            System.out.println("dvals and dvals2 are equal");
        }

        // This will not compile because they have different types
//        if(arraysEqual(nums1, dvals))
    }
}
