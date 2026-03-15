import java.util.Scanner;

public class TaskTwoCandD{
	public static void main (String...args){
	Scanner input= new Scanner(System.in);
	
	System.out.print("Kindly enter number: ");
	int number=input.nextInt();
	int actualNumber=number;
	int countLength=0;
	
	int sum=0;
	
	while(number>0){
	
	    sum+= number%10;
	    number=number/10;
	    countLength++;
	}
	
	int mean= sum/countLength;
	int [] numbers= new int [countLength];
	int index=0;
	
	number=actualNumber;
	while(number>0){
	
	    numbers[index]= number%10;
	    index++;
	    number=number/10;
	}
	System.out.printf("%nThe mean of digits is : %d%n%n", mean);
	
	double evenMedian=0;
	int oddMedian=0;
	if(countLength%2==0){
	    
	    int firstMidPosition=(countLength/2)-1;
	    int secondMidPosition=countLength/2;
	    evenMedian=(double)(numbers[firstMidPosition] + numbers[secondMidPosition])/2;
	    System.out.printf("%nThe median of digits is : %.2f%n%n", evenMedian);
	}else{
	
	    int midPosition=(countLength/2);
	    oddMedian=numbers[midPosition];
	    System.out.printf("%nThe median of digits is : %d%n%n", oddMedian);
	    
	}
	
	
	
	
	
}
	
}
