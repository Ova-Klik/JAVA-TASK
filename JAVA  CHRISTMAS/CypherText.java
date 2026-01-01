import java.util.Scanner;


public class CypherText{
    public static void main (String...args){
    
    Scanner input=new Scanner(System.in);
    String newMessage = "";
    int key=0;
    int finalEncodedValue=0;
    int encodedDigit=0; 
    String actualMessage="";
    char encryptedChar= ' ';
    char decryptedChar=' ';
    

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
            System.out.print("Kindly enter the message to encrypt: ");
            String message = input.nextLine();

            System.out.print("\nKindly enter your encryption key (Single key e.g 3 or c): ");
            char keyChar = input.next().charAt(0);

        if(Character.isDigit(keyChar)){

            key=keyChar - '0';
            for (int index = 0; index < message.length(); index++) {
            encodedDigit = message.charAt(index);
            finalEncodedValue = encodedDigit + key;
            encryptedChar = (char) finalEncodedValue;

            newMessage += encryptedChar;
            }
            
        }else {
            for (int index = 0; index < message.length(); index++) {
            encodedDigit = message.charAt(index);
            finalEncodedValue = encodedDigit + keyChar;
            encryptedChar = (char) finalEncodedValue;

            newMessage += encryptedChar;
            
        } 
        }

            System.out.println("\nEncrypted Message: \n\n" + newMessage);

            }
            
       case 2-> {      
            System.out.print("Kindly enter the message to Decrypt: ");
            String message = input.nextLine();

            System.out.print("Kindly enter your Decryption key (Single key e.g 3 or c): ");
            char keyChar = input.next().charAt(0);

        if(Character.isDigit(keyChar)){

            key=keyChar - '0';
            for (int index = 0; index < message.length(); index++) {
            encodedDigit = message.charAt(index);
            finalEncodedValue = encodedDigit - key;
            decryptedChar = (char) finalEncodedValue;

            actualMessage += encryptedChar;
            }
            
        }else {
            for (int index = 0; index < message.length(); index++) {
            encodedDigit = message.charAt(index);
            finalEncodedValue = encodedDigit - keyChar;
            decryptedChar = (char) finalEncodedValue;

            actualMessage += decryptedChar;
            
        } 
        }

            System.out.println("\nThe actual Message: \n" + actualMessage);
     
            }   
            }
}
}
}
