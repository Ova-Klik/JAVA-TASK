import java.util.Scanner;


public class Loop{
    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.print("Kindly enter a string to get he reverse: ");
        String word = input.nextLine();
        String newWord="";
        
        for(int index=word.length()-1; index>=0;index--){
        
            newWord+=word.charAt(index);    
            
        }
        System.out.println("The reverse: " + newWord);
        
    }
}
