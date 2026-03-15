import java.util.Scanner;

public class TaskOne{
	public static void main (String...args){
	Scanner input= new Scanner(System.in);
	
	int []numbers= new int[10];
	int total=sumAllValues(numbers);
	int sumOfOdd=sumOdd(numbers);		
	
	
	System.out.println("Kindly enter 10 numbers");
	for(int index=0; index<numbers.length; index++){
		
		System.out.printf("Kindly enter number %d: ", index+1);
		numbers[index]=input.nextInt();
		
	}

	System.out.println("Even values");
	getEvenValues(numbers);
	sumEven(numbers);
	

}

	public static void getEvenValues(int[] numbers){
	
	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2==0){	
		System.out.printf("%nEven numbers are = %d", numbers[index]);
		
		}
	}
		
	
	
   }

	public static void getOddValues(int[] numbers){

	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2!=0){		
			System.out.printf("%nEven numbers are = %d", numbers[index]);
		}
	}
	
	
   }

	public static void sumEven(int[] numbers){
	
	int sum=0;
	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2==0){	
		sum+=numbers[index];	
				
		}
	}
		System.out.println("The sum of even numbers= "+sum);
	
	
  	 }



	public static int sumOdd(int[] numbers){

	int sum=0;

	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2!=0)sum+=numbers[index];

	}
	
	return sum;
   }

	public static int sumAllValues(int[] numbers){

	int sum=0;

	for(int index=0; index<numbers.length; index++){
		
		sum+=numbers[index];

	}
	
	return sum;
   }

	public static void squareEven(int[] numbers){

		
	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2==0)numbers[index]=numbers[index]*numbers[index];
		System.out.printf("%nSquare of this even number= %d", numbers[index]);

	}
	
   }
	
	public static void squareOdd(int[] numbers){

			
	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2!=0)numbers[index]=numbers[index]*numbers[index];
		System.out.printf("%nSquare of Odd number = %d", numbers[index]);

	}
	
	
   }

	public static int getMean(int[]numbers){

	int mean=0;
	int count=0;
	int sum=0;

	for(int index=0; index<numbers.length; index++){
		
		sum+=numbers[index];
		count++;
	}
	mean=sum/count
	
	return mean;
   }

	public static int sumSquareEven(int[] numbers){
	int sum=0;
		
	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2==0)numbers[index]=numbers[index]*numbers[index];
		sum+=numbers[index];

	}
		return sum;
	
   }
	
	public static int sumSquareOdd(int[] numbers){
	int sum=0;
		
	for(int index=0; index<numbers.length; index++){
		
		if(numbers[index]%2!=0)numbers[index]=numbers[index]*numbers[index];
		sum+=numbers[index];

	}
		return sum; 
   }

	public static int squareOfAll(int[] numbers){
	int sum=0;
		
	for(int index=0; index<numbers.length; index++){
		
		numbers[index]=numbers[index]*numbers[index];
		sum+=numbers[index];
		
	}
		return sum;
   }	



	

	


}

