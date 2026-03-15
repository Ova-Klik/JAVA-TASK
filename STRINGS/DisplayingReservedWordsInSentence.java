package string;

import java.util.Scanner;

public class DisplayingReservedWordsInSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String[] tokens = input.nextLine().split(" ");

        System.out.print("Reversed: ");
        for (int position = tokens.length - 1; position >= 0; position--)
            System.out.print(tokens[position] + " ");
        System.out.println();
    }
}
