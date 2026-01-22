import java.util.Scanner;
import java.util.Arrays;

public class TaskTwelve{

    public static void main (String...args){
    
    int []oddIndex= new int[10];
    
    int [] scores= {1,2,3,4,6,7,8,9,10};
    
    oddIndex=getArrayValue(scores);
    
   
    
    System.out.println(Arrays.toString(scores));
    
 }   
    public static int [] getArrayValue( int [] scores){
    
    
     for(int index=0; index<scores.length-1;index+=2){
       
        int temp=scores[index];
        scores[index]=scores[index+1];
        }
        
    
     return scores; 
    
    }
  
  }

