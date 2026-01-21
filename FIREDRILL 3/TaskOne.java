import java.util.Scanner;


public class TaskOne{

    public static void main (String...args){
    
    Scanner input= new Scanner(System.in);
    
    
    int [] scores= new int[10];
    
    for(int index=0; index<scores.length;index++){
        
        System.out.printf("Kindly input number %d:",index+1);
        scores[index]=input.nextInt();
    
    }
    
    
    }
}
