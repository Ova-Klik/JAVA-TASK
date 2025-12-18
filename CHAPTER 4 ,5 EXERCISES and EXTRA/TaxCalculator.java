import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of citizens: ");
        int citizen = input.nextInt();
        input.nextLine(); 

        double totalTax = 0;

        for (int counter = 1; counter <= citizen; counter++) {

            System.out.println("Enter citizen name: ");
            String name = input.nextLine();

            System.out.println("Enter citizen earnings: ");
            long earnings = input.nextLong();
            input.nextLine(); 
            double tax;

            if (earnings <= 30000) {
                tax = 0.15 * earnings;
            } else {
                tax = 0.20 * earnings;
            }

            System.out.printf("Tax for %s is %.2f%n", name, tax);

            totalTax += tax;
        }

        System.out.printf("Total tax collected is %.2f%n", totalTax);
    }
}

