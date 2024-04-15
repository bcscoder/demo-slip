Q1) Write a program to create parent class College(cno, cname, caddr) 
and derived class Department(dno, dname) from College. Write a 
necessary methods to display College details.
-------------------------------------------------------------------
class College {
 int collegeNumber;
 String collegeName;
 String collegeAddress;
 public College(int cno, String cname, String caddr) {
 collegeNumber = cno;
 collegeName = cname;
 collegeAddress = caddr;
 }
 public void displayCollegeDetails() {
 System.out.println("College Number: " + collegeNumber);
 System.out.println("College Name: " + collegeName);
 System.out.println("College Address: " + collegeAddress);
 }
}
class Department extends College {
 int departmentNumber;
 String departmentName;
 public Department(int cno, String cname, String caddr, int dno,String dname) {
 super(cno, cname, caddr);
 departmentNumber = dno;
 departmentName = dname;
 }
 public void displayDepartmentDetails() {
 displayCollegeDetails();
 System.out.println("Department Number: " + departmentNumber);
 System.out.println("Department Name: " + departmentName);
 }
}
public class Main {
 public static void main(String[] args) {
 Department departmentInstance = new Department(1, "Pvp College", "Loni", 101, "Computer Science");
 departmentInstance.displayDepartmentDetails();
 }
}
