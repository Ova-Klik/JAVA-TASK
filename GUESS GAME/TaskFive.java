import java.util.Random;
import java.util.Scanner;

public class TaskFive{

    public static void main (String...args){
    
    Random rand= new Random();
    Scanner input= new Scanner(System.in);
    int counter=0;
    String run="start";
    int numbers= 1 + rand.nextInt(20);
   
    
        while(run=="start") { 
     
        
        System.out.print("Kindly guess a number between 1 AND 20: ");
        
        int guessNumber=input.nextInt();
         counter++;   
        if(guessNumber==numbers){
            
                System.out.printf("%nYou guessed correctly: %d = %d%n",guessNumber,  numbers );
                run="stop";
                
                break;
        }else if(guessNumber>numbers){
         System.out.printf("%nToo high: %d is not %d%n", guessNumber, numbers );
         continue;
            
        }else{
                 System.out.printf("%nToo low: %d is not %d%n", guessNumber, numbers );
                 continue;
        }
        
    
        }
        
        System.out.printf("%nYou took %d number of guesses%n", counter);
       
    
   
    }
    
    
    }
