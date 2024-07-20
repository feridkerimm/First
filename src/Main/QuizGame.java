package Main;

import java.util.Scanner;

public class QuizGame {
    Scanner scanner = new Scanner(System.in);

    public void startQuiz() {
        System.out.println("Welcome to the science quiz..Good luck to you! ");
    }

    public char[] askQuestions() {
        System.out.println("1.What is the chemical symbol for water? A, B or C ");
        System.out.print("A.HNO3 B.CO2 C.H2O : ");
        char answer1 = scanner.nextLine().toLowerCase().charAt(0);
        System.out.println("2.What is capital of Brazil? ");
        System.out.println("A.Agcabedi B.Rio de janeiro C.Brazil :");
        char answer2 = scanner.nextLine().toLowerCase().charAt(0);

        System.out.println("3.Which country has the most World Cup titles ? A, B or C ");
        System.out.println("A.Argentina B.Germany C.Brazil :");
        char answer3 = scanner.nextLine().toLowerCase().charAt(0);

        return new char[]{answer1, answer2, answer3};
    }


    public void evaluate(char[] options) {
        int count = 0;
        char[] correctAnswers = {'c', 'c', 'c'};
        for (int i = 0; i < correctAnswers.length; i++) {
            if (options[i] == correctAnswers[i]) {
                System.out.println((i + 1) + ". is correct.");
                count++;
            } else {
                System.out.println((i + 1) + ". is wrong");
            }
        }
        System.out.println("You have " + count + " correct answers. ");
    }
}
