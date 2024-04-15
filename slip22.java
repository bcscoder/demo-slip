Q1) Write a program to create an abstract class named Shape that 
contains two integers and an empty method named printArea(). Provide 
three classes named Rectangle, Triangle and Circle such that each one 
of the classes extends the class Shape. Each one of the classes 
contain only the method printArea() that prints the area of the given 
shape. (use method overriding).
----------------------------------------------------------------------------
import java.util.Scanner;
abstract class Shape {
 int dimension1;
 int dimension2;
 Shape(int dimension1, int dimension2) {
 this.dimension1 = dimension1;
 this.dimension2 = dimension2;
 }
 abstract void printArea();
}
class Rectangle extends Shape {
 Rectangle(int length, int width) {
 super(length, width);
 }
 
 void printArea() {
 int area = dimension1 * dimension2;
 System.out.println("Area of Rectangle: " + area);
 }
}
class Triangle extends Shape {
 Triangle(int base, int height) {
 super(base, height);
 }
 
 void printArea() {
 double area = 0.5 * dimension1 * dimension2;
 System.out.println("Area of Triangle: " + area);
 }
}
class Circle extends Shape {
 Circle(int radius) {
 super(radius, 0); 
  }
 
 void printArea() {
 double area = Math.PI * dimension1 * dimension1;
 System.out.println("Area of Circle: " + area);
 }
}
public class ShapeDemo {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter length of Rectangle: ");
 int rectLength = scanner.nextInt();
 System.out.print("Enter width of Rectangle: ");
 int rectWidth = scanner.nextInt();
 System.out.print("Enter base of Triangle: ");
 int triangleBase = scanner.nextInt();
 System.out.print("Enter height of Triangle: ");
 int triangleHeight = scanner.nextInt();
 System.out.print("Enter radius of Circle: ");
 int circleRadius = scanner.nextInt();
 Rectangle rectangle = new Rectangle(rectLength, rectWidth);
 Triangle triangle = new Triangle(triangleBase,triangleHeight);
 Circle circle = new Circle(circleRadius);
 rectangle.printArea();
 triangle.printArea();
 circle.printArea();
 scanner.close();
 }
}
*************************************************************
Q2) Write a program that handles all mouse events and shows the event 
name at the center of the Window, red in color when a mouse event is 
fired. (Use adapter classes).
-------------------------------------------------------------------
 import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class MouseEventPerformer extends JFrame implements
MouseListener
{
 JLabel l1;
 public MouseEventPerformer()
 {
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(300,300);
 setLayout(new FlowLayout(FlowLayout.CENTER));
 l1 = new JLabel();
 Font f = new Font("Verdana", Font.BOLD, 20);
 l1.setFont(f);
 l1.setForeground(Color.RED);
 add(l1);
 addMouseListener(this);
 setVisible(true);
 }
 public void mouseExited(MouseEvent m)
 {
 l1.setText("Mouse Exited");
 }
 public void mouseEntered(MouseEvent m)
 {
 l1.setText("Mouse Entered");
 }
 public void mouseReleased(MouseEvent m)
 {
 l1.setText("Mouse Released");
 }
 public void mousePressed(MouseEvent m)
 {
 l1.setText("Mouse Pressed");
 }
 public void mouseClicked(MouseEvent m)
 {
 l1.setText("Mouse Clicked");
 }
 public static void main(String[] args) {
 MouseEventPerformer mep = new MouseEventPerformer();
 }
}