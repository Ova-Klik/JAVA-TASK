import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.printf("%nKindly enter a sentence to confirm number of words: ");
        String sentence=input.nextLine().trim();
        int count=1;
        
        for(int index=0; index<sentence.length();index++){
                char letter = sentence.charAt(index);
                
                if(letter==32){
                count+=1;
                
                }
               
                
         }
         
        System.out.printf("%nThe number words in sentence: %d ", count);
                
        
        
    }
    }

