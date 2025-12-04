import java.util.Scanner;

public class RectangleArea{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.println("Enter the Length of the rectangle ");
double  length = input.nextDouble();

System.out.println("Enter the width of the rectangle ");
double  width = input.nextDouble();

double area= length * width;


System.out.printf("The Area of your Triangle is = %.2f%n", area);



}

}
