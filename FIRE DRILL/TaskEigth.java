

import java.util.Scanner;

public class TaskEigth{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

double sum=0;


for(int count=1;count<=100;count++){


System.out.printf("Kindly input number %d:", count);
double score=input.nextInt();

sum=sum+score;
}

System.out.printf("The Sum of numbers is: %.2f%n%n", sum);
}


}
