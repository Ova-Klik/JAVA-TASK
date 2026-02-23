import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter a word to get the number of Lowercase therein: ");
        String word=input.nextLine();
        int count=0;
        
        for(int index=0; index<word.length();index++){
                char letter = word.charAt(index);
                count++;
                if(letter =='a' || letter=='e' || letter =='i' || letter=='o'|| letter=='u' ) break;
                    
         }
                
        System.out.printf("%nPosition of the first vowel: %d%n%n",count);
        
    }
    }

