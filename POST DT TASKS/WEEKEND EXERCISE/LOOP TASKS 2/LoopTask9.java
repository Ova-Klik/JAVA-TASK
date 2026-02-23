import java.util.Scanner;

public class Loop{
    public static void main(String...args){
        
        Scanner input=new Scanner(System.in);
        
        System.out.printf("Kindly enter a number to get it's divisors: ");
        int number=input.nextInt();
        int count=0;
        for(int index=1; index<=number;index++){
                
                if(number%index==0) { 
                count++;
               
                
                }
         }
        
        if(count<=1){
        System.out.printf("%d has %d divisor%n", number, count);
        }
        System.out.printf("%d has %d divisors%n", number, count);
    }
    }

