import java.util.Scanner;
import java.util.Arrays;

public class TaskFive{

    public static void main (String...args){
    
    
    
    
   int [] scores=  {1,2,3,4,6,7,8,9,10};
    
    int sumofEvenIndex=getArrayValue(scores);
    
    System.out.println("The Sum of odd index is: "+ sumofEvenIndex);
    
 }   
    public static int getArrayValue( int [] scores){
     int sum=0;
    
    Scanner input= new Scanner(System.in);    
       
  
    for(int index=0; index<scores.length;index++){
        if (index %2!=0){
           
        sum = sum + scores[index];
        
    
    }
   
    
    
    }
        return sum;
    }
  
}
