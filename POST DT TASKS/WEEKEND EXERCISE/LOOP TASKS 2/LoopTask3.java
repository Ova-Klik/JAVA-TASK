import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter a word to get the number of Uppercase therein: ");
        String word=input.nextLine();
        int count=0;
        
        for(int index=0; index<word.length();index++){
                char letter = word.charAt(index);
                
                if(letter >=65 && letter<=90) count++;
        
         }
                
        System.out.printf("%nNumber of Uppercase: %d%n%n",count);
        
    }
    }

