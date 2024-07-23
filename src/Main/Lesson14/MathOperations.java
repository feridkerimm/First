package Main.Lesson14;

public class MathOperations {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    public double subtract(int a, double b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;


    }
}
