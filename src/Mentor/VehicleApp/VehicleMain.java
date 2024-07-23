package Mentor.VehicleApp;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {

        VehicleMain vehicle = new VehicleMain();
        vehicle.car();
        vehicle.plane();
        vehicle.boat();
        char continueInput;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nDo you want to add a new vehicle? (y/n)");
            continueInput = input.nextLine().toUpperCase().charAt(0);
            if (continueInput == 'Y') {
                vehicle.addVehicle();
            } else if (continueInput != 'N') {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        } while (continueInput != 'N');
        System.out.println("Exiting...");
        System.exit(0);


    }

    public void addVehicle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Which vehicle would you like to add? \n1.Car\n2.Plane\n3.Boat\n4.Exit ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter make of the car: ");
                String make = input.next();
                System.out.print("Enter model of the car: ");
                String model = input.next();
                System.out.print("Enter max speed of the car: ");
                int speed = input.nextInt();
                System.out.print("Enter numWheels of the car: ");
                int numWheels = input.nextInt();
                input.nextLine();
                System.out.print("Enter the engine type of the car: ");
                String engine = input.nextLine();

                GroundVehicle newCar = new GroundVehicle(make, model, speed, numWheels, engine);
                System.out.println("New Car Details: " + newCar);
                newCar.accelerate();
                newCar.drive();
                newCar.brake();
                newCar.park();
                break;
            case 2:
                System.out.print("Enter make of the plane: ");
                String make1 = input.next();
                System.out.print("Enter model of the plane: ");
                String model1 = input.next();
                System.out.print("Enter max speed of the plane: ");
                int speed1 = input.nextInt();
                System.out.print("Enter wingSpan of the plane: ");
                double wingSpan1 = input.nextDouble();
                input.nextLine();
                System.out.print("Enter the engine type of the plane: ");
                String engine1 = input.nextLine();

                AirVehicle newPlane = new AirVehicle(make1, model1, speed1, wingSpan1, engine1);
                System.out.println("New Plane Details: " + newPlane);
                newPlane.accelerate();
                newPlane.takeOff();
                newPlane.land();
                newPlane.brake();
                break;
            case 3:
                System.out.print("Enter make of the boat: ");
                String make2 = input.next();
                System.out.print("Enter model of the boat: ");
                String model2 = input.next();
                System.out.print("Enter max speed of the boat: ");
                int speed2 = input.nextInt();
                System.out.print("Enter hull type of the boat: ");
                String hullType = input.next();
                input.nextLine();
                System.out.print("Enter the engine type of the boat: ");
                String engine2 = input.nextLine();


                WaterVehicle newBoat = new WaterVehicle(make2, model2, speed2, hullType, engine2);
                System.out.println("New Boat Details: " + newBoat);
                newBoat.accelerate();
                newBoat.sail();
                newBoat.brake();
                newBoat.dock();


                break;
            case 4:
                System.out.print("Exiting");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid option.");

        }
    }


    public void car() {
        GroundVehicle car = new GroundVehicle("Ford", "Fusion", 260, 4, "Fuel Consumption");
        System.out.println("Details:" + car);
        car.accelerate();
        car.drive();
        car.brake();
        car.park();
        System.out.println();
    }

    public void plane() {
        AirVehicle plane = new AirVehicle("Boeing", " 747-8", 920, 68.4, "71,000 pounds of thrust per engine");
        System.out.println("Details:" + plane);
        plane.accelerate();
        plane.takeOff();
        plane.land();
        plane.brake();
        System.out.println();
    }

    public void boat() {
        WaterVehicle boat = new WaterVehicle("Sea Ray", "SLX 400", 50, "V-Hull", "700 horsepower");
        System.out.println("Details:" + boat);
        boat.accelerate();
        boat.sail();
        boat.brake();
        boat.dock();
    }

}
