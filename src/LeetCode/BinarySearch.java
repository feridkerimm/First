package LeetCode;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {0, 1, 4, 6, 7, 9, 11};
        int target = 9;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                System.out.println("-----------" +mid);
                return;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("there is no target");
    }
}
