

import java.util.Scanner;

public class TaskSix{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

double evenSum=0;
double evenCounter=0;



for(int count=1;count<=10;count++){


System.out.printf("Kindly input number %d:", count);
double number=input.nextDouble();

if (number%2==0){ 
evenSum=evenSum+number;
evenCounter+=1;

}
   
}

double average=evenSum/evenCounter;
System.out.printf("The Average of even numbers is: %.2f%n", average);


}


}
