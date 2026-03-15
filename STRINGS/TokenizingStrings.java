package string;

import java.util.Scanner;

public class TokenizingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = input.nextLine();

        for (String word : line.split(" "))
            if (Character.isUpperCase(word.charAt(0)))
                System.out.println(word);
    }
}
