import java.util.Scanner;

public class SimpleInterest{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.print("Please enter Principal Amount: ");
double  principalAmount = input.nextDouble();

System.out.print("Kindly enter rate: ");
double  rate = input.nextDouble();

System.out.print("Kindly enter time in years: ");
double  time = input.nextDouble();


double interest = principalAmount * rate * time;


System.out.printf("Your Simple Intererst is  = %.2f%n", interest);



}

}
