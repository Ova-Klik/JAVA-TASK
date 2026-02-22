import java.util.Scanner;

public class WeekendTask16{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

      System.out.print("Enter word to confirm how many vowels therein: ");
        String word=input.nextLine();
        String newWord="";
        int count=0;
        
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter>=65 && letter<=90){ 
            char capLetter= (char)(letter + 32);
            newWord+=capLetter;
                    
           }else{
            newWord+=letter;
        }
        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ){
        
        count++;
        
        }
       }
      
        System.out.printf("The word contains %d vowels%n", count);
    }
    }
