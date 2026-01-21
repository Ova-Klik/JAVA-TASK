import java.util.Scanner;
import java.util.Arrays;

public class TaskTen{

    public static void main (String...args){
    
    int [] evenIndex = new int[10];
    
    int [] scores= {1,2,3,4,6,7,8,9,10};
    
    evenIndex=getArrayValue(scores, evenIndex);
    
    Arrays.sort(evenIndex);
    
    System.out.println(evenIndex[9]);
    
 }   
    public static int [] getArrayValue( int [] scores, int [] evenIndex){
    
    
    for(int index=0; index<scores.length;index++){
        if(index%2==0){
        evenIndex[index]=scores[index];
        
   
    }
    
    
    
    
    }
   return evenIndex; 
  }
}
