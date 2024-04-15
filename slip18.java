Q1) Write a program to implement Border Layout Manager
-----------------------------------------------------
import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample {
 public static void main(String[] args) {
 JFrame frame = new JFrame("BorderLayout Example");
 frame.setSize(400, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JButton btnNorth = new JButton("North");
 JButton btnSouth = new JButton("South");
 JButton btnEast = new JButton("East");
 JButton btnWest = new JButton("West");
 JButton btnCenter = new JButton("Center");
 frame.setLayout(new BorderLayout());
 frame.add(btnNorth, BorderLayout.NORTH);
 frame.add(btnSouth, BorderLayout.SOUTH);
 frame.add(btnEast, BorderLayout.EAST);
 frame.add(btnWest, BorderLayout.WEST);
 frame.add(btnCenter, BorderLayout.CENTER);
 frame.setVisible(true);
 }
}
Q2) Define a class CricketPlayer 
(name,no_of_innings,no_of_times_notout, totatruns, bat_avg). Create an 
array of n player objects. Calculate the batting average for each 
player using static method avg(). Define a static sort method which 
sorts the array on the basis of average. Display the player details in 
sorted order.
----------------------------------------------------------------
 import java.io.*;
import java.util.Scanner;
class Cricketdata {
 String name;
 int inning, tofnotout, totalruns;
 float batavg;
 public Cricketdata() {
 name = null;
 inning = 0;
 tofnotout = 0;
 totalruns = 0;
 batavg = 0;
 }
 public void accept() throws IOException {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the name, no of innings, no of times 
not out, total runs: ");
 name = sc.nextLine();
 inning = sc.nextInt();
 tofnotout = sc.nextInt();
 totalruns = sc.nextInt();
 }
 public void display() {
 System.out.println("Name=" + name);
 System.out.println("no of innings=" + inning);
 System.out.println("no times notout=" + tofnotout);
 System.out.println("total runs=" + totalruns);
 System.out.println("bat avg=" + batavg);
 }
 static void avg(int n, Cricketdata c[]) {
 try {
 for (int i = 0; i < n; i++) {
 c[i].batavg = c[i].totalruns / c[i].inning;
 }
 } catch (ArithmeticException e) {
 System.out.println("Invalid arg");
 }
 }
 static void sort(int n, Cricketdata c[]) {
 String temp1;
 int temp2, temp3, temp4;
 float temp5;
 for (int i = 0; i < n; i++) {
 for (int j = i + 1; j < n; j++) {
 if (c[i].batavg < c[j].batavg) {
 temp1 = c[i].name;
 c[i].name = c[j].name;
 c[j].name = temp1;
 temp2 = c[i].inning;
 c[i].inning = c[j].inning;
 c[j].inning = temp2;
 temp3 = c[i].tofnotout;
 c[i].tofnotout = c[j].tofnotout;
 c[j].tofnotout = temp3;
 temp4 = c[i].totalruns;
 c[i].totalruns = c[j].totalruns;
 c[j].totalruns = temp4;
 temp5 = c[i].batavg;
 c[i].batavg = c[j].batavg;
 c[j].batavg = temp5;
 }
 }
 }
 }
}