package backend.src;

import java.util.ArrayList;

public class InventoryService {

    private ArrayList<Product> products = new ArrayList<>();

    public InventoryService() {

        products.add(new Product(1, "Laptop", 10, 55000, "Dell Supplier"));
        products.add(new Product(2, "Mouse", 50, 500, "HP Supplier"));
        products.add(new Product(3, "Keyboard", 30, 1200, "Logitech Supplier"));
        products.add(new Product(4, "Monitor", 15, 8000, "Samsung Supplier"));
    }

    public void displayProducts() {

        System.out.println("\n===== PRODUCT LIST =====");

        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void placeOrder(int productId, int quantity) {

        for (Product p : products) {

            if (p.getId() == productId) {

                p.reduceStock(quantity);

                System.out.println(quantity + " item(s) ordered successfully.");
                System.out.println("Updated Stock: " + p.getStock());

                return;
            }
        }

        System.out.println("Product not found!");
    }

    public void refillStock(int productId, int quantity) {

        for (Product p : products) {

            if (p.getId() == productId) {

                p.refillStock(quantity);

                System.out.println("Refill order placed successfully.");
                System.out.println("Updated Stock: " + p.getStock());

                return;
            }
        }

        System.out.println("Product not found!");
    }
}