package Main.Lesson15;

public class AppCalculateArea {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Square square = new Square(5);

        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());

    }
}