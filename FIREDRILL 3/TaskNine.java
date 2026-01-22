import java.util.Scanner;
import java.util.Arrays;

public class TaskNine{

    public static void main (String...args){
    
    int [] oddIndex = new int[10];
    
    int [] scores= {1,2,3,4,6,7,8,9,10};
    
    oddIndex=getArrayValue(scores, oddIndex);
    
    Arrays.sort(oddIndex);
    
    System.out.println(oddIndex[6]);
    
 }   
    public static int [] getArrayValue( int [] scores, int [] oddIndex){
    
    
   
    for(int index=0; index<scores.length;index++){
        if(index%2!=0){
        oddIndex[index]=scores[index];
        
   
    }
    
    
   
    
    }
    
   return oddIndex;
}

}
