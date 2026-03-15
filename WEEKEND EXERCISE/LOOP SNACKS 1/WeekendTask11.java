import java.util.Scanner;

public class WeekendTask11{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

      System.out.print("Enter Number to get multiplication Table: ");
        int number= input.nextInt();
        
        for(int index=1; index<=12; index++){
        
        
        System.out.printf("%d x %d = %d%n", number , index, (number * index));
       
                 
       }
       
    }
    }
