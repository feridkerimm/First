package Mentor.Lesson18;

import java.util.Scanner;

public class UserRegistrationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username = scanner.nextLine();
        System.out.print("Enter the password: ");
        String passwoord = scanner.nextLine();

        try {
            UserRegistration.registerUser(username, passwoord);
        } catch (UserRegistrationException e) {
            System.err.println("Registration error: " + e.getMessage());
        }
    }
}
