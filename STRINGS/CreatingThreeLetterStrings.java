package string;


import java.util.Scanner;

public class CreatingThreeLetterStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String word = input.nextLine().toLowerCase();

        System.out.println("Three-letter combinations:");

        for (int first = 0; first < word.length(); first++)
            for (int second = 0; second < word.length(); second++)
                for (int third = 0; third < word.length(); third++)
                    if (first != second && first != third && second != third)
                        System.out.println("" + word.charAt(first) + word.charAt(second) + word.charAt(third));
    }
}
