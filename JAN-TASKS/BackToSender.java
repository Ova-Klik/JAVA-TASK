import java.util.Scanner;
import java.util.ArrayList;

public class BackToSender {
    public static void main(String... args) {
        
        Scanner input = new Scanner(System.in);

        MyMethods myByte = new MyMethods();
        String more="start";   
        
String paymentBoard=("""
                            ___________________________________________________
                            |                 |                   |           |
                            | Collection Rate | Amount Per Parcel | Base Pay  |
                            ---------------------------------------------------      
                            | Less | Amount Per Parcel | Base Pay  |
                            ---------------------------------------------------      
                            | Collection Rate | Amount Per Parcel | Base Pay  |
                            ---------------------------------------------------      
                            | Collection Rate | Amount Per Parcel | Base Pay  |
                            ---------------------------------------------------      
                            | Collection Rate | Amount Per Parcel | Base Pay  |    
                            
                            
                            
                            
                            """);              
              
              
 while(run=="start"){
        System.out.print("Kindly enter a string integer: ");
        String number = input.nextLine();
        
        if(!number.matches("^[0-100]$")){
          System.out.println("Invalid input!")  
        
        }else{
           double numberOfDelivery= Double.parseDouble(number);
        }
        
   double wages= getPayment(numberOfDelivery);
   System.out.printf("%n%nYour wage for Today is:$%,.2f %n%n",wages);
   while(run=="start"){
   System.out.print("Will you like to calculate Wage for next Rider(yes/no): ");
    more  = input.next();
    
    if (more.equalsIgnoreCase("yes")){
        break;
    }else if(more.equals.IgnoreCase("no")){
        run="stop";
        break;        
    }else{
        System.out.println("\n\tInvalid input!")
    }
   
   }
  }    
              
 public static double getPayment (double numberOfDelivery){
 
 double payment =0;
 final int BASEPAY= 5000;
 final double PACKAGE=100;
 
 succesfulDelivery= (numberOfDelivery/PACKAGE)*PACKAGE;
 
 if(numberOfDelivery<50){
    double amountOfParcel= 160;
    
    payment =numberOfDelivery * amountOfParcel + BASEPAY;
    return payment ;
    
 }else if(numberOfDelivery>=50 && numberOfDelivery<=59){
    double amountOfParcel= 200;
    
    payment =numberOfDelivery * amountOfParcel + BASEPAY;
    return payment ;
    
 }else if(numberOfDelivery>=60 && numberOfDelivery<=69){
    double amountOfParcel= 250;
    
    payment =numberOfDelivery * amountOfParcel + BASEPAY;
    return payment ;
    
 }else{
    double amountOfParcel= 500;
    
    payment =numberOfDelivery * amountOfParcel + BASEPAY;
    return payment ;
 }         
              
}
}
