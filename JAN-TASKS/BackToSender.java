import java.util.Scanner;
import java.util.ArrayList;

public class BackToSender {
        static  final int BASEPAY= 5000;
      
        static String run="start";   
        static String more="";
        
    public static void main(String... args) {
        
        
        Scanner input = new Scanner(System.in);
        
        double numberOfDelivery=0.0;
        
String paymentBoard=("""
                                    WELCOME TO DELIVERY PAYMENT BOARD 
                            ___________________________________________________
                            |                 |                   |           |
                            | Collection Rate | Amount Per Parcel | Base Pay  |
                            ---------------------------------------------------      
                            | Less than 50%   |       160         |     5000  |    
                            ---------------------------------------------------      
                            | 50 - 59%        |       200         |     5000  |   
                            ---------------------------------------------------      
                            | 60 - 69%        |       250         |     5000  |   
                            ---------------------------------------------------      
                            | >=70%           |       500         |     5000  | 
                            |_________________________________________________|  
                            
                            
                            
                            
                            """);              
         System.out.print(paymentBoard);     
              
 while(run=="start"){
        System.out.print("Kindly enter number of successful deliveries (0-100): ");
        String number = input.nextLine();
        
        if(!number.matches("^[0-9]+$")){
          System.out.println("Invalid input!"); 
          continue;
        
        }else{
           numberOfDelivery= Double.parseDouble(number);
           
        }
        
      
        
   double wages= getPayment(numberOfDelivery);
   System.out.printf("%n%nYour wage for Today is:$%,.2f %n%n",wages);
   
   while(run=="start"){
   System.out.print("Will you like to calculate Wage for next Rider(yes/no): ");
    more  = input.nextLine().trim();
    
    if (more.equalsIgnoreCase("yes")){
        break;
    }else if(more.equalsIgnoreCase("no")){
        run="stop";
        break;        
    }else{
        System.out.println("\n\tInvalid input!");
        continue;
    }
   
   }
  }    
 }             
 public static double getPayment (double numberOfDelivery){
 
 double payment =0;

 
 
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
