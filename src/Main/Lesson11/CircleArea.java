package Main.Lesson11;

public class CircleArea {
    double radius;


    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "CircleArea{" +
                "radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        CircleArea radius = new CircleArea(10);
        System.out.println("Area of circle: " + radius.getArea());
    }


}
