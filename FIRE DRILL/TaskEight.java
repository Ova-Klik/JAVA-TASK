

import java.util.Scanner;

public class TaskEigth{
public static void main (String[] args){

Scanner input=new Scanner(System.in);


for(int count=0;count<=100;count++){


System.out.printf("Kindly input number %d:", count);
double score=input.nextDouble();

score+=score;
count+=1;

}
   
}

double average=evenSum/evenCounter;
System.out.printf("The Average of even numbers is: %.2f and The Sum of even Numbers is %.2f%n", average, evenSum);


}


}
