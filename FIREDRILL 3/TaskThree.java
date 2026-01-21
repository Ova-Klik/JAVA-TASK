import java.util.Scanner;
import java.util.Arrays;

public class TaskTwo{

    public static void main (String...args){
    
    Scanner input= new Scanner(System.in);
    
    
    int [] scores= new int[10];
    scores[0]=8;
    
   
    
    for(int index=0; index<scores.length;index++){
        
        System.out.printf("Kindly input number %d:",index+1);
        scores[index]=input.nextInt();
    
    }
    
   for(int index=0; index<scores.length;index++){
        
        System.out.printf("number in index %d: %d%n",index+1, scores[index]);
        
    
    }
 
    
    }
}
