import java.util.Scanner;


public class FasterCypherText{
    public static void main (String...args){
    
    Scanner input=new Scanner(System.in);
    StringBuilder encryptedMessage = new StringBuilder();
    StringBuilder decryptedMessage=new StringBuilder();
    int key=0;
  
    char encryptedChar= ' ';
    char decryptedChar=' ';
    int newLetter=0;
    

while(true){    
    
    System.out.printf("""
    
                               ---Encryption System---
                               
                               1. Encrypt Message
                               2. Decrypt Message
                               
                               0. Exit
                        
                      """);
    
    System.out.print("Enter operation: ");
    String menuOption = input.next();
   
   if (!menuOption.matches("[0-3]")){
        System.out.println("     \nInvalid Option !!! \n\n");
        continue;
    }else{  
            
    int option=menuOption.charAt(0)-'0'; 
    input.nextLine();       
    switch(option){
        
        case 0-> {   System.out.println("\nThank You!!!\n");
                    System.exit(0);
                 }
        case 1-> {
            encryptedMessage.setLength(0);      
            System.out.print("Kindly enter the message to encrypt: ");
            String message = input.nextLine();

            System.out.println("Kindly enter your single encryption key(one number or alphabet): ");
            char keyChar = input.next().charAt(0);

        if(Character.isDigit(keyChar)){

            key=keyChar - '0';
            for (int index = 0; index < message.length(); index++) {
            encryptedMessage.append((char)(message.charAt(index) + key));
            }
            
        }else {
            for (int index = 0; index < message.length(); index++) {
            encryptedMessage.append((char)(message.charAt(index) + keyChar));
        }    
        } 
        

            System.out.printf("\nEncrypted Message: %n%n%s%n" , encryptedMessage.toString());

            }
            
       case 2-> { 
            decryptedMessage.setLength(0);     
            System.out.print("Kindly enter the message to Decrypt: ");
            String message = input.nextLine();

            System.out.println("Kindly enter your single encryption key(one number or alphabet): ");
            char keyChar = input.next().charAt(0);

       if(Character.isDigit(keyChar)){

            key=keyChar - '0';
            for (int index = 0; index < message.length(); index++) {
            decryptedMessage.append((char)(message.charAt(index) - key));
            
            }
            
        }else {
            for (int index = 0; index < message.length(); index++) {
            decryptedMessage.append((char)(message.charAt(index) - keyChar));
            
        } 
        }

            System.out.printf("%nDecrypted Message reads: %n%n%s%n" , decryptedMessage.toString());

            }
            
         default ->
         
            System.out.println("Invalid Option\n");            
            }
            }

}
}
}
