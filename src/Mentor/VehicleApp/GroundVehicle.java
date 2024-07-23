package Mentor.VehicleApp;

class GroundVehicle extends Vehicle {
    private int numWheels;
    private String engineType;

    public GroundVehicle(String make, String model, int topSpeed, int numWheels, String engineType) {
        super(make, model, topSpeed);
        this.numWheels = numWheels;
        this.engineType = engineType;
    }



    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void drive() {
        System.out.println("The vehicle smoothly navigates the road.");
    }

    public void park() {
        System.out.println("The vehicle effortlessly parks in the spot.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerates.");
    }

    @Override
    public void brake() {
        System.out.println("The car brakes.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Num Wheels: " + numWheels + ", Engine Type: " + engineType;
    }
}
