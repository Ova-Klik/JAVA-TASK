import java.util.Scanner;

public class Loop{
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter binary number: ");
        String binaryNumber = input.nextLine();
        int decimal=0;
             
            for(int index=0; index<binaryNumber.length(); index++ ){
                char bit = binaryNumber.charAt(index);
                decimal= decimal * 2 + (bit-'0');
              
                }
              
          System.out.printf("Decimal value = %d%n", decimal);
          
                
    }
    }

