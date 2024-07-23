package Main.Lesson14;

import java.util.Scanner;

public class ShapeMain {
    private int totalScore = 0;

    public void playGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which shape would you like to use?");
        System.out.println("Rectangle, Circle, Triangle");
        String shape = sc.nextLine().toLowerCase();
        switch (shape) {
            case "rectangle":
                System.out.println("Enter width and length of the rectangle");
                int width = sc.nextInt();
                int length = sc.nextInt();
                ShapeCalculator rectangle = new ShapeCalculator();
                System.out.println("Area of the rectangle is " + rectangle.area(width, length));
                totalScore += 3;
                break;
            case "circle":
                System.out.println("Enter radius of the circle ");
                double radius = sc.nextDouble();
                ShapeCalculator circle = new ShapeCalculator();
                System.out.println("The are of circle is " + circle.area(radius));
                totalScore += 5;
                break;
            case "triangle":
                System.out.println("Enter base and height of the triangle");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                ShapeCalculator triangle = new ShapeCalculator();
                System.out.println("The area of triangle is " + triangle.area(base, height));
                totalScore += 10;
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Your total score is " + totalScore);
    }

    public static void main(String[] args) {

        ShapeMain shape = new ShapeMain();
        shape.playGame();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue? (y/n)");
            String choice = sc.nextLine().toLowerCase();
            if (choice.equalsIgnoreCase("y")) {
                shape.playGame();
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
        while (true);
    }
}
