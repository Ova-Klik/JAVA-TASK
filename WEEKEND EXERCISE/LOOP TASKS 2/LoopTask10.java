import java.util.Scanner;

public class Loop{
    public static void main(String...args){
        
        Scanner input=new Scanner(System.in);
        
        System.out.printf("Kindly enter a number to confirm if its a palindrome: ");
        int number=input.nextInt();
        int actualNumber=number;
        int reverse=0;
        
        while(number!=0){
                
                int digit= number%10;
                reverse=reverse*10 + digit;
                number=number/10;
               
                }
                 
        if(actualNumber==reverse){
            System.out.printf("%d is a palindrome %n", actualNumber);
        }else{   
            System.out.printf("%d is not a palindrome %n", actualNumber);
            }
        
    }
    }

