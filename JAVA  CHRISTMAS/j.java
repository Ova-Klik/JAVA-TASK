import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOutAppBranch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter customFormatter =
                DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
        String formattedDateTime = currentDateTime.format(customFormatter);

        System.out.print("Enter Customer's Name: ");
        String customersName = input.nextLine();

        int count = 0;
        double SubTotal = 0;

        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Double> unitPrice = new ArrayList<>();

        double discountPercent = 0;
        String cashiersName = "";
        String more = "yes";

        while (true) {

            System.out.print("What did the user buy?: ");
            productName.add(input.nextLine());

            System.out.print("How many pieces?: ");
            quantity.add(input.nextInt());

            System.out.print("How much per unit?: ");
            unitPrice.add(input.nextDouble());
            input.nextLine();

            subTotal1 += quantity.get(count) * unitPrice.get(count);
            Systme.out.println(SubTotal);
            System.out.print("Add more item?: ");
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

        double discount = SubTotal * (discountPercent / 100);
        double vat = SubTotal * 0.075;
        double billTotal = SubTotal(index) - discount + vat;
        
        System.out.printf("""
        
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date: %s

                Cashier: %s
                Customer's Name: %s

                =====================================================
                                ITEM      QTY     PRICE     TOTAL(NGN)
                -----------------------------------------------------
        """, formattedDateTime, cashiersName, customersName);

        for (int i = 0; i < productName.size(); i++) {
            double productTotal = quantity.get(i) * unitPrice.get(i);
            System.out.printf(
                    "                %-10s %5d %10.2f %12.2f%n",
                    productName.get(i),
                    quantity.get(i),
                    unitPrice.get(i),
                    productTotal
            );
        }

        System.out.printf("""
                -----------------------------------------------------
                                Sub Total:          %.2f
                                Discount:           %.2f
                              VAT @ 7.5%%:           %.2f
                =====================================================
                                Bill Total:         %.2f
                ======================================================
        """, SubTotal, discount, vat, billTotal);

        System.out.print("How much did the customer give to you: ");
        double amountPaid = input.nextDouble();
        double balance = amountPaid - billTotal;

        System.out.printf("""
                Amount Paid:         %.2f
                Balance:             %.2f
                ======================================================
                        THANK YOU FOR YOUR PATRONAGE
                ======================================================
        """, amountPaid, balance);

    }
}

