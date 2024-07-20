package Main.Lesson13.NormalLevel;

class Shape {

    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double w;
    private final double l;

    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;

    }


    @Override
    public double calculateArea() {
        double area = super.calculateArea();
        double rectangleArea = w * l;
        return area + rectangleArea;
    }
}

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

    }
}
