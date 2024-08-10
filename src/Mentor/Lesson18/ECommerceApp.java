package Mentor.Lesson18;

import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        PaymentProcessor paymentProcessor = new PaymentProcessor();


        catalog.addProduct(new Product(75321L, "Apple", 748.99, 100));
        catalog.addProduct(new Product(95123L, "Samsung", 666.66, 100));
        catalog.addProduct(new Product(85213L, "Huawei", 245.5, 100));

        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            try {
                System.out.println("Enter product name to order (or 'exit' to exit): ");
                String productName = scanner.nextLine();

                if (productName.equalsIgnoreCase("exit")) {
                    break;
                }

                Product product = catalog.findProductByName(productName);

                System.out.println("Enter the quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                order.addProduct(product, quantity);

                System.out.println("Added " + quantity + " of " + productName + " to the order.");

            } catch (ProductNotFoundException | InsufficientStockException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            order.processOrder(paymentProcessor);
        } catch (PaymentProcessingException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thank you for shopping with us!");
        scanner.close();
    }
}
