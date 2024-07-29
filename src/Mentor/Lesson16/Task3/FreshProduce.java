package Mentor.Lesson16.Task3;

public class FreshProduce extends Product {

    public FreshProduce(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }


    @Override
    public String toString() {
        return String.format("Fresh Produce: %s, Unit Price: $%.2f, Amount: %.2f, Cost: $%.2f",
                name, unitPrice, amount, getCost());
    }


}