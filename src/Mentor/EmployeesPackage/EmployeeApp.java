package Mentor.EmployeesPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApp {
    private final static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("What operation would you like to do? ");
            System.out.println("1.Add employee:");
            System.out.println("2.Display all employees:");
            System.out.println("3.Display totalSalaries");
            System.out.println("4.Exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the id of the employee: ");
                    Long id = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Enter the name of the employee: ");
                    String name = sc.nextLine();

                    System.out.println("Enter the salary of the employee: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();


                    Employee emp = new Employee(id, name, salary);
                    employees.add(emp);
                    break;

                case 2:
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Total salaries of employees: " + Employee.totalSalaries);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    System.exit(0);

            }
        }
    }
}