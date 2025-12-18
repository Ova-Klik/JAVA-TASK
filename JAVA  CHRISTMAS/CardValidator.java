import java.util.Scanner;


public class CardValidator{
    public static void main (String[] args){
    
    
    Scanner input=new Scanner(System.in);
    System.out.print("\nHello Kindly enter card number to verify:\n ");
    String number=input.nextLine();
    
    
    CardValidatorChecker.validateCard(number);
}
}





