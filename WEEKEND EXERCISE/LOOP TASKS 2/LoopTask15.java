import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        Scanner input= new Scanner(System.in);
        
        System.out.printf("%nKindly enter number to get sum of all odd digits in a number:");
        int number=input.nextInt();
        int actualNumber=number;
        int sum=0;
      
         while(number!=0){
                
                int digit= number%10;
                number=number/10;
                
                if(digit%2!=0){
                sum+= digit;
                
                }
                }
                         
        System.out.printf("%nSum of all odd digits in %d: %d%n",actualNumber,sum);

    }
    }

