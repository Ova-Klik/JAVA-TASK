import java.util.Scanner;

public class LargeSmall{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.print("Enter first Number:");
double  number1 = input.nextDouble();

System.out.print("Enter second Number:");
double number2 = input.nextDouble();

System.out.print("Enter third Number:");
double number3 = input.nextDouble();

System.out.print("Enter fourth Number:");
double  number4 = input.nextDouble();
System.out.print("Enter fifth Number:");
double  number5 = input.nextDouble();

double largest = number1;
double smallest = number1;

if (largest < number2)largest = number2;
if (largest < number3)largest = number3;
if (largest < number4)largest = number4;
if (largest < number5)largest = number5;

if (smallest > number2)smallest = number2;
if (smallest > number3)smallest = number3;
if (smallest > number4)smallest = number4;
if (smallest > number5)smallest = number5;

System.out.printf("The smallest number is : %.2f%n The Larget number is : %.2f%n", smallest, largest);





}

}
