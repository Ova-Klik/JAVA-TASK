import java.util.Scanner;

public class Loop{
    public static void main(String...args){
        
        Scanner input=new Scanner(System.in);
        
        System.out.printf("Kindly enter a number to get it's divisors: ");
        int number=input.nextInt();
        
        System.out.printf("The divisors are: ");
        
        
        for(int index=1; index<=number;index++){
                
                if(number%index==0) { 
                System.out.printf("%d",index);
                System.out.printf(" ");
                
                }
         }
                
        System.out.println();
        
    }
    }

