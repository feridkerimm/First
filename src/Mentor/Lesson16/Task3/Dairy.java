package Mentor.Lesson16.Task3;

public class Dairy extends Product {


    public Dairy(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }


    public String toString() {
        return String.format("Dairy: %s, Unit Price: $%.2f, Amount: %.2f, Cost: $%.2f",
                name, unitPrice, amount, getCost());
    }
}