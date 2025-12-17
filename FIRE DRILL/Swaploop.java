

import java.util.Scanner;

public class Swaploop{
public static void main (String[] args){

int reverse;

Scanner input=new Scanner(System.in);

System.out.printf("Kindly enter a number with three digits ");
int number=input.nextInt();

while (number!=0){

System.out.print(number%10);
number=(number/10);
 
 
 

}


}
}

