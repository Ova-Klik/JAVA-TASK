import java.util.Scanner;

public class CountVowelsAndConsonants{

    public static void main (String...args){
    
        Scanner input = new Scanner(System.in);
        System.out.printf("Kindly enter a String: ");
        String string= input.nextLine();
        
        int countVowels=0;
        int countConsonants=0;
        char capLetter=' ';
        
        for(int index=0; index<=string.length()-1; index++){
        char letter= string.charAt(index);
        
        if(letter>=97 && letter <=122){ 
            capLetter= (char)(letter - 32);
                    
           }else{
             capLetter=letter;
        }
        
            if(capLetter=='A' || capLetter=='E' || capLetter=='I' || capLetter=='O' || capLetter=='U' ){
        
                countVowels++;
        
        }else{
        
                countConsonants++;
        
        }
        
       }
            System.out.printf("%nVowels in word: %d%n", countVowels);
            System.out.printf("Consonants in word: %d%n", countConsonants);
    
    
    }
}
