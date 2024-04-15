1.Write a program for multilevel inheritance such that Country is inherited from Continent. State is 
inherited from Country. Display the place, State, Country and Continent.
-------------------------------------------------------------------
package rohan123;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Continent
{
String con;
InputStreamReader i = new InputStreamReader(System.in);
BufferedReader r = new BufferedReader(i);
void con_input() throws IOException
{
System.out.println("Enter Continent Name: ");
con = r.readLine();
}
}
class Country extends Continent
{
String cou ;
void cou_input() throws IOException
{
System.out.println("Enter Country Name: ");
cou = r.readLine();
}
}
class State extends Country
{
String sta;
void sta_input() throws IOException
{
System.out.println("Enter State Name: ");
sta = r.readLine();
}
}
class Main extends State
{
String pla;
void pla_input()throws IOException
{
System.out.println("Enter Place Name : ");
pla = r.readLine();
}
public static void main( String argsp[] )throws IOException
{
Main s = new Main();
s.con_input();
s.cou_input();
s.sta_input();
s.pla_input();
System.out.println("\n\nContinent: "+s.con);
System.out.println("Country: "+s.cou);
System.out.println("State: "+s.sta);
System.out.println("Place :" + s.pla);
}
}

*************************************************************
2. Write a menu driven program to perform the following operations on multidimensional array ie 
matrices : 
.Addition .Multiplication  . Exit
----------------------------------------------------------------------------------

import java.util.Scanner;
public class MatrixOperations {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 while (true) {
 System.out.println("Matrix Operations Menu:");
 System.out.println("1. Addition");
 System.out.println("2. Multiplication");
 System.out.println("3. Exit");
 System.out.print("Enter your choice: ");
 int choice = scanner.nextInt();
 switch (choice) {
 case 1:
 performMatrixAddition(scanner);
 break;
 case 2:
 performMatrixMultiplication(scanner);
 break;
 case 3:
 System.out.println("Exiting program.");
 scanner.close();
 System.exit(0);
 default:
 System.out.println("Invalid choice. Please enter a 
valid option.");
 }
 }
 }
private static void performMatrixAddition(Scanner scanner) {
 System.out.println("Enter the dimensions of the matrices (rows 
and columns):");
 int rows = scanner.nextInt();
 int columns = scanner.nextInt();
 int[][] matrix1 = inputMatrix("Enter the elements of the first 
matrix:", scanner, rows, columns);
 int[][] matrix2 = inputMatrix("Enter the elements of the 
second matrix:", scanner, rows, columns);
 int[][] resultMatrix = new int[rows][columns];
 // Perform addition
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < columns; j++) {
 resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
 }
 }
 displayMatrix("Resultant Matrix (Addition):", resultMatrix);
 }
 private static void performMatrixMultiplication(Scanner scanner) {
 System.out.println("Enter the dimensions of the matrices (rows 
and columns):");
 int rowsMatrix1 = scanner.nextInt();
 int columnsMatrix1 = scanner.nextInt();
 int[][] matrix1 = inputMatrix("Enter the elements of the first 
matrix:", scanner, rowsMatrix1, columnsMatrix1);
 System.out.println("Enter the dimensions of the second matrix 
(rows and columns):");
 int rowsMatrix2 = scanner.nextInt();
 int columnsMatrix2 = scanner.nextInt();
 if (columnsMatrix1 != rowsMatrix2) {
 System.out.println("Matrix multiplication is not possible. 
The number of columns in the first matrix "
 + "must be equal to the number of rows in the 
second matrix.");
 return;
 }
 int[][] matrix2 = inputMatrix("Enter the elements of the 
second matrix:", scanner, rowsMatrix2, columnsMatrix2);
 int[][] resultMatrix = new int[rowsMatrix1][columnsMatrix2];
 // Perform multiplication
 for (int i = 0; i < rowsMatrix1; i++) {
 for (int j = 0; j < columnsMatrix2; j++) {
 for (int k = 0; k < columnsMatrix1; k++) {
 resultMatrix[i][j] += matrix1[i][k] *
matrix2[k][j];
 }
 }
 }
 displayMatrix("Resultant Matrix (Multiplication):",
resultMatrix);
 }
 private static int[][] inputMatrix(String prompt, Scanner scanner,
int rows, int columns) {
 System.out.println(prompt);
 int[][] matrix = new int[rows][columns];
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < columns; j++) {
 System.out.print("Enter element at position (" + (i +1) + ", " + (j + 1) + "): ");
 matrix[i][j] = scanner.nextInt();
 }
 }
 return matrix;
 }
 private static void displayMatrix(String prompt, int[][] matrix) {
 System.out.println(prompt);
 for (int i = 0; i < matrix.length; i++) {
 for (int j = 0; j < matrix[0].length; j++) {
 System.out.print(matrix[i][j] + " ");
 }
 System.out.println();
 }
 }
