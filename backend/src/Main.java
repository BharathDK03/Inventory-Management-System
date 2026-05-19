package backend.src;

import java.util.Scanner;

import backend.src.InventoryService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventoryService service = new InventoryService();

        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. View Products");
            System.out.println("2. Place Order");
            System.out.println("3. Refill Stock");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.displayProducts();
                    break;

                case 2:

                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    service.placeOrder(pid, qty);
                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int rid = sc.nextInt();

                    System.out.print("Enter Refill Quantity: ");
                    int rqty = sc.nextInt();

                    service.refillStock(rid, rqty);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}