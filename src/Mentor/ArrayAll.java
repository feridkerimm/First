package Mentor;

import java.util.Scanner;

public class ArrayAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + ". number of array..");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max: " + max + " min: " + min);
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        System.out.println("The sum of the array numbers: " + sum);
        double average = (double) sum / size;
        System.out.println("The average: " + average);
        System.out.println(" ");
        System.out.print("Enter again the number that you wrote to find its index: ");
        int number = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (number == array[i]) {
                System.out.println("The index of " + number + " is " + i);
            }
            else{
                System.out.println(number+ " Is not in array." );
                break;
            }

        }



    }
}
