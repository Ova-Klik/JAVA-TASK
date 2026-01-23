import java.util.Random;
import java.util.Scanner;

public class TaskSix{

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
        
         if(counter==10){
                 System.out.printf("%nGAME OVER%n");
                 System.out.printf("%nThe correct number is %d%n", numbers);
                 run="stop";
                 break;
         
         }
         
        if(guessNumber==numbers){
            
                System.out.printf("%nYou won in %d attempts%n",counter );
                
        }else if(guessNumber>numbers){
         System.out.printf("%nToo high%n");
         continue;
            
        }else if(guessNumber<numbers){
                 System.out.printf("%nToo low%n");
                 continue;
        }else {
        
        
        
        }
        
    
        
        
       
    
   
    }
    
    
    }
    }
