import java.util.Scanner;


public class CypherText{
    public static void main (String...args){
    
    Scanner input=new Scanner(System.in);
    String newMessage = "";
    int key=0;
    int finalEncodedValue=0;
    int encodedDigit=0; 

    
    System.out.print("Kindly enter the message to encrypt: ");
    String message = input.nextLine();

    System.out.print("Kindly enter your encryption key (Single key e.g 3): ");
    char keyChar = input.next().charAt(0);

if(Character.isDigit(keyChar)){

    key=keyChar - '0';
    for (int index = 0; index < message.length(); index++) {
    encodedDigit = message.charAt(index);
    finalEncodedValue = encodedDigit + key;
    char encryptedChar = (char) finalEncodedValue;

    newMessage += encryptedChar;
    }
    
}else {
    for (int index = 0; index < message.length(); index++) {
    encodedDigit = message.charAt(index);
    finalEncodedValue = encodedDigit + keyChar;
    char encryptedChar = (char) finalEncodedValue;

    newMessage += encryptedChar;
    
} 

}

System.out.println("Encrypted Message: " + newMessage);


       
    }

}
