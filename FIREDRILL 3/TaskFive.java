import java.util.Scanner;
import java.util.Arrays;

public class TaskFive{

    public static void main (String...args){
    
    
    
    
    int [] scores=  {1,2,3,4,6,7,8,9,10};
    
    getArrayValue(scores);
    
 }   
    public static void getArrayValue( int [] scores){
    
    
    for(int index=0; index<scores.length;index++){
        if (index %2!=0){
           
        System.out.printf("number in index %d: %d%n",index, scores[index]);
        
    
    }
    }
    
    }
    
  
}
