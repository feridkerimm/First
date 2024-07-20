package Mentor.HotelReception;

public class Room {
    private int roomNumber;
    private String type;
    private boolean isBooked;

    public Room(int roomNumber, String type, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = isBooked;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setRoomType(String type) {
        this.type = type;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public void print() {
        String status = isBooked ? "Booked" : "Available";
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + type);
        System.out.println("Status: " + status);
    }
}