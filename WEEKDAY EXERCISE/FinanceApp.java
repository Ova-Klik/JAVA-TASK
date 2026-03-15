import java.util.Scanner; 


public class FinancialApp{

    public static void main (String...args){
    
    Scanner input=new Scanner(System.in);
    
    System.out.print("Kindly enter Loan Amount: ");
    double loanAmount=input.nextDouble();
   
    System.out.print("Kindly enter Number of Years: ");
    int numberOfYears= input.nextInt();
    
    int numberOfPayments = numberOfYears * 12;
    
     System.out.printf("%n%4s%-18s%-20s%s%n","","Interest Rate", "Monthly Payment", "Total Payment");
     System.out.println("=".repeat(60));
    
    for(double annualInterestRate=5.0; annualInterestRate<=10.0; annualInterestRate+=0.25){
        
        double monthlyRate=annualInterestRate/100/12;
        double monthlyPayment= (loanAmount * monthlyRate) /(1 - Math.pow(1 + monthlyRate, -numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;
    
        System.out.printf("%4s%.3f%% %21.2f %20.2f%n","",annualInterestRate, monthlyPayment, totalPayment);
    }
    
    }
    }
    
    
  
