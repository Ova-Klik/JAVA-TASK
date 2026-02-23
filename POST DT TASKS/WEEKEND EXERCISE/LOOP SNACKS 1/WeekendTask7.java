import java.util.Scanner;

public class WeekendTask7{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    
          
       int count=0;
       for(int index=1; index<=100; index++){
       
        if(index%7==0){
        count+=1;
        System.out.println("number"+" " + index + " " + "is divisble by 7");
        
       }
        
       }
        System.out.println(" ");
       System.out.println("counts=" + count);
    }
    }
