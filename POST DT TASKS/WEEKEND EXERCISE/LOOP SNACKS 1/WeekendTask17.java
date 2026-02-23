import java.util.Scanner;

public class WeekendTask17{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

    System.out.print("Enter a number: ");
          String numbers =input.nextLine();
          int count=0;
          int number=0;
          
         for(int index=0; index<=numbers.length()-1; index++){
             number= numbers.charAt(index)-'0';
             count++;
          System.out.printf("%ndigit : %d%n", number);       
       
       }
            System.out.printf("%nNumber of digits = %d%n", count); 
    }
    }
