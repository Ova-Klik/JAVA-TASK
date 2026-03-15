import java.util.Scanner;

public class TaskTwoB{
	public static void main (String...args){
	Scanner input= new Scanner(System.in);
	
	System.out.print("Kindly enter a positive number: ");
	int number=input.nextInt();
	int result=0;
	int count=0;
	
	if(number%2==0){
	
	   result=number/2;
	 }else{
	 
	    while(number!=1)
	    number=(number/3)+1;
	    count++;
	    System.out.printf("%d", number);
	 }
	    
	}
	
	
	
	
	
}
	
}
