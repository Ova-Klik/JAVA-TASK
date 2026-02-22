import java.util.Scanner;

public class WeekendTask14{

    public static void main(String...args){
    
    Scanner input = new Scanner(System.in);
    

     System.out.print("Enter word to change all lowercase letter to uppercase: ");
        String word=input.nextLine();
        String newWord="";
        
        for(int index=0; index<=word.length()-1; index++){
        char letter= word.charAt(index);
        
        if(letter>=97 && letter <=122){ 
            char capLetter= (char)(letter - 32);
            newWord+=capLetter;
                    
           }else{
             newWord+=letter;
        }
        
       }
        System.out.printf("%nThe new ALL-CAPS word is: %s%n", newWord);
    }
    }
