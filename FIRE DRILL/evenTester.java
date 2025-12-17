

import java.util.Scanner;

public class evenTester{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

for(int count=1;count<=10;count++){

System.out.printf("Kindly input your score %d:", count);
int score=input.nextInt();

if(score%2==0)System.out.printf("This score %d is even%n", score);

}


}


}
