import java.util.Scanner;

public class WeekendTask15{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

    System.out.print("Enter word to change all uppercase letter to lowercase: ");
        String word=input.nextLine();
        String newWord="";
        
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter>=65 && letter<=90){ 
            char capLetter= (char)(letter + 32);
            newWord+=capLetter;
                    
           }else{
             newWord+=letter;
        }
        
       }
       System.out.printf("%nThe new lowercase word is: %s%n", newWord);
    }
    }
