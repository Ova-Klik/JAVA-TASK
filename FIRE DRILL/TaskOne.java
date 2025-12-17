

import java.util.Scanner;

public class TaskOne{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

double sum=0;


for(int count=1;count<=10;count++){


System.out.printf("Kindly input number %d:", count);
double number=input.nextInt();

sum=sum+number;
}

System.out.printf("The Sum of numbers is: %.2f%n%n", sum);
}


}
