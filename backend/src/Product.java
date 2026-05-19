package backend.src;

public class Product {
    private int id;
    private String name;
    private int stock;
    private double price;
    private String supplier;

    public Product(int id, String name, int stock, double price, String supplier) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
        } else {
            System.out.println("Not enough stock!");
        }
    }

    public void refillStock(int quantity) {
        stock += quantity;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Stock: " + stock +
                " | Price: " + price + " | Supplier: " + supplier;
    }
}