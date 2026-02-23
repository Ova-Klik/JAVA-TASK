import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter a word to confirm Palindrome: ");
        String word=input.nextLine();
        String newWord="";
        
        for(int index=word.length()-1; index>=0;index--){
        
                newWord+=word.charAt(index); 
        
         }
         if(word.equals(newWord)){
            System.out.printf("%s is a palindrome %n", word);
        }else{   
            System.out.printf("%s is not a palindrome %n", word);
        }
                
        
        
    }
    }

