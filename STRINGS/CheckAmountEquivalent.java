package string;


import java.util.Scanner;

public class CheckAmountEquivalent {
    static final String[] ONES = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE",
        "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN",
        "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
    static final String[] TENS = {"", "", "TWENTY", "THIRTY", "FORTY", "FIFTY",
        "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};

    static String convertBelowHundred(int amount) {
        if (amount < 20)
            return ONES[amount];
        return TENS[amount / 10] + (amount % 10 != 0 ? " " + ONES[amount % 10] : "");
    }

    static String convertToWords(int dollars) {
        if (dollars >= 100)
            return ONES[dollars / 100] + " hundred" +
                (dollars % 100 != 0 ? " " + convertBelowHundred(dollars % 100) : "");
        return convertBelowHundred(dollars);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount (less than $1000.00): ");
        String[] parts = input.nextLine().split("\\.");

        int dollars = Integer.parseInt(parts[0]);
        int cents   = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;

        System.out.printf("%s and %02d/100%n", convertToWords(dollars), cents);
    }
}
