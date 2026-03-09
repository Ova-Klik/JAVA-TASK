import java.util.Scanner;

public class TaskOne{
	public static void main (String...args){
	Scanner input= new Scanner(System.in);
	
	System.out.print("Kindly enter number: ");
	int number=input.nextInt();
	int sum=0;
	
	while(number>0){
	
	    sum+=number%10*number%10;
	    number=number/10;
	    
	}
	
	System.out.printf("%nThe Sum of the squares of each digit: %d%n%n", sum);
	
	
	
	
}
	
}
