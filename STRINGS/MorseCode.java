package string;


import java.util.Scanner;

public class MorseCode {
    static final String[] CODE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
        "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
        "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    static String toMorse(String text) {
        StringBuilder result = new StringBuilder();
        for (String word : text.toUpperCase().split(" ")) {
            for (char letter : word.toCharArray())
                if (letter >= 'A' && letter <= 'Z')
                    result.append(CODE[letter - 'A']).append(" ");
            result.append("   ");
        }
        return result.toString().trim();
    }

    static String toEnglish(String morse) {
        StringBuilder result = new StringBuilder();
        for (String word : morse.split("   ")) {
            for (String letter : word.trim().split(" ")) {
                for (int pos = 0; pos < CODE.length; pos++)
                    if (CODE[pos].equals(letter))
                        result.append((char) ('A' + pos));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter English text: ");
        String english = input.nextLine();
        String morse = toMorse(english);
        System.out.println("Morse: " + morse);
        System.out.println("Back to English: " + toEnglish(morse));
    }
}
