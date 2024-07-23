package Main.Lesson14;

public class ShapeCalculator {

    // for rectangle
    public int area(int width, int length) {
        return width * length;
    }

    // for circle
    public double area(double radius) {
        return Math.PI * radius * radius;

    }

    // for triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }


}