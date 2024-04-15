1. Write a program to print an array after changing the rows and columns of a given twodimensional array. 
---------------------------------------------------------------------
package rohan123;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int[][] twodm = {
{10, 20, 30},
{40, 50, 60}
};
System.out.print("Original Array:\n");
print_array(twodm);
System.out.print("After changing the rows and columns of the said 
array:");
transpose(twodm);
}
private static void transpose(int[][] twodm) {
int[][] newtwodm = new int[twodm[0].length][twodm.length];
for (int i = 0; i < twodm.length; i++) {
for (int j = 0; j < twodm[0].length; j++) {
newtwodm[j][i] = twodm[i][j];
}
}
print_array(newtwodm);
}
private static void print_array(int[][] twodm) {
for (int i = 0; i < twodm.length; i++) {
for (int j = 0; j < twodm[0].length; j++) {
System.out.print(twodm[i][j] + " ");
}
System.out.println();
}
}
}

*******************************************************
2.Write a Java program to design a screen using Awt that will take a user name and password. If the user 
name and password are not same, raise an exception with appropriate message. User can have 3 login 
chances only. Use clear 7 button to clear the text boxes
---------------------------------------------------------------------------------------------

package rohan123;
import java.awt.*;
import java.awt.event.*;
class InvalidPasswordException extends Exception {
 InvalidPasswordException() {
 System.out.println("User name and Password are not the same");
 }
}
public class Main extends Frame implements ActionListener {
 Label uname, upass;
 TextField nametext;
 TextField passtext, msg;
 Button login, Clear;
 Panel p;
 int attempt = 0;
 char c = '*';
 public void login() {
 p = new Panel();
 uname = new Label("Use Name: ", Label.CENTER);
 upass = new Label("Password: ", Label.RIGHT);
 nametext = new TextField(20);
 passtext = new TextField(20);
 passtext.setEchoChar(c);
 msg = new TextField(10);
 msg.setEditable(false);
 login = new Button("Login");
 Clear = new Button("Clear");
 login.addActionListener(this);
 Clear.addActionListener(this);
 p.add(uname);
 p.add(nametext);
 p.add(upass);
 p.add(passtext);
 p.add(login);
 p.add(Clear);
 p.add(msg);
 add(p);
 setTitle("Login ");
 setSize(290, 200);
 setResizable(false);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent ae) {
 Button btn = (Button) (ae.getSource());
 if (attempt < 3) {
 if ((btn.getLabel()).equals("Clear")) {
 nametext.setText("");
 passtext.setText("");
 }
 if ((btn.getLabel()).equals("Login")) {
 try {
 String user = nametext.getText();
 String upass = passtext.getText();
 if (user.equals(upass)) {
 msg.setText("Valid");
 System.out.println("Username is valid");
 } else {
 throw new InvalidPasswordException();
 }
 } catch (Exception e) {
 msg.setText("Error");
 }
 attempt++;
 }
 } else {
 System.out.println("You have used 3 attempts");
 System.exit(0);
 }
 }
 public static void main(String args[]) {
 Main pd = new Main();
 pd.login();
 }
}
