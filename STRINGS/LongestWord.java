
package string;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String[] tokens  = input.nextLine().split(" ");
        String longestWord = "";

        for (String word : tokens)
            if (word.length() > longestWord.length())
                longestWord = word;

        System.out.printf("Longest word: %s (%d characters)%n", longestWord, longestWord.length());
    }
}
