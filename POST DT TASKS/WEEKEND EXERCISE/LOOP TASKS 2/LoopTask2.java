import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter a number to get the reverse: ");
        int number = input.nextInt();
        int actualNumber = number;
        int reverse = 0;
        
        while(number!=0){
        
            int digit=number%10;
            reverse= reverse*10+digit;
            number=number/10;
        }
        
        System.out.printf("%nThe reverse of %d: %d%n%n",actualNumber, reverse);
        
    }
}
