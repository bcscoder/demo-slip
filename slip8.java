Q1]
-----------------------------------------
import java.util.Scanner;
public class SphereCalc {
 static float pi = 3.14159f;
 static float volume(float r) {
 float vol;
 vol = ((float) 4 / (float) 3) * (pi * r * r * r);
 return vol;
 }
 static float surfaceArea(float r) {
 float surArea;
 surArea = 4 * pi * r * r;
 return surArea;
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the radius of the sphere: ");
 float radius = scanner.nextFloat();
 float vol = volume(radius);
 float surArea = surfaceArea(radius);
 System.out.println("Volume Of Sphere: " + vol);
 System.out.println("Surface Area Of Sphere: " + surArea);
 }
}


***********************************************************
2. Design a screen to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICKED and 
display the position of the Mouse_Click in a TextField. 
----------------------------------------------------------
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
 TextField t, t1;
 Label l, l1;
 int x, y;
 MyFrame(String title) {
 super(title);
 setLayout(new FlowLayout());
 Panel p = new Panel(new GridLayout(2, 2, 5, 5));
 t = new TextField(20);
 l = new Label("Co-ordinates of clicking");
 l1 = new Label("Co-ordinates of movement");
 t1 = new TextField(20);
 p.add(l);
 p.add(t);
 p.add(l1);
 p.add(t1);
 add(p);
 addMouseListener(new MouseAdapter() {
 public void mouseClicked(MouseEvent me) {
 x = me.getX();
 y = me.getY();
 t.setText("X=" + x + " Y=" + y);
 }
 });
 addMouseMotionListener(new MouseMotionAdapter() {
 public void mouseMoved(MouseEvent me) {
 x = me.getX();
 y = me.getY();
 t1.setText("X=" + x + " Y=" + y);
 }
 });
 setSize(500, 500);
 setVisible(true);
 }
}
class Main {
 public static void main(String args[]) {
 new MyFrame("Hello");
 }
}