import java.util.Scanner; 


public class MortgageBank{

    public static void main (String...args){
    
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the principal amount: ");
    double principal=input.nextDouble();
    
    System.out.print("Enter the annual interest rate: ");
    double annualInterestRate=input.nextDouble();
    
    System.out.print("Enter duration: ");
    double duration=input.nextDouble();
    
    CalculatePayment(principal, annualInterestRate,duration);
    
    
        
    }
    
    
    public static void CalculatePayment (double principal, double annualInterestRate, double duration){
        
        duration=duration*12;
        double monthlyInterestRate=(annualInterestRate/100)/12;
        double monthlyPayment= principal * (monthlyInterestRate*(Math.pow(1 + monthlyInterestRate,duration)))/(Math.pow(1 + monthlyInterestRate,duration)-1);
        System.out.printf("Your monthly payment is: $%.2f %n%n", monthlyPayment);
    
    }
}
