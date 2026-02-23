import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter a sentence to confirm number of words: ");
        String sentence=input.nextLine().trim();
        int count=0;
        
        for(int index=0; index<sentence.length();index++){
                char letter = sentence.charAt(index);
                
                if(letter==32 && index==sentence.length()){
                count+=2;
                
                }else if()
                
         }
         
        System.out.printf("%nThe number words in sentence: %d ", count);
                
        
        
    }
    }

