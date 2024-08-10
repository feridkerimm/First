package Mentor.Lesson18;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getName().toLowerCase(), product);
    }

    public Product findProductByName(String productName) throws ProductNotFoundException {
        Product product = products.get(productName.toLowerCase());
        if (product == null) {
            throw new ProductNotFoundException("Product not found: " + productName);
        }
        return product;
    }
}

