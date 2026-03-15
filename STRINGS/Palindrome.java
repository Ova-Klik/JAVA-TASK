package string;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String text) {
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        if (isPalindrome(text))
            System.out.printf("\"%s\" is a palindrome.%n", text);
        else
            System.out.printf("\"%s\" is not a palindrome.%n", text);
    }
}
