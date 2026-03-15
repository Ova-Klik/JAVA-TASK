package string;


import java.util.Scanner;

public class SpellingChecker {
    static final String[] WORD_LIST = {"the", "be", "to", "of", "and", "a", "in", "that",
        "have", "it", "for", "not", "on", "with", "he", "as", "you", "do", "at", "this",
        "default", "computer", "program", "java", "string", "array", "class", "object"};

    static boolean isInList(String word) {
        for (String entry : WORD_LIST)
            if (entry.equals(word))
                return true;
        return false;
    }

    static void suggestTranspositions(String word) {
        char[] letters = word.toCharArray();
        for (int pos = 0; pos < letters.length - 1; pos++) {
            char temp = letters[pos];
            letters[pos] = letters[pos + 1];
            letters[pos + 1] = temp;
            String transposed = new String(letters);
            if (isInList(transposed))
                System.out.printf("Did you mean \"%s\"?%n", transposed);
            letters[pos + 1] = letters[pos];
            letters[pos] = temp;
        }
    }

    static void suggestDoubleLetterFix(String word) {
        for (int pos = 0; pos < word.length() - 1; pos++)
            if (word.charAt(pos) == word.charAt(pos + 1)) {
                String fixed = word.substring(0, pos) + word.substring(pos + 1);
                if (isInList(fixed))
                    System.out.printf("Did you mean \"%s\"?%n", fixed);
            }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();

        if (isInList(word)) {
            System.out.println("Word is spelled correctly.");
        } else {
            System.out.println("Word is not spelled correctly.");
            suggestTranspositions(word);
            suggestDoubleLetterFix(word);
        }
    }
}
