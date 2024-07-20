package Mentor;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the rows for tree: ");
        int rows = scanner.nextInt();
        for (int i = rows; i > 0; i--) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
