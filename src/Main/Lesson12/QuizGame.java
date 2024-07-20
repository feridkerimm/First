package Main.Lesson12;

import java.util.Scanner;


public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. Which of these countries is NOT in Asia?",
                "2. Which country has the largest population?",
                "3. Which country is known as the Hexagon?"
        };

        String[][] options = {
                {"A) Bosnia", "B) Thailand", "C) Israel", "D) China"},
                {"A) India", "B)USA", "C)Turkey ", "D)Russia"},
                {"A) France", "B) Spain", "C) Germany", "D) Turkey"}
        };

        char[] correctAnswers = {'A', 'A', 'A'};
        int[] points = {1, 2, 3};

        int score = 0;


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Your answer (or type 'S' to skip): ");
            char answer = scanner.nextLine().toUpperCase().charAt(0);

            if (answer == 'S') {
                System.out.println("You chose to skip the question.");
                continue;
            }

            if (answer == correctAnswers[i]) {
                score += points[i];
                System.out.println("Correct! You've earned " + points[i] + " points.");
            } else {
                System.out.println("Incorrect! The correct answer was " + correctAnswers[i] + ".");
            }
        }

        System.out.println("Quiz finished! Your final score is: " + score);

        scanner.close();
    }
}

