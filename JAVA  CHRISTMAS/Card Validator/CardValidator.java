import java.util.Scanner;


public class CardValidator{
    public static void main (String[] args){
    
    
    Scanner take=new Scanner(System.in);
    while (true){
    System.out.print("\nHello Kindly enter card number to verify:\n ");
    String number=take.nextLine();
    
    CardValidatorChecker.validateCard(number);
    
    System.out.printf("%n Will you like to validate another card (yes/no): ");
            String more=take.nextLine();
         
            if(more.equalsIgnoreCase("yes")){
                continue;
            }else{
                  System.out.printf("%n Thank you %n%n");
                break;
            }
    }
}
}





