import java.util.Random;
import java.util.Scanner;

public class TaskOneTwo{

    public static void main (String...args){
    
    Random rand= new Random();
    Scanner input= new Scanner(System.in);
    int numbers= 1 + rand.nextInt(20);
    String run="start";
    
          
        System.out.print("KindlY gues a number between 1 AND 20: ");
        int guessNumber=input.nextInt();
        
        if(guessNumber==numbers){
        
        System.out.printf("%nYou guessed correctly: %d = %d%n",guessNumber,  numbers );
        
        }else{
         System.out.printf("%nYou no get am: %d is not %d%n", guessNumber, numbers );
            
        }        
    
        
    
   
    }
    
    
    }
