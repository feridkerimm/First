package Main.Lesson13.NormalLevel;

class Car extends Vehicle {

    private int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public void displayInfo() {

        System.out.println("Car details: " + make + ", " + model + ", " + numDoors);
    }

}
