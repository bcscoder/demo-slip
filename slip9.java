Q1) Define a “Clock” class that does the following ;
a. Accept Hours, Minutes and Seconds
b. Check the validity of numbers
c. Set the time to AM/PM mode 
Use the necessary constructors and methods to do the above task 
------------------------------------------------------------------------------------
import java.util.Scanner;
public class Clock {
 private int hours;
 private int minutes;
 private int seconds;
 private String amPm;
 public Clock(int hours, int minutes, int seconds) {
 setClock(hours, minutes, seconds);
 }
 public void setClock(int hours, int minutes, int seconds) {
 if (isValidTime(hours, minutes, seconds)) {
 this.hours = hours;
 this.minutes = minutes;
 this.seconds = seconds;
 this.amPm = (hours >= 12) ? "PM" : "AM";
 } else {
 System.out.println("Invalid time. Please provide valid hours (0-23), minutes (0-59), and seconds (0-59).");
 }
 }
 private boolean isValidTime(int hours, int minutes, int seconds) {
 return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59);
 }
 public void displayTime() {
 System.out.println("Time: " + String.format("%02d", hours) +":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds) + " " + amPm);
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter hours (0-23): ");
 int hours = scanner.nextInt();
 System.out.print("Enter minutes (0-59): ");
 int minutes = scanner.nextInt();
 System.out.print("Enter seconds (0-59): ");
 int seconds = scanner.nextInt();
 Clock clock = new Clock(hours, minutes, seconds);
 clock.displayTime();
 scanner.close();
 }
}

**********************************************************
Q2) Write a program to using marker interface create a class Product 
(product_id, product_name, product_cost, product_quantity) default and 
parameterized constructor. Create objectsof class product and display 
the contents of each object and Also display the object count.
----------------------------------------------------------------------------
interface Displayable {
}
class Product implements Displayable {
 private static int objectCount = 0;
 private int productId;
 private String productName;
 private double productCost;
 private int productQuantity;
 public Product() {
 objectCount++;
 }
 public Product(int productId, String productName, double
productCost, int productQuantity) {
 this.productId = productId;
 this.productName = productName;
 this.productCost = productCost;
 this.productQuantity = productQuantity;
 objectCount++;
 }
 public void display() {
 System.out.println("Product ID: " + productId);
 System.out.println("Product Name: " + productName);
 System.out.println("Product Cost: " + productCost);
 System.out.println("Product Quantity: " + productQuantity);
 System.out.println("-----------------------");
 }
 public static int getObjectCount() {
 return objectCount;
 }
}
public class Main {
 public static void main(String[] args) {
 Product product1 = new Product(1, "Laptop", 1200.50, 5);
 Product product2 = new Product(2, "Mobile Phone", 500.75, 10);
 Product product3 = new Product();
 product1.display();
 product2.display();
 product3.display();
 System.out.println("Total Objects: " +
Product.getObjectCount());
 }
}
