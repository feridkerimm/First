package LeetCode;

import java.util.Arrays;

public class Code1460 {
    public static void main(String[] args) {
        int[] target = {1, 2, 0, 4};
        int[] arr = {3, 2, 1, 4};
        Arrays.sort(target);
        Arrays.sort(arr);
        if (Arrays.equals(target, arr)) {
            System.out.println("True. ");
            return;
        }
        System.out.println("False.");

    }
}
