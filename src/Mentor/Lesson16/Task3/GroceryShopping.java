package Mentor.Lesson16.Task3;

import java.util.ArrayList;

public class GroceryShopping {
    ArrayList<Product> shoppingList = new ArrayList<>();

    public void addProduct(Product p) {
        shoppingList.add(p);
    }

    public double totalPrice() {
        double total = 0;
        for (Product p : shoppingList) {
            total += p.getCost();
        }
        return total;
    }

    public void display() {
        System.out.println("Receipt: ");
        for (Product p : shoppingList) {
            System.out.println(p);
        }
        System.out.println("Total Price: " + totalPrice());
    }


}
