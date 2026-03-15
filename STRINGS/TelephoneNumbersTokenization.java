package string;

import java.util.Scanner;

public class TelephoneNumbersTokenization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number (555) 555-5555: ");
        String phone = input.nextLine();

        String[] parts = phone.split("[()\\- ]+");
        String areaCode   = parts[1];
        String firstThree = parts[2];
        String lastFour   = parts[3];
        String number     = firstThree + lastFour;

        System.out.printf("Area code: %s%n", areaCode);
        System.out.printf("Phone number: %s%n", number);
    }
}
