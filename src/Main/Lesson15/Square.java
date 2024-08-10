package Main.Lesson15;
public class Square extends Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
