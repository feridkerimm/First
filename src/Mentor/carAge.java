package Mentor;

import java.time.Year;
import java.util.Scanner;

public class carAge {
    String make;
    String model;
    int year;
    double mil;

    public carAge(String make, String model, int year, double mil) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mil = mil;
    }

    public void milCalculate() {
        double km = mil * 1.6;
        System.out.println("Mil to KM: " + km);
    }

    public void carAgeCalculate() {
        System.out.println("Car Age : " + (Year.now().getValue() - year));
    }

    public void display() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Mil : " + mil);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Make : ");
        String make = sc.nextLine();
        System.out.println("Enter Model : ");
        String model = sc.nextLine();
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        System.out.println("Enter Mil : ");
        double mil = sc.nextDouble();
        carAge carAge = new carAge(make, model, year, mil);
        carAge.display();
        carAge.milCalculate();
        carAge.carAgeCalculate();

    }
}
