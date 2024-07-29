package Mentor.Lesson16;

public class Bird implements Animal,Flyable{


    @Override
    public void getName() {
        System.out.println("Owl.");
    }

    @Override
    public void makeSound() {
        System.out.println("oooooo");
    }

    @Override
    public void takeOff() {
        System.out.println("Owl can fly. ");
    }

    @Override
    public void land() {
        System.out.println("Owl is landing.");
    }
}
