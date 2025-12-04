import java.util.Scanner;

public class Exponent{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.print("Enter a number to get its Square and Cube");
double  number = input.nextDouble();


double square = number * number;
double cube = number * number * number;


System.out.printf("The Square of your Number is = %.2f%n: ", square);

System.out.printf("The Cube of your Number is = %.2f%n: ", cube);


}

}
