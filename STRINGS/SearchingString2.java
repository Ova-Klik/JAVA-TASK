package string;

import java.util.Scanner;

public class SearchingString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text  = input.nextLine().toLowerCase();
        int[] counts = new int[26];

        for (char letter : text.toCharArray())
            if (Character.isLetter(letter))
                counts[letter - 'a']++;

        System.out.printf("%-10s%s%n", "Letter", "Occurrences");
        for (int letter = 0; letter < counts.length; letter++)
            System.out.printf("%-10c%d%n", (char) ('a' + letter), counts[letter]);
    }
}
