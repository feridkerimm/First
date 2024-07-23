package LeetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {


        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;
        int maxVolume = 0;

        while (left < right) {

            int min = Math.min(height[left], height[right]);
            int width = right - left;
            int volume = width * min;
            if (volume > maxVolume) maxVolume = volume;
            if (height[left] < height[right]) left++;
            else right--;


        }
        System.out.println(maxVolume);
    }
}