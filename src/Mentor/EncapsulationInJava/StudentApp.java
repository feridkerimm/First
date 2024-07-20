package Mentor.EncapsulationInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

    private final static List<Student> students = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What operation would you like to do? ");
            System.out.println("1.Add student:");
            System.out.println("2.View student's details with ID:");
            System.out.println("3.Update students with ID");
            System.out.println("4.Exit");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter the ID of student: ");
                    Long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Enter the name of student: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter the age of student: ");
                    int age = scanner.nextInt();

                    System.out.println("Enter the grade of student: ");
                    double grade = scanner.nextDouble();

                    Student stdnt = new Student(id, name, age, grade);
                    students.add(stdnt);
                    break;
                case 2:
                    System.out.println("Enter the ID of students whom you want to view details. ");
                    Long searchID = scanner.nextLong();

                    for (Student student : students) {
                        if (student.getStudentId().equals(searchID)) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the ID of students whom you want to update details. ");
                    Long updateID = scanner.nextLong();
                    System.out.println("Enter the new ID. ");
                    Long newID = scanner.nextLong();
                    for (Student st : students) {
                        if (st.getStudentId().equals(updateID)) {
                            st.setStudentId(newID);
                            System.out.println("Update was successful..");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
            }


        }


    }


}
