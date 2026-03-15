import java.util.Random;
import java.util.Scanner;

public class TaskThree{

    public static void main (String...args){
    
    Random rand= new Random();
    Scanner input= new Scanner(System.in);
    int numbers= 1 + rand.nextInt(20);
  
    
          
        System.out.print("Kindly guess a number between 1 AND 20: ");
        int guessNumber=input.nextInt();
        
        if(guessNumber==numbers){
        
        System.out.printf("%nYou guessed correctly: %d = %d%n",guessNumber,  numbers );
        
        }else if(guessNumber>numbers){
         System.out.printf("%nToo high: %d is not %d%n", guessNumber, numbers );
            
        }else{
                 System.out.printf("%nToo low: %d is not %d%n", guessNumber, numbers );
        }       
    
        
    
   
    }
    
    
    }
