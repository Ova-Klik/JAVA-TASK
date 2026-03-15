
package string;

import java.util.Scanner;

public class PigLatin {
    static String translateWord(String word) {
        return word.substring(1) + word.charAt(0) + "ay";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        StringBuilder pigLatin = new StringBuilder();
        for (String word : sentence.split(" "))
            pigLatin.append(translateWord(word)).append(" ");

        System.out.println("Pig Latin: " + pigLatin.toString().trim());
    }
}
