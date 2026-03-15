package string;


import java.util.Scanner;

public class DefiningYourOwnStringMethods {
    static int indexOf(String source, String target) {
        for (int position = 0; position <= source.length() - target.length(); position++)
            if (source.substring(position, position + target.length()).equals(target))
                return position;
        return -1;
    }

    static int lastIndexOf(String source, String target) {
        for (int position = source.length() - target.length(); position >= 0; position--)
            if (source.substring(position, position + target.length()).equals(target))
                return position;
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter source string: ");
        String source = input.nextLine();
        System.out.print("Enter target string: ");
        String target = input.nextLine();

        System.out.printf("indexOf:     %d%n", indexOf(source, target));
        System.out.printf("lastIndexOf: %d%n", lastIndexOf(source, target));
    }
}
