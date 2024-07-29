package Mentor.Lesson16;

public class FlyableApp {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.takeOff();
        plane.land();
        plane.getDestination("125");
        plane.getCapacity();
        System.out.println();
        Bird bird = new Bird();
        bird.takeOff();
        bird.land();
        bird.getName();
        bird.makeSound();

    }
}
