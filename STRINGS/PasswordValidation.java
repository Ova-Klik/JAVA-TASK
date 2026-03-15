
package string;

import java.util.Scanner;

public class PasswordValidation {
    static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 15)
            return false;
        if (!Character.isLetter(password.charAt(0)))
            return false;

        boolean hasUppercase = false;
        boolean hasDigit     = false;

        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) hasUppercase = true;
            if (Character.isDigit(character))     hasDigit     = true;
        }
        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (isValidPassword(password))
            System.out.println("Valid password.");
        else
            System.out.println("Invalid password. Must be 8-15 characters, start with a letter, contain at least one uppercase letter and one digit.");
    }
}
