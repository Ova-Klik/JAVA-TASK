import java.util.Scanner;

public class TaxApp{
    public static void main(String[] args){
    
    Scanner input=new Scanner(System.in);
    System.out.print("\nEnter earnings: ");
    long earnings=input.nextLong();
    
    double tax = TaxMethod.taxCalc(earnings);
    
    System.out.printf("%nYour tax amount is: %.2f%n%n", tax);
    
    }


}


