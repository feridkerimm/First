package Main;

import java.util.Scanner;

public class CarGarage {
    public static void main(String[] args) {

        String[][] garage = {{"Ford", "Mercedes", "Bmw",},
                {"-----", "Lexus", "Lamborghini"},
                {"Ferrari", "-----", "Honda"},
                {"Maserati", "Hummer", "-----"}};
        // to show garage
        showGarage(garage);
        spacePlace(garage);
        // to add new car
        addCar(garage);
        showGarage(garage);
        spacePlace(garage);
        // to add new car
        addCar(garage);
        showGarage(garage);
        spacePlace(garage);
    }

    public static void showGarage(String[][] garage) {
        for (String[] row : garage) {
            for (String k : row) {
                System.out.print("|");
                System.out.print(k);
                System.out.print("| ");

            }
            System.out.println();
        }
    }

    public static void spacePlace(String[][] garage) {
        int count = 0;
        for (String[] car : garage) {
            for (String space : car) {
                if (space.equals("-----")) {
                    count++;
                }
            }
        }

        System.out.println("we have " + count + " empty place.");

    }

    public static void addCar(String[][] garage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the new car name to add: ");
        String carName = scanner.nextLine();

        while (true) {
            System.out.print("Enter row number: ");
            int row = scanner.nextInt();
            System.out.print("Enter column number: ");
            int column = scanner.nextInt();
            scanner.nextLine();

            if (row >= 0 && row < garage.length && column >= 0 && column <= garage[row].length) {
                if (garage[row][column].equals("-----")) {
                    garage[row][column] = carName;
                    System.out.println("Car added at: [" + row + ", " + column + "]");
                    break;
                } else {
                    System.out.println("This place is already taken. Try another spot.");
                }
            } else {
                System.out.println("Invalid position. Try again.");
            }

        }
    }
}