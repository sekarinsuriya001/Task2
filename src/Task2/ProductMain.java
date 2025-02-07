package Task2;

import java.util.Scanner;

class Product {
   private String bid;
   private double price;
   private int quantity;
   // Parameterized constructor
   public Product(String bid, double price, int quantity) {
       this.bid = bid;
       this.price = price;
       this.quantity = quantity;
   }
   public String getBid() {
       return bid;
   }
   public double getPrice() {
       return price;
   }
   public int getQuantity() {
       return quantity;
   }
}
public class ProductMain {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Product[] products = new Product[5];
       // Accepting product information from user
       for (int i = 0; i < 5; i++) {
           System.out.println("Enter bid for product " + (i + 1) + ": ");
           String bid = scanner.nextLine();
           System.out.println("Enter price for product " + (i + 1) + ": ");
           double price = scanner.nextDouble();
           System.out.println("Enter quantity for product " + (i + 1) + ": ");
           int quantity = scanner.nextInt();
           scanner.nextLine(); // Consume newline
           products[i] = new Product(bid, price, quantity);
       }
       // Finding the bid of the product with the highest price
       String highestBid = findHighestPriceBid(products);
       System.out.println("Bid of the product with the highest price: " + highestBid);
       // Calculating total amount spent on all products
       double totalAmount = calculateTotalAmount(products);
       System.out.println("Total amount spent on all products: " + totalAmount);
   }
   public static String findHighestPriceBid(Product[] products) {
       double maxPrice = 0;
       String highestBid = "";
       for (Product product : products) {
           if (product.getPrice() > maxPrice) {
               maxPrice = product.getPrice();
               highestBid = product.getBid();
           }
       }
       return highestBid;
   }
   public static double calculateTotalAmount(Product[] products) {
       double total = 0;
       for (Product product : products) {
           total += product.getPrice() * product.getQuantity();
       }
       return total;
   }
}
