Q1) Accept the names of two files and copy the contents of the first 
to the second. First file having Book name and Author name in file.
------------------------------------------------------------
 import java.io.*;
import java.util.*;
public class FileCopy {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 try {
 System.out.print("Enter the name of the source file: ");
 String sourceFileName = scanner.nextLine();
 System.out.print("Enter the name of the destination file: ");
 String destinationFileName = scanner.nextLine();
 copyFileContents(sourceFileName, destinationFileName);
 System.out.println("Contents copied successfully!");
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 } finally {
 scanner.close();
 }
 }
 private static void copyFileContents(String sourceFileName, String destinationFileName) throws IOException {
 try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
 PrintWriter writer = new PrintWriter(new FileWriter(destinationFileName))) {
 String line;
 while ((line = reader.readLine()) != null) {
 String[] parts = line.split(",");
 if (parts.length == 2) {
 String bookName = parts[0].trim();
 String authorName = parts[1].trim();
 writer.println("Book: " + bookName + ", Author: "+ authorName);
 }
 }
 }
 }
}
*****************************************************************
Q2) Write a program to define a class Account having members custname, 
accno. Define default and parameterized constructor. Create a subclass 
called SavingAccount with member savingbal, minbal. Create a derived 
class AccountDetail that extends the class SavingAccount with members, 
depositamt and withdrawalamt. Write a appropriate method to display 
customer details.
-----------------------------------------------------------------------------
 import java.util.Scanner;
class Account {
 String custName;
 long accNo;
 Account() {
 }
 Account(String custName, long accNo) {
 this.custName = custName;
 this.accNo = accNo;
 }
}
class SavingAccount extends Account {
 double savingBal;
 double minBal;
 SavingAccount() {
 }
 SavingAccount(String custName, long accNo, double savingBal,
double minBal) {
 super(custName, accNo);
 this.savingBal = savingBal;
 this.minBal = minBal;
 }
}
class AccountDetail extends SavingAccount {
 double depositAmt;
 double withdrawalAmt;
 AccountDetail() {
 }
 AccountDetail(String custName, long accNo, double savingBal,
double minBal, double depositAmt, double withdrawalAmt) {
 super(custName, accNo, savingBal, minBal);
 this.depositAmt = depositAmt;
 this.withdrawalAmt = withdrawalAmt;
 }
 void displayCustomerDetails() {
 System.out.println("Customer Name: " + custName);
 System.out.println("Account Number: " + accNo);
 System.out.println("Saving Balance: " + savingBal);
 System.out.println("Minimum Balance: " + minBal);
 System.out.println("Deposit Amount: " + depositAmt);
 System.out.println("Withdrawal Amount: " + withdrawalAmt);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter Customer Name: ");
 String custName = scanner.nextLine();
 System.out.print("Enter Account Number: ");
 long accNo = scanner.nextLong();
 System.out.print("Enter Saving Balance: ");
 double savingBal = scanner.nextDouble();
 System.out.print("Enter Minimum Balance: ");
 double minBal = scanner.nextDouble();
 System.out.print("Enter Deposit Amount: ");
 double depositAmt = scanner.nextDouble();
 System.out.print("Enter Withdrawal Amount: ");
 double withdrawalAmt = scanner.nextDouble();
 AccountDetail accountDetails = new AccountDetail(custName,accNo, savingBal, minBal, depositAmt, withdrawalAmt);
 accountDetails.displayCustomerDetails();
 scanner.close();
 }
}
