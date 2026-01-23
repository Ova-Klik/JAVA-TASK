import java.util.Random;
import java.util.Scanner;

public class TaskSix{

    public static void main (String...args){
    
    Random rand= new Random();
    Scanner input= new Scanner(System.in);
    int counter=0;
    int run=0;
    int [] guesses= new [10];
   int numbers= 1 + rand.nextInt(20);
    
        while(run==0) { 
     
        
        
        System.out.print("Kindly guess a number between 1 AND 20: ");
        
        int guessNumber=input.nextInt();
        
        guessNumber[run]=guessNumber;
        run++;
         counter++;  
        
         if(counter==10){
                 System.out.printf("%nGAME OVER%n");
                 run="stop";
                 break;
         
         }
         
        if(guessNumber==numbers){
            
                System.out.printf("%nYou won in %d attempts%n",counter );
                
        }else if(guessNumber>numbers){
         System.out.printf("%nToo high%n");
         continue;
            
        }else if(guessNumber<numbers){
                 System.out.printf("%nToo low%n);
                 continue;
        }else {
        
        
        
        }
        
    
        for(int index=0; index<guesses.length; index++){
        
            if(guesses[index]>0){
            
            int newIndex=index;
            }
         System.out.printf("%d ",guesses[newIndex] );
         
         }
       
        }
   
    }
    
    
    }
    }
