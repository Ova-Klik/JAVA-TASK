import java.util.Scanner;


public class FasterCypherText{
    public static void main (String...args){
    
    Scanner input=new Scanner(System.in);
    StringBuilder newMessage = new StringBuilder();
    StringBuilder actualMessage=new StringBuilder();
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
    int menuOption = input.nextInt();
    input.nextLine();
    
    if(menuOption==0){
        System.out.println("     \nThank you !!! \n\n");
        break;
    }
    
    switch(menuOption){
    
        case 1-> {
            newMessage.setLength(0);      
            System.out.print("Kindly enter the message to encrypt: ");
            String message = input.nextLine();

            System.out.print("\nKindly enter your encryption key (Single key e.g 3 or c): ");
            char keyChar = input.next().charAt(0);

        if(Character.isDigit(keyChar)){

            key=keyChar - '0';
            for (int index = 0; index < message.length(); index++) {
            newLetter= message.charAt(index) + key;
            encryptedChar = (char) newLetter;
            newMessage.append(encryptedChar);
            }
            
        }else {
            for (int index = 0; index < message.length(); index++) {
            newLetter = message.charAt(index) + keyChar;
            encryptedChar = (char) newLetter;
            newMessage.append(encryptedChar);
            
        } 
        }

            System.out.printf("\nEncrypted Message: %n%n%s%n" , newMessage.toString());

            }
            
       case 2-> { 
            actualMessage.setLength(0);     
            System.out.print("Kindly enter the message to Decrypt: ");
            String message = input.nextLine();

            System.out.print("Kindly enter your Decryption key (Single key e.g 3 or c): ");
            char keyChar = input.next().charAt(0);

       if(Character.isDigit(keyChar)){

            key=keyChar - '0';
            for (int index = 0; index < message.length(); index++) {
            newLetter = message.charAt(index) - key;
            decryptedChar = (char) newLetter;
            actualMessage.append(decryptedChar);
            
            }
            
        }else {
            for (int index = 0; index < message.length(); index++) {
            newLetter = message.charAt(index) - keyChar;
            decryptedChar = (char) newLetter;
            actualMessage.append(decryptedChar);
            
        } 
        }

            System.out.printf("%nDecrypted Message reads: %n%n%s%n" , actualMessage.toString());

            }
            }
}
}
}
