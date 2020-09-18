
public class AssignRef {
    public static void main(String args[]) {
        int[] nums1 = new int[10];
        int nums2[] = new int[10];

        for (int i = 0; i < 10; i++){
            nums1[i] = i;
            nums2[i] = -i;
        }
        System.out.print("Here is nums1: ");
        for (int i = 0; i < 10; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.print("Here is nums2: ");
        for (int i = 0; i < 10; i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // Assign nums1 to nums2
        nums2 = nums1;
        System.out.print("Here is nums2 after assignment: ");
        for (int i = 0; i < 10; i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // Change the nums 2
        nums2[0] = 100;
        System.out.print("Here is nums1 after changing nums2: ");
        for (int i = 0; i < 10; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

    }
}