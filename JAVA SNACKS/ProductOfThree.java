import java.util.Scanner;

public class ProductOfThree{
public static void main (String[] args){

Scanner input= new Scanner(System.in);

System.out.print("Enter a number ");
double  number = input.nextDouble();


if (number%3 ==0){ 

System.out.printf("The Number %.2f is a Product of 3 %n: ", number);


}else{
 
System.out.printf("The Number %.2f is not a Product of 3 %n: ", number);

}





}

}
