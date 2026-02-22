import java.util.Scanner;

public class WeekendTask13{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

       System.out.print("Enter word to know number of occurence of letter e: ");
        String word=input.nextLine();
        int count=0;
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter=='e'|| letter=='E'){ 
        count++;
       
           }
      
       } if(count<=1){
            System.out.printf("Letter 'e' appeared %d time %n", count); 
        
        }else{
            System.out.printf("Letter 'e' appeared %d times %n", count); 
        
        }
    }
    }
