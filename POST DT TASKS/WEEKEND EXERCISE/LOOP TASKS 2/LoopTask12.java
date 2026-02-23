import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter the base number: ");
        int base=input.nextInt();
        System.out.printf("%nKindly enter the exponential value: ");
        int exponent=input.nextInt();
        int power=1;
        
        for(int index=1; index<=exponent;index++){
        
                power*=base;
        
         }
            System.out.printf("%d to power of %d = %d%n", base, exponent, power);
                
        
        
    }
    }

