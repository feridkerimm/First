package Mentor.Lesson18;

public class Product {
    private long id;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(long id, String name, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public void reduceStock(int quantity) {
        this.stockQuantity -= quantity;
    }
}
