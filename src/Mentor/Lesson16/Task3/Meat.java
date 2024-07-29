package Mentor.Lesson16.Task3;

public class Meat extends Product {
    public Meat(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }


    @Override
    public String toString() {
        return String.format("Meat: %s, Unit Price: $%.2f, Amount: %.2f, Cost: $%.2f",
                name, unitPrice, amount, getCost());
    }
}