package Mentor.VehicleApp;

class AirVehicle extends Vehicle {
    private double wingSpan;
    private String enginePower;

    public AirVehicle(String make, String model, int topSpeed, double wingSpan, String enginePower) {
        super(make, model, topSpeed);
        this.wingSpan = wingSpan;
        this.enginePower = enginePower;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public void takeOff() {
        System.out.println("The plane gracefully lifts off the runway.");
    }

    public void land() {
        System.out.println("The plane touches down on the runway.");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane accelerates.");
    }

    @Override
    public void brake() {
        System.out.println("The plane brakes.");
    }

    @Override
    public String toString() {
        return super.toString() + ", WingSpan: " + wingSpan + ", EnginePower: " + enginePower;
    }
}