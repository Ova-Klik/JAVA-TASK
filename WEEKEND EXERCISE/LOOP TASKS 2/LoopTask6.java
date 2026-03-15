import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter a word to get the number of Lowercase therein: ");
        String word=input.nextLine();
        int count=0;
        
        System.out.printf("%n%-20s %s %n", "LETTER","ASCII VALUE");
        
        for(int index=0; index<word.length();index++){
                char letter = word.charAt(index);
                System.out.printf("\'%s\' %25d%n", letter,(int)letter);
        
         }
                
        
        
    }
    }

