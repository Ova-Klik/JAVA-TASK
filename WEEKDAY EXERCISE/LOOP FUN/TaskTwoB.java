import java.util.Scanner;

public class TaskTwoB{
	public static void main (String...args){
	Scanner input= new Scanner(System.in);
	
	System.out.print("Kindly enter number: ");
	int number=input.nextInt();
	int sum=0;
	
	while(number>0){
	
	   int digit= number%10;
	   int factorial=1;
	    
	    while(digit>1){
		    factorial*=digit;
		    digit-=1;
	    }
	    number=number/10;
	    sum+=factorial;
	}
	System.out.printf("%nThe Sum of the factorial of each digit: %d%n%n", sum);
	
	
	
	
}
	
}
