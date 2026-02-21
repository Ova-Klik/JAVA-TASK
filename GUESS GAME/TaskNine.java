import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class TaskNine{

    public static void main (String...args){
    
    Random rand= new Random();
    Scanner input= new Scanner(System.in);
    int counter=0;
    int run=0;
    int [] guesses= new int [10];
    int countLow=0;
    int countHigh=0;
  //  int minimum=guesses[0];
   // int maximum=guesses[0];
    int numbers= 1 + rand.nextInt(20); 
    
    
    
        while(run==0) { 
        
        
        System.out.print("Kindly guess a number between 1 AND 20: ");
        
        int guessNumber=input.nextInt();
        counter++; 
        guesses[counter - 1]=guessNumber;
          
        
         if(counter==10){
                 System.out.printf("%nGAME OVER%n");
                 
                 break;
         
         }
         
        if(guessNumber==numbers){
                
                System.out.printf("%nYou won in %d attempts%n",counter );
                break;
                
        }else if(guessNumber>numbers){
            countHigh++;
         System.out.printf("%nToo high%n");
         continue;
            
        }else if(guessNumber<numbers){
                countLow++;
                 System.out.printf("%nToo low%n");
                 continue;
        }else {
        
        
        
        }
        }
        int minimum=guesses[0];
        int maximum=guesses[0];
        System.out.print(Arrays.toString(guesses));
        for(int index=1; index<counter; index++){

            if(guesses[index]<minimum){
      
                minimum=guesses[index];
            }
            if(guesses[index]>maximum){
                maximum=guesses[index];
            
            }
         
               
         }
       
           System.out.printf("%nThe minimum number in your guess is %d ",minimum );
       
           System.out.printf("%nThe maximum number in your guess is %d ",maximum );
           System.out.printf("%nThe number of lower guesse(s) is %d ",countLow );
           System.out.printf("%nThe number of Higher guesse(s) is %d %n",countHigh );
         
       
        }
   
    }
    
    
   
