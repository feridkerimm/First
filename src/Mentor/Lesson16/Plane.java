package Mentor.Lesson16;

public class Plane implements Flyable,Transport{
    String destination;
    int capacity;

    @Override
    public void takeOff() {
        System.out.println("Plane can take off");
    }

    @Override
    public void land() {
        System.out.println("The plane can land.");
    }

    @Override
    public void getCapacity() {
        System.out.println("The capacity of plane is for 100 people ");
    }

    @Override
    public void getDestination(String destination) {
        this.destination = destination;
        System.out.println(destination);
    }

    @Override
    public void setDestination() {

    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
