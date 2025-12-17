

import java.util.Scanner;

public class evenTester{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

for(int count=1;count<=10;count++){

System.out.printf("Kindly input your score %d%n:", count);
int number=input.nextInt();

if(number%2==0)System.out.printf("This number is %d is even", number);

}


}


}
