package Mentor.Lesson16.Task3;

public class App {
    public static void main(String[] args) {
        GroceryShopping shopping = new GroceryShopping();

        Product milk = new Dairy("Milla", 10, 10);
        Product banana = new FreshProduce("Banana", 1, 10);
        Product salami = new Meat("Doktorskaya", 2, 20);

        shopping.addProduct(milk);
        shopping.addProduct(banana);
        shopping.addProduct(salami);

        shopping.display();

    }
}
