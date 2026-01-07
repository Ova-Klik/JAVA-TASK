import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class CheckOutAppBranch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String formattedDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a"));
        
        System.out.print("Enter Customer's Name: ");
        String customersName = input.nextLine();
        
        int count=0;
        double subTotal=0;
        
        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Double> unitPrice = new ArrayList<>();
        
        double discountPercent=0;
        String cashiersName="";
        String more="yes";
        
        while (true) {

    System.out.println("What did the user buy?: ");
    productName.add(input.nextLine());

    System.out.println("How many pieces?: ");
    quantity.add(input.nextInt());

    System.out.println("How much per unit?: ");
    unitPrice.add(input.nextDouble());
    input.nextLine();


    subTotal += unitPrice.get(count) * quantity.get(count);

    System.out.print("Add more item?(yes/no): ");
    more = input.nextLine();

    if (more.equalsIgnoreCase("no")) {
        System.out.print("Enter Your Name: ");
        cashiersName = input.nextLine();

        System.out.print("How much discount will you give in percentage (2%)?: ");
        discountPercent = input.nextDouble();
        break;
    }

    count++;
}

      

      
      
        
        
        double discount = subTotal * (discountPercent/100);
        double vat = subTotal * 0.075;
        double billTotal = subTotal - discount + vat;
        double amountPaid=0;
        
        
        
       System.out.printf(           """ 
                
                                            SEMICOLON STORES
                                            MAIN BRANCH
                                            LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                                            TEL: 03293828343
                                            Date: %s
                                            
                                            Cashier: %s
                                            Customer's Name: %s
                                            
                                            =====================================================
                                                            ITEM      QTY     PRICE    TOTAL(NGN)
                                            -----------------------------------------------------
                                    
                                   """, formattedDateTime, cashiersName, customersName);      
                          
                           
                                             
                                            for(int index=0;index<productName.size();index++){
                                            
                                                double productTotal=quantity.get(index) * unitPrice.get(index);
                                                
                                System.out.printf("\t\t%8s %6d %11.2f %0.2f%n",
                                productName.get(index), quantity.get(index), unitPrice.get(index), productTotal
                                );
                }
  System.out.printf(              """     
                                            _____________________________________________________
                                                        
                                                                    Sub Total:          %.2f   
                                                                    Discount:           %.2f
                                                                  VAT @ 7.5%%:          %.2f           
                                            ======================================================
                                                                    Bill Total:         %.2f
                                                                  
                                            ======================================================
                                                   THIS IS NOT A RECEIPT...KINDLY PAY   %.2f
                                            ======================================================
                                  """,subTotal,discount,vat,billTotal,billTotal);
                                    
        
          
       System.out.print("How much did the customer give to you: ");
        amountPaid = input.nextDouble();
        double balance = amountPaid-billTotal;

        
         
        System.out.printf("""
                        
                                            SEMICOLON STORES
                                            MAIN BRANCH
                                            LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                                            TEL: 03293828343
                                            Date: %s
                                            
                                            Cashier: %s
                                            Customer's Name: %s
                                            
                                            =====================================================
                                                            ITEM      QTY     PRICE    TOTAL(NGN)
                                            -----------------------------------------------------
                                    
                                   """, formattedDateTime, cashiersName, customersName);      
                          
                           
                                     
                                            for(int index=0;index<productName.size();index++){
                                            
                                                double productTotal=quantity.get(index) * unitPrice.get(index);
                                                
                                        System.out.printf("\t\t%8s %6d %11.2f %13.2f%n",
                                        productName.get(index), quantity.get(index), unitPrice.get(index), productTotal
                                        );
                }
                    System.out.printf("""     
                                                _____________________________________________________
                                                            
                                                                        Sub Total:          %.2f   
                                                                         Discount:          %.2f
                                                                      VAT @ 7.5%%:          %.2f           
                                                ======================================================
                                                                        Bill Total:         %.2f
                                                                        Amount Paid:        %.2f
                                                                        Balance:            %.2f
                                                ======================================================
                                                               THANK YOU FOR YOUR PATRONAGE
                                                ======================================================
                                       """,subTotal,discount,vat,billTotal,amountPaid,balance);



     
    }
}

