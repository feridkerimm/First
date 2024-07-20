package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 2, 3, 0, 5, 6, 7, 8, 0};
        for (int n : numbers) {
            if (set.contains(n)) {
                System.out.println("Duplicate is found.");
            }
            set.add(n);
        }
    }
}