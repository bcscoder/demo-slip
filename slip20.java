Q1) Write a Program to illustrate multilevel Inheritance such that 
country is inherited from continent. State is inherited from country. 
Display the place, state, country and continent.
--------------------------------------------------------------
import java.util.Scanner;
class Continent {
 String continentName;
 Continent(String name) {
 this.continentName = name;
 }
 void displayContinent() {
 System.out.println("Continent: " + continentName);
 }
}
class Country extends Continent {
 String countryName;
 Country(String continentName, String countryName) {
 super(continentName);
 this.countryName = countryName;
 }
 void displayCountry() {
 displayContinent();
 System.out.println("Country: " + countryName);
 }
}
class State extends Country {
 String stateName;
 State(String continentName, String countryName, String stateName)
{
 super(continentName, countryName);
 this.stateName = stateName;
 }
 void displayState() {
 displayCountry();
 System.out.println("State: " + stateName);
 }
}
public class PlaceHierarchy {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter Continent Name: ");
 String continentName = scanner.nextLine();
 System.out.print("Enter Country Name: ");
 String countryName = scanner.nextLine();
 System.out.print("Enter State Name: ");
 String stateName = scanner.nextLine();
 State userState = new State(continentName, countryName,stateName);
 userState.displayState();
 scanner.close();
 }
}
**************************************************************************
Q2) Write a package for Operation, which has two classes, Addition and 
Maximum. Addition has two methods add () and subtract (), which are 
used to add two integers and subtract two, float values respectively. 
Maximum has a method max () to display the maximum of two integers
1.Addition.java
-------------------------------
package Operation;
public class Addition {
 public int add(int num1, int num2) {
 return num1 + num2;
 }
 public float subtract(float num1, float num2) {
 return num1 - num2;
 }
}


Maximum.java
-------------
package Operation;
public class Maximum {
 public int max(int num1, int num2) {
 return Math.max(num1, num2);
 }
}


Main.java
--------
import Operation.Addition;
import Operation.Maximum;
public class OperationDemo {
 public static void main(String[] args) {
 Addition addObj = new Addition();
 Maximum maxObj = new Maximum();
 int resultAdd = addObj.add(5, 3);
 float resultSubtract = addObj.subtract(7.5f, 3.2f);
 int resultMax = maxObj.max(8, 12);
 System.out.println("Addition result: " + resultAdd);
 System.out.println("Subtraction result: " + resultSubtract);
 System.out.println("Maximum result: " + resultMax);
 }
}