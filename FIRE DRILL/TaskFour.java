

import java.util.Scanner;

public class TaskFour{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

double evenSum=0;




for(int count=1;count<=10;count++){


System.out.printf("Kindly input number %d:", count);
double number=input.nextDouble();
if (count%2==0) evenSum=evenSum+number;

}


System.out.printf("The Sum of even index is: %.2f%n", evenSum);


}


}
