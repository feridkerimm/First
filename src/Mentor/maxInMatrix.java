package Mentor;

import java.util.Random;
import java.util.Scanner;

public class maxInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows do you want? ");
        int rows = scanner.nextInt();
        System.out.print("How many columns do you want? ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(100);
                System.out.print(array[i][j]);
                if ((j+1) < array[i].length) {
                    System.out.print(", ");
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }

            }
            System.out.println();

        }
        System.out.println("\nMaximum number is " + max);
    }
}