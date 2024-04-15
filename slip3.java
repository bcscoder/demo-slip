1. Write a program to accept ‘n’ name of cities from the user and sort them in ascending order
---------------------------------------------------------------------------

package name;
class SortCity
{
public static void main(String arg[])
{
String name[]=new String[10];
int l=arg.length;
String temp;
for(int i=0;i<l;i++)
{
name[i]=arg[i];
}
for(int j=0;j<l;j++)
{
for(int k=j+1;k<l;k++)
{
if((name[j].compareTo(name[k]))<0)
{
temp=name[j];
name[j]=name[k];
name[k]=temp;
}
}
}
System.out.println("Sorted City Are-");
for(int i=0;i<l;i++)
{
System.out.println(name[i]);
}
}
}

*************************************************************************************
2.Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report). Create an 
object of patient. Handle appropriate exception while patient oxygen level less than 95% and HRCT scan 
report greater than 10, then throw user defined Exception “Patient is Covid Positive(+) and Need to 
Hospitalized” otherwise display its information.
----------------------------------------------------------------------

import java.util.*;
class Patient {
 String name;
 int age;
 int oxylevel;
 int HRCTreport;
  Patient(String name, int age, int oxylevel, int HRCTreport) {
 this.name = name;
 this.age = age;
 this.oxylevel = oxylevel;
 this.HRCTreport = HRCTreport;
 }
}
public class Main extends Patient {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("How many patients you want to insert:");
 int number = sc.nextInt();
 Patient[] ob = new Patient[number];
 for (int j = 0; j < number; j++) {
 System.out.println("Enter Name ");
 String name = sc.next();
 System.out.println("Enter Age ");
 int age = sc.nextInt();
 System.out.println("Enter oxygen level");
 int oxylevel = sc.nextInt();
 System.out.println("Enter HRCT report");
 int HRCTreport = sc.nextInt();
 ob[j] = new Patient(name, age, oxylevel, HRCTreport);
 }
 for (int j = 0; j < number; j++) {
 if (ob[j].oxylevel < 95 && ob[j].HRCTreport > 10) {
 try {
 throw new NullPointerException("\n");
 } catch (NullPointerException e) {
 System.out.println("Patient is Covid Positive(+) 
and Needs to be Hospitalized\n");
 }
 } else {
 System.out.println("name: " + ob[j].name);
 System.out.println("age " + ob[j].age);
 System.out.println("oxygen level " + ob[j].oxylevel);
 System.out.println("HRCT report " + ob[j].HRCTreport);
 System.out.println("\n");
 }
 }
 }
}
