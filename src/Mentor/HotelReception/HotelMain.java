package Mentor.HotelReception;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelMain {
    private static final ArrayList<Room> rooms = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Hotel Management System");
            System.out.println("1. Add Room");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. List All Rooms");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    listAllRooms();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addRoom() {
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter room type (e.g., Standart, Deluxe, Suite): ");
        String type = scanner.nextLine();

        System.out.print("Is the room booked? (yes/no): ");
        boolean isBooked = scanner.nextLine().equalsIgnoreCase("yes");

        Room room = new Room(roomNumber, type, isBooked);
        rooms.add(room);
        System.out.println("Room added successfully.");
    }

    private static void bookRoom() {
        System.out.print("Enter room number to book: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();

        Room room = findRoomByNumber(roomNumber);
        if (room != null) {
            if (!room.isBooked()) {
                room.setBooked(true);
                System.out.println("Room booked successfully.");
            } else {
                System.out.println("Room is already booked.");
            }
        } else {
            System.out.println("Room not found.");
        }
    }

    private static void cancelBooking() {
        System.out.print("Enter room number to cancel booking: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();

        Room room = findRoomByNumber(roomNumber);
        if (room != null) {
            if (room.isBooked()) {
                room.setBooked(false);
                System.out.println("Booking canceled successfully.");
            } else {
                System.out.println("Room is not booked.");
            }
        } else {
            System.out.println("Room not found.");
        }
    }

    private static void listAllRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available.");
        } else {
            for (Room room : rooms) {
                room.print();
                System.out.println();
            }
        }
    }

    private static Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}