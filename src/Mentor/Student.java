package Mentor;

import java.util.Scanner;

public class Student {
    private final int grade;
    private final String name;
    private final int age;


    public Student(int grade, String name, int age) {
        this.grade = grade;
        this.name = name;
        this.age = age;

    }

    public void display() {
        System.out.println("Name: " + name + "\nGrade: " + grade + "\nAge: " + age);
    }

    public void LetterForGrade() {
        System.out.print("You got ");
        switch ((grade-1) / 10) {
            case 10:
            case 9:
                System.out.println("'A'");
                break;
            case 8:
                System.out.println("'B'");
                break;
            case 7:
                System.out.println("'C'");
                break;
            case 6:
                System.out.println("'D'");
                break;
            case 5:
                System.out.println("'E'");
                break;
            default:
                System.out.println("'Fail'");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the grade of the student: ");
        int grade = sc.nextInt();
        System.out.println("Enter the age of the student: ");
        int age = sc.nextInt();
        Student student = new Student(grade, name, age);
        student.display();
        student.LetterForGrade();

    }

}