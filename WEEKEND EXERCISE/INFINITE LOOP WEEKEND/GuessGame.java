import java.util.Random;
import java.util.Scanner;

public class GuessGame{

    public static void main (String...args){
    
    Random rand= new Random();
    Scanner input= new Scanner(System.in);
    int counter=0;
    String run="start";
    int numbers= 1 + rand.nextInt(20);
   
    
        while(run.equals("start")) { 
     
        
        System.out.print("Kindly guess a number between 1 AND 20: ");
         
        int guessNumber=input.nextInt();
         counter++;  
        
         
        if(guessNumber==numbers){
            
                System.out.printf("%nYou won in %d attempts%n",counter );
                break;
                
        }else if(guessNumber>numbers){
         System.out.printf("%nToo high%n");
         continue;
            
        }else if(guessNumber<numbers){
                 System.out.printf("%nToo low%n");
                 continue;
        }else {
        
        
        
        }
        
 } } }
