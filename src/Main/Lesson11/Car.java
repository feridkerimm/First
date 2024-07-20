package Main.Lesson11;

public class Car {

    String make;
    String model;


    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        Car car = new Car("Ford","Fusion");

        System.out.println(car.getMake()+ " " +car.getModel() );


    }

}
