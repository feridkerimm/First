package Main.Lesson13.NormalLevel;

class Bike extends Vehicle {
    private int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    public void displayInfo() {

        System.out.println("Bike details: " + make + ", " + model + ", " + numWheels);
    }


}
