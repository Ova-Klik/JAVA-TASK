import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOutApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter customFormatter =
        DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
        String formattedDateTime = currentDateTime.format(customFormatter);

        System.out.print("Enter Customer's Name: ");
        String customersName = input.nextLine();

        System.out.print("What did the user buy?: ");
        String productName = input.nextLine();

        System.out.print("How many pieces?: ");
        int quantity = input.nextInt();

        System.out.print("How much per unit?: ");
        double unitPrice = input.nextDouble();

        System.out.print("How much discount will you give in percentage (2%)?: ");
        double discountPercent = input.nextDouble();
        input.nextLine(); 

        System.out.print("Enter Your Name: ");
        String cashiersName = input.nextLine();
      
        double productTotal = unitPrice * quantity;
        double subTotal1 = productTotal;
        double discount = subTotal * (discountPercent/100);
        double vat = subTotal * 0.075;
        double billTotal = subTotal - discount + vat;
        double amountPaid=0;
        
        
        System.out.printf("""
        
                    SEMICOLON STORES
                    MAIN BRANCH
                    LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                    TEL: 03293828343
                    Date: %s
                    
                    Cashier: %s
                    Customer's Name: %s
                    
                    =====================================================
                                       ITEM    QTY     PRICE   TOTAL(NGN)
                    -----------------------------------------------------
                                    %s        %d      %.2f      %.2f
                    _____________________________________________________
                                            Sub Total:          %.2f   
                                            Discount:           %.2f
                                          VAT @ 7.5%%:           %.2f           
                    ======================================================
                                             Bill Total:         %.2f
                                           
                    ======================================================
                        THIS IS NOT A RECEIPT...KINDLY PAY   %.2f
                    ======================================================
        %n """,
        formattedDateTime,
        cashiersName,
        customersName,
        productName,
        quantity,
        unitPrice,
        productTotal,
        subTotal,
        discount,
        vat,
        billTotal,
        billTotal
        );
        
          
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
                                       ITEM    QTY     PRICE   TOTAL(NGN)
                    -----------------------------------------------------
                                    %s          %d      %.2f   %.2f
                    _____________________________________________________
                                            Sub Total:          %.2f   
                                            Discount:           %.2f
                                          VAT @ 7.5%%:           %.2f           
                    ======================================================
                                             Bill Total:         %.2f
                                            Amount Paid:         %.2f
                                                Balance:         %.2f
                    ======================================================
                                THANK YOU FOR YOUR PATRONAGE
                    ======================================================
        %n """,
        formattedDateTime,
        cashiersName,
        customersName,
        productName,
        quantity,
        unitPrice,
        productTotal,
        subTotal,
        discount,
        vat,
        billTotal,
        billTotal, 
        amountPaid, 
        balance
        );


     
    }
}

