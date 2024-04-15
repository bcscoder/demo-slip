Q1) Write a program to find the cube of given number using functional 
interface. 
--------------------------------------------------
interface CubeCalculator {
 double calculateCube(double number);
}
public class CubeCalculatorProgram {
 public static void main(String[] args) {
 double number = 5.0;
 CubeCalculator cubeCalculator = (n) -> n * n * n;
 double cubeResult = cubeCalculator.calculateCube(number);
 System.out.println("Cube of " + number + " is: " +
cubeResult);
 }
}

****************************************************
Q2) Write a program to create a package name student. Define class 
StudentInfo with method to display information about student such as 
rollno, class, and percentage. Create another class StudentPer with 
method to find percentage of the student. Accept student details like 
rollno, name, class and marks of 6 subject from user.
1. 1.Create a folder named "student" to organize the package.
2. 2.Inside the "student" folder, create two Java files: StudentInfo.java and
StudentPer.java.
StudentInfo.java (inside the "student" package):
-------------------------------------------------------------------------------
package student;
public class StudentInfo {
 private int rollNo;
 private String name;
 private String studentClass;
 private double percentage;
 public StudentInfo(int rollNo, String name, String studentClass) {
 this.rollNo = rollNo;
 this.name = name;
 this.studentClass = studentClass;
 }
 public void displayInfo() {
 System.out.println("Student Information:");
 System.out.println("Roll Number: " + rollNo);
 System.out.println("Name: " + name);
 System.out.println("Class: " + studentClass);
 System.out.println("Percentage: " + percentage + "%");
 }
 public double getPercentage() {
 return percentage;
 }
 public void setPercentage(double percentage) {
 this.percentage = percentage;
 }
}

------------------
StudentPer.java (inside the "student" package):
---------------------
import java.util.Scanner;
public class StudentPer {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter Roll Number: ");
 int rollNo = scanner.nextInt();
 System.out.print("Enter Name: ");
 scanner.nextLine();
 String name = scanner.nextLine();
 System.out.print("Enter Class: ");
 String studentClass = scanner.nextLine();
 System.out.println("Enter Marks for 6 Subjects:");
 double totalMarks = 0;
 for (int i = 1; i <= 6; i++) {
 System.out.print("Subject " + i + ": ");
 double marks = scanner.nextDouble();
 totalMarks += marks;
 }
 double percentage = (totalMarks / 600) * 100;
 StudentInfo studentInfo = new StudentInfo(rollNo, name,
studentClass);
 studentInfo.setPercentage(percentage);
 studentInfo.displayInfo();
 scanner.close();
 }
}
