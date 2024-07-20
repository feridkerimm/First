package Mentor;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many books do you want to add?  = ");
        int row = scanner.nextInt();
        String[][] library = new String[row][2];
        scanner.nextLine();
        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + ".Book name:  ");
            library[i][0] = scanner.nextLine();
            System.out.print((i + 1) + ". Author name:  ");
            library[i][1] = scanner.nextLine();
        }

        for (int i = 0; i < row; i++) {
            System.out.println((i + 1) + ".Book: " + library[i][0] + "   " + "Author: " + library[i][1]);

        }


    }
}