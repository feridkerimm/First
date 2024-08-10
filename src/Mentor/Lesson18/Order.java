package Mentor.Lesson18;


import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> orderedProducts = new HashMap<>();

    public void addProduct(Product product, int quantity) throws InsufficientStockException {
        if (product.getStockQuantity() < quantity) {
            throw new InsufficientStockException("Not enough stock for product: " + product.getName());
        }
        orderedProducts.put(product, quantity);
    }

    public void processOrder(PaymentProcessor paymentProcessor) throws PaymentProcessingException {
        double totalAmount = 0;

        for (Map.Entry<Product, Integer> entry : orderedProducts.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            product.reduceStock(quantity);
            totalAmount += product.getPrice() * quantity;
        }

        paymentProcessor.processPayment(totalAmount);
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }
}
