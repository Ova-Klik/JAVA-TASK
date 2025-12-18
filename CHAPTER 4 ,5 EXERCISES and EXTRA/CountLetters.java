import java.util.Scanner;

public class CountLetters{
    public static void main (String[] args){
    
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter String: ");
        String word=input.nextLine();
        
        int letterCount=countLetters(word);
        
        System.out.printf("The number of letters in the String is : %d%n", letterCount);
        
    
    
    }
    
    
    public static int countLetters(String word){
        
        int counter=0;
        int index=0;
            while (index<word.length()){
                 char character= word.charAt(index);
                if(Character.isLetter(character)){
                    counter++;
                }
            }
            return counter;
    }
}
