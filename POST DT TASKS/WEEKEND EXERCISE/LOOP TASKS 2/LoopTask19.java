import java.util.Scanner;

public class Loop{
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter Decimal number: ");
        int decimalNumber=input.nextInt();
        String binaryNumber="";
        
         
            while(decimalNumber!=0){
                int digit = decimalNumber%2;
                binaryNumber+=digit;
                decimalNumber/=2; 
              
                }
              
          System.out.printf("Binary value = %s%n", binaryNumber);
          
                
    }
    }

