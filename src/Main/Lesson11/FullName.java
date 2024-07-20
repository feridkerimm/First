package Main.Lesson11;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname : ");
        String surName = scanner.nextLine();

        System.out.println("Full name: " +name+ " " +surName);
    }


}
