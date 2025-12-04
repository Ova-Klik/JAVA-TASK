import java.util.Scanner;

public class ComputeScore{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.println("Enter Your First Score: ");
double firstScore = input.nextDouble();

System.out.println("Enter Your Second Score: ");
double secondScore = input.nextDouble();

System.out.println("Enter Your Third Score: ");
double thirdScore = input.nextDouble();
 

double total= firstScore+secondScore+thirdScore;
double average= total/3.0;

System.out.printf("The Sum of your Scores is = %.2f%n", total);
 
System.out.printf("The Sum of your Scores is = %.2f%n", average);

}

}
