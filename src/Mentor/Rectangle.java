package Mentor;

import java.util.Scanner;

public class Rectangle {
    private final int width;
    private final int length;
    private final String color;

    public Rectangle(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public double calculateArea() {
        return width * length;
    }

    public String Color() {
        return color;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the color of the rectangle: ");
        sc.nextLine();
        String color = sc.nextLine();
        Rectangle rectangle = new Rectangle(width, length, color);
        String shape = (width == length) ? "Square" : "Rectangle";
        double area = rectangle.calculateArea();
        String clr = rectangle.Color();
        System.out.println("The area of the " + clr + " " + shape + " is " + area);

    }


}