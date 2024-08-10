package Mentor.Lesson17;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            AuthenticateManagement.login(username, password);
            System.out.println("Login successful!");
        } catch (AuthenticationException e) {
            System.err.println(e.getMessage());
        }
    }
}
