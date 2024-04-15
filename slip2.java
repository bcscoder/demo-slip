1.Write a program to read the First Name and Last Name of a person, his weight and height using 
command line arguments. Calculate the BMI Index which is defined as the individual's body massdivided 
by the square of their height. (Hint : BMI = Wts. In kgs / (ht)2 )
----------------------------------------------------------------------------------

public class BMICalculator {
public static void main(String[] args) {
if (args.length != 4) {
System.out.println("Usage:  BMICalculator FirstName LastName WeightInKgs HeightInMeters");
return;
}
String firstName = args[0];
String lastName = args[1];
double weight = Double.parseDouble(args[2]);
double height = Double.parseDouble(args[3]);
double bmi = calculateBMI(weight, height);
System.out.println("Name: " + firstName + " " + lastName);
System.out.println("Weight: " + weight + " kg");
System.out.println("Height: " + height + " meters");
System.out.println("BMI Index: " + bmi);
}
static double calculateBMI(double weight, double height) {
return weight / (height * height);
}
}




****************************************************************************
2. Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg). Create an 
array of n player objects .Calculate the batting average for each player using static method avg(). Define 
a static sort method which sorts the array on the basis of average. Display the player details in sorted 
order
------------------------------------------------------------------------------
import java.io.*;
class Cricket {
String name;
int inning, tofnotout, totalruns;
float batavg;
public Cricket(){
name=null;
inning=0;
tofnotout=0;
totalruns=0;
batavg=0;
}
public void get() throws IOException{
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
System.out.println("Enter the name, no of innings, no of times not 
out, total runs: ");
name=br.readLine();
inning=Integer.parseInt(br.readLine());
tofnotout=Integer.parseInt(br.readLine());
totalruns=Integer.parseInt(br.readLine());
}
public void put(){
System.out.println("Name="+name);
System.out.println("no of innings="+inning);
System.out.println("no times notout="+tofnotout);
System.out.println("total runs="+totalruns);
System.out.println("bat avg="+batavg);
}
static void avg(int n, Cricket c[]){
try{
for(int i=0;i<n;i++){
c[i].batavg=c[i].totalruns/c[i].inning;
}
}catch(ArithmeticException e){
System.out.println("Invalid arg");
}
}
static void sort(int n, Cricket c[]){
String temp1;
int temp2,temp3,temp4;
float temp5;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(c[i].batavg<c[j].batavg){
temp1=c[i].name;
c[i].name=c[j].name;
c[j].name=temp1;
temp2=c[i].inning;
c[i].inning=c[j].inning;
c[j].inning=temp2;
temp3=c[i].tofnotout;
c[i].tofnotout=c[j].tofnotout;
c[j].tofnotout=temp3;
temp4=c[i].totalruns;
c[i].totalruns=c[j].totalruns;
c[j].totalruns=temp4;
temp5=c[i].batavg;
c[i].batavg=c[j].batavg;
c[j].batavg=temp5;
}
}
}
}
}
public class Cricket {
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
System.out.println("Enter the limit:");
int n=Integer.parseInt(br.readLine());
Cricket c[]=new Cricket[n];
for(int i=0;i<n;i++){
c[i]=new Cricket();
c[i].get();
}
Cricket.avg(n,c);
Cricket.sort(n, c);
for(int i=0;i<n;i++){
c[i].put();
}
}
}
