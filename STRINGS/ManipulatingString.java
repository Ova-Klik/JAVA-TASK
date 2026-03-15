package string;

import java.util.Scanner;
import java.util.ArrayList;

public class ManipulatingString {
    static boolean hasSpecialCharacter(String word) {
        for (char letter : word.toCharArray())
            if (!Character.isLetterOrDigit(letter))
                return true;
        return false;
    }

    static String formatWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> withSpecial    = new ArrayList<>();
        ArrayList<String> withoutSpecial = new ArrayList<>();

        System.out.println("Enter strings (enter '#' to stop):");
        String word = input.nextLine();
        while (!word.equals("#")) {
            if (hasSpecialCharacter(word))
                withSpecial.add(formatWord(word));
            else
                withoutSpecial.add(formatWord(word));
            word = input.nextLine();
        }

        System.out.printf("%nStrings without special characters (%d):%n", withoutSpecial.size());
        for (String entry : withoutSpecial)
            System.out.println(entry);

        System.out.printf("%nStrings with special characters (%d):%n", withSpecial.size());
        for (String entry : withSpecial)
            System.out.println(entry);
    }
}
