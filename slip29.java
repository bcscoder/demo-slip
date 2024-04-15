Q1) Write a program to create a class 
Customer(custno,custname,contactnumber,custaddr). Write a method to 
search the customer name with given contact number and display the 
details.
-------------------------------------------------------------------------
import java.util.*;
class Customer {
 private int custno;
 private String custname;
 private String contactnumber;
 private String custaddr;
 public Customer(int custno, String custname, String contactnumber,String custaddr) {
 this.custno = custno;
 this.custname = custname;
 this.contactnumber = contactnumber;
 this.custaddr = custaddr;
 }
 public String getContactNumber() {
 return contactnumber;
 }
 public void displayDetails() {
 System.out.println("Customer Number: " + custno);
 System.out.println("Customer Name: " + custname);
 System.out.println("Contact Number: " + contactnumber);
 System.out.println("Customer Address: " + custaddr);
 }
}
public class CustomerSearch {
 public static void main(String[] args) {
 ArrayList<Customer> customers = new ArrayList<>();
 customers.add(new Customer(1, "John Doe", "1234567890", "123 
Main St"));
 customers.add(new Customer(2, "Jane Smith", "9876543210", "456 
Oak Ave"));
 customers.add(new Customer(3, "Bob Johnson", "5551112222","789 Elm Blvd"));
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter Contact Number to search: ");
 String searchContactNumber = scanner.nextLine();
 boolean found = false;
 for (Customer customer : customers) {
 if
(customer.getContactNumber().equals(searchContactNumber)) {
 customer.displayDetails();
 found = true;
 break;
 }
 }
 if (!found) {
 System.out.println("Customer with contact number " + searchContactNumber + " not found.");
 }
 scanner.close();
 }
}
************************************************************************
Q2) Write a program to create a super class Vehicle having members 
Company and price. Derive two different classes 
LightMotorVehicle(mileage) and HeavyMotorVehicle (capacity_in_tons). 
Accept the information for "n" vehicles and display the information in 
appropriate form. While taking data, ask user about the type of 
vehicle first
------------------------------------------------
 import java.util.Scanner;
class Vehicle {
 String company;
 double price;
 public Vehicle(String company, double price) {
 this.company = company;
 this.price = price;
 }
 public void displayInfo() {
 System.out.println("Company: " + company);
 System.out.println("Price: $" + price);
 }
}
class LightMotorVehicle extends Vehicle {
 double mileage;
 public LightMotorVehicle(String company, double price, double mileage) {
 super(company, price);
 this.mileage = mileage;
 }
 public void displayInfo() {
 super.displayInfo();
 System.out.println("Mileage: " + mileage + " km/l");
 }
}
class HeavyMotorVehicle extends Vehicle {
 double capacityInTons;
 public HeavyMotorVehicle(String company, double price, double capacityInTons) {
 super(company, price);
 this.capacityInTons = capacityInTons;
 }
 public void displayInfo() {
 super.displayInfo();
 System.out.println("Capacity in Tons: " + capacityInTons + " tons");
 }
}
public class VehicleDemo {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of vehicles: ");
 int n = scanner.nextInt();
 Vehicle[] vehicles = new Vehicle[n];
 for (int i = 0; i < n; i++) {
 System.out.print("Enter vehicle type (1 for Light Motor Vehicle, 2 for Heavy Motor Vehicle): ");
 int vehicleType = scanner.nextInt();
 scanner.nextLine(); 
 System.out.print("Enter Company: ");
 String company = scanner.nextLine();
 System.out.print("Enter Price: $");
 double price = scanner.nextDouble();
 if (vehicleType == 1) {
 System.out.print("Enter Mileage: ");
 double mileage = scanner.nextDouble();
 vehicles[i] = new LightMotorVehicle(company, price,mileage);
 } else if (vehicleType == 2) {
 System.out.print("Enter Capacity in Tons: ");
 double capacityInTons = scanner.nextDouble();
 vehicles[i] = new HeavyMotorVehicle(company, price,
capacityInTons);
 } else {
 System.out.println("Invalid vehicle type. Enter 1 or 2.");
 i--;
 }
 }
 System.out.println("\nVehicle Information:");
 for (Vehicle vehicle : vehicles) {
 vehicle.displayInfo();
 System.out.println("---------------------");
 }
 scanner.close();
 