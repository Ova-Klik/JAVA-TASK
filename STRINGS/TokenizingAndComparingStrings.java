package string;


import java.util.Scanner;

public class TokenizingAndComparingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = input.nextLine();

        for (String word : line.split(" "))
            if (word.toUpperCase().endsWith("ED"))
                System.out.println(word);
    }
}
