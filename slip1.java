1.Write a Program to print all Prime numbers in an array of ‘n’ elements..
----------------------------------------------------------------------
import java.util.Scanner;
public class PrimeNumbers{
public static void main (String[] args){
 int[] array = new int [5];
 Scanner in = new Scanner (System.in);
 
 System.out.println("Enter the elements of the array: ");
 for(int i=0; i<5; i++)
 {
 array[i] = in.nextInt();
 }
 for(int i=0; i<array.length; i++){
 boolean isPrime = true;
  for (int j=2; j<array[i]; j++){
 
 if(array[i]%j==0){
 isPrime = false;
 break;
 }
 } if(isPrime)
 System.out.println(array[i] + " are the prime numbers in the
array ");
 }
}
}

******************************************************************************8
2. Define an abstract class Staff with protected members id and name. Define a parameterized 
constructor. Define one subclass OfficeStaff with member department. Create n objects of OfficeStaff 
and display all details
---------------------------------------------------------------------------------
import java.util.*;
abstract class Staff
{
protected int id;
protected String name;
public Staff(int id,String name) {
this.id=id;
this.name=name;
}
public abstract void display();
}
class OfficeStaff extends Staff{
protected String department;
public OfficeStaff(int id,String name,String department) { 
super(id,name);
this.department=department;
}
public void display() {
System.out.println("Id;"+id);
System.out.println("Name:"+name);
System.out.println("Department:"+department);
System.out.println("------------------------");
}
}
public class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of OfficeStaff members:");
int n=sc.nextInt();
OfficeStaff[] OfficeStaffArray=new OfficeStaff[n];
for(int i=0;i<n;i++)
 {
System.out.println("Enter the details for OfficeStaff"+(i+1));
System.out.println("Enter the ID::");
int id=sc.nextInt();
System.out.println("Enter the name::");
String name=sc.next();
System.out.println("Enter the department:");
String department=sc.next();
OfficeStaffArray[i]=new
OfficeStaff(id,name,department);
}
System.out.println("Details of OfficeStaff:");
for(int i=0;i<n;i++) {
OfficeStaffArray[i].display();
 }
 }
}