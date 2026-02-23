import java.util.Scanner;

public class WeekendTask18{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

    System.out.print("Enter a number: ");
          String numbers =input.nextLine();
          int sum=0;
          
          for(int index=0; index<=numbers.length()-1; index++){
             sum+= numbers.charAt(index)-'0';
       
       }
            System.out.printf("%nSum of all digits in your number = %d%n", sum); 
            
    }
    }
