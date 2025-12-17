

import java.util.Scanner;

public class TaskThree{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

double sum=0;




for(int count=1;count<=10;count++){


System.out.printf("Kindly input number %d:", count);
double number=input.nextDouble();
sum=sum+number;

}
double average=sum/10.0;

System.out.printf("The Average of numbers is: %.2f and the Sum is: %.2f%n", average,sum);


}


}
