Q1) Write a program to accept a file name from command prompt, if the 
file exits then display number of words and lines in that file
--------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileWordLineCounter {
 public static void main(String[] args) {
 if (args.length == 0) {
 System.out.println("Please provide the file name as a 
command line argument.");
 return;
 }
 String fileName = args[0];
 try {
 int wordCount = 0;
 int lineCount = 0;
 FileReader fileReader = new FileReader(fileName);
 BufferedReader bufferedReader = new
BufferedReader(fileReader);
 String line;
 while ((line = bufferedReader.readLine()) != null) {
 lineCount++;
 String[] words = line.split("\\s+"); 
 wordCount += words.length;
 }
 bufferedReader.close();
 System.out.println("Number of words: " + wordCount);
 System.out.println("Number of lines: " + lineCount);
 } catch (IOException e) {
 System.out.println("Error reading the file: " +e.getMessage());
 }
 }
}

********************************************************
Q2. Write a program to display the system date and time in various formats shown below: 
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530
-----------------------------------------------------------

import java.text.*;
import java.util.*;
public class Main1 {
public static void main(String[] args) {
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
String strDate = formatter.format(date);
System.out.println("Current date is: "+strDate);
formatter = new SimpleDateFormat("MM-dd-yyyy");
strDate = formatter.format(date);
System.out.println("Current date is: "+strDate);
formatter = new SimpleDateFormat("EEEEEE MMMM dd yyyy");
strDate = formatter.format(date);
System.out.println("Current date is: "+strDate);
formatter = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
strDate = formatter.format(date);
System.out.println("Current date and time is: "+strDate);
formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
strDate = formatter.format(date);
System.out.println("Current date and time is: "+strDate);
formatter = new SimpleDateFormat("hh:mm:ss");
strDate = formatter.format(date);
System.out.println("Current time is: "+strDate);
formatter = new SimpleDateFormat("w");
strDate = formatter.format(date);
System.out.println("Current week of year is: "+strDate);
formatter = new SimpleDateFormat("W");
strDate = formatter.format(date);
System.out.println("Current week of the month is: "+strDate);
formatter = new SimpleDateFormat("D");
strDate = formatter.format(date);
System.out.println("Current day of the year: "+strDate);
}
}