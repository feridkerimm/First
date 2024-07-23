package Mentor.VehicleApp;

class WaterVehicle extends Vehicle {
    private String hullType;
    private String enginePower;

    public WaterVehicle(String make, String model, int topSpeed, String hullType, String enginePower) {
        super(make, model, topSpeed);
        this.hullType = hullType;
        this.enginePower = enginePower;
    }

    public String getHullType() {
        return hullType;
    }

    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public void sail() {
        System.out.println("The boat cuts through the waves gracefully.");
    }

    public void dock() {
        System.out.println("The boat is secured at the dock.");
    }

    @Override
    public void accelerate() {
        System.out.println("The boat accelerates.");
    }

    @Override
    public void brake() {
        System.out.println("The boat brakes.");
    }

    @Override
    public String toString() {
        return super.toString() + ", HullType: " + hullType + ", Engine Power: " + enginePower;
    }
}
