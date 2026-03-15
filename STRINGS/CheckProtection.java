package string;

import java.util.Scanner;

public class CheckProtection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter check amount: ");
        String amount = input.nextLine();

        int totalSpaces = 9;
        int stars = totalSpaces - amount.length();
        String protected_ = "*".repeat(stars) + amount;

        System.out.printf("Check-protected amount: %s%n", protected_);
    }
}
