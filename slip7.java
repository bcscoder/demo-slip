1. Design a class for Bank. Bank Class should support following operations; 
a. Deposit a certain amount into an account
b. Withdraw a certain amount from an account
c. Return a Balance value specifying the amount with detail
--------------------------------------------------------------------------------------
import java.util.Scanner;
class BankDetails {
 private String accno;
 private String name;
 private String acc_type;
 private long balance;
 Scanner sc = new Scanner(System.in);
 public void openAccount() {
 System.out.print("Enter Account No: ");
 accno = sc.next();
 System.out.print("Enter Account type: ");
 acc_type = sc.next();
 System.out.print("Enter Name: ");
 name = sc.next();
 System.out.print("Enter Balance: ");
 balance = sc.nextLong();
 }
 public void showAccount() {
 System.out.println("Name: " + name + "\nAccount No.: " + accno+ "\nAccount Type: " + acc_type + "\nBalance: " + balance);
 }
 public void deposit() {
 System.out.print("Enter the amount to deposit: ");
 balance += sc.nextLong();
 System.out.println("Balance after deposit: " + balance);
 }
 public void withdrawal() {
 System.out.print("Enter the amount to withdraw: ");
 long amt = sc.nextLong();
 if (balance >= amt) {
 balance -= amt;
 System.out.println("Balance after withdrawal: " +balance);
 } else {
 System.out.println("Insufficient balance. Transaction failed.");
 }
 }
 public boolean search(String ac_no) {
 return accno.equals(ac_no);
 }
}
public class Employee {
 public static void main(String arg[]) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number of customers: ");
 int n = sc.nextInt();
 BankDetails[] accounts = new BankDetails[n];
 for (int i = 0; i < accounts.length; i++) {
 accounts[i] = new BankDetails();
 accounts[i].openAccount();
 }
 int choice;
 do {
 System.out.println("\n Banking System Application");
 System.out.println("1. Display all account details");
 System.out.println("2. Search by Account number");
 System.out.println("3. Deposit amount");
 System.out.println("4. Withdraw amount");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 choice = sc.nextInt();
 switch (choice) {
 case 1:
 for (BankDetails account : accounts) {
 account.showAccount();
 }
break;
 case 2:
 case 3:
 case 4:
 System.out.print("Enter Account No.: ");
 String ac_no = sc.next();
 boolean found = false;
 for (BankDetails account : accounts) {
 if (account.search(ac_no)) {
 switch (choice) {
 case 2:
 account.showAccount();
 break;
 case 3:
 account.deposit();
 break;
 case 4:
 account.withdrawal();
 break;
 }
 found = true;
 break;
 }
 }
if (!found) {
 System.out.println("Account not found.");
 }
 break;
 case 5:
 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please enter a valid option.");
 }
 } while (choice != 5);
 sc.close();
 }
}

*********************************************************************************
Q2. Write a program to accept a text file from user and display the 
contents of a file in reverse order and change its case.
--------------------------------------------------------------------------
import java.io.*;
public class ReverseAndChangeCase {
 public static void main(String[] args) {
 try {
 System.out.print("Enter the name of the text file: ");
 BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
 String fileName = br.readLine();
 String fileContents = readFileContents(fileName);
 displayReversedAndChangeCase(fileContents);
 } catch (IOException e) {
 System.err.println("Error reading the file: " +e.getMessage());
 }
 }
 private static String readFileContents(String fileName) throws IOException 
 {
 StringBuilder contentBuilder = new StringBuilder();
 try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
 {
 String line;
 while ((line = reader.readLine()) != null) {
 contentBuilder.append(line).append("\n");
 }
 }
 return contentBuilder.toString();
 }
 private static void displayReversedAndChangeCase(String content) {
 StringBuilder reversedAndChangedCase = new StringBuilder(content).reverse();
 for (int i = 0; i < reversedAndChangedCase.length(); i++) {
 char currentChar = reversedAndChangedCase.charAt(i);
 if (Character.isUpperCase(currentChar)) {
 reversedAndChangedCase.setCharAt(i,Character.toLowerCase(currentChar));
 } else if (Character.isLowerCase(currentChar)) {
 reversedAndChangedCase.setCharAt(i,Character.toUpperCase(currentChar));
 }
 }
 System.out.println("reverse order and case changed:\n" + reversedAndChangedCase);
 }
}