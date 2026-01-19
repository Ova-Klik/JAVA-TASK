import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class CheckOutApp{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String formattedDateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a"));

        System.out.println("Enter Customer's Name: ");
        String customersName = input.nextLine();

        double subTotal = 0;
        double discountPercent = 0;
        String cashiersName = "";

      
        ArrayList<String[]> products = new ArrayList<>();

        while (true) {
          
            System.out.println("What did the user buy?: ");
            String productName = input.nextLine();

         
            String quantityStr;
            while (true) {
                System.out.println("How many pieces(e.g 4)?: ");
                quantityStr = input.nextLine();
                if (quantityStr.matches("^(?!0+(\\.0+)?$)\\d+")) break;
                System.out.println("Invalid Input!!!\n");
            }

           
            String priceStr;
            while (true) {
                System.out.println("How much per unit?: ");
                priceStr = input.nextLine();
                if (priceStr.matches("^(?!0+(\\.0+)?$)\\d+(\\.\\d{1,2})?$")) break;
                System.out.println("Invalid Input!!!\n");
            }

            
            double total = Integer.parseInt(quantityStr) * Double.parseDouble(priceStr);

          
            products.add(new String[]{productName, quantityStr, priceStr, String.format("%.2f", total)});

            subTotal += total;

           
            System.out.println("Add more item?(yes/no): ");
            String more = input.nextLine();
            if (more.equalsIgnoreCase("no")) {
                System.out.println("Enter Your Name: ");
                cashiersName = input.nextLine();

                System.out.println("How much discount will you give in percentage (e.g 2%)?: ");
                discountPercent = input.nextDouble();
                break;
            }
        }

      
        double discount = subTotal * (discountPercent / 100);
        double vat = subTotal * 0.075;
        double billTotal = subTotal - discount + vat;

        
        System.out.printf("""
                
                ============================================================
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
                TEL: 03293828343
                Date: %s
                Cashier: %s
                Customer's Name: %s
                ============================================================
                %-25s %5s %10s %15s
                ------------------------------------------------------------
                """, formattedDateTime, cashiersName, customersName,
                "ITEM", "QTY", "PRICE", "TOTAL");

        for (String[] product : products) {
            String name = product[0];
            int qty = Integer.parseInt(product[1]);
            double price = Double.parseDouble(product[2]);
            double total = Double.parseDouble(product[3]);

            System.out.printf("%-25s %5d %10.2f %15.2f%n", name, qty, price, total);
        }

        System.out.printf("""
                ------------------------------------------------------------
                %-42s %15.2f
                %-42s %15.2f
                %-42s %15.2f
                ============================================================
                %-42s %15.2f
                ============================================================
                """,
                "Sub Total:", subTotal,
                "Discount:", discount,
                "VAT @ 7.5%:", vat,
                "Bill Total:", billTotal);

   
        System.out.println("\nHow much did the customer give to you: ");
        double amountPaid = input.nextDouble();
        double balance = amountPaid - billTotal;

        System.out.printf("""
                %-42s %15.2f
                %-42s %15.2f
                ============================================================
                                THANK YOU FOR YOUR PATRONAGE
                ============================================================
                """,
                "Amount Paid:", amountPaid,
                "Balance:", balance);
    }
}

