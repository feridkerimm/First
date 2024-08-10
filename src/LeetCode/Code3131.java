package LeetCode;

public class Code3131 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,1,1};
        int[] nums2 = {1,1,1,1,1};

        int max1 = 0, max2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > max1) {
                max1 = nums1[i];
            }
            if (nums2[i] > max2) {
                max2 = nums2[i];
            }
        }

        int result = max2 - max1;
        System.out.println("++" + result);
    }
}
