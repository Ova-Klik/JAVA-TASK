package string;
import java.util.Scanner;

public class ComparingPortions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        System.out.print("Enter second string: ");
        String second = input.nextLine();
        System.out.print("Enter starting index in first string: ");
        int firstStart = input.nextInt();
        System.out.print("Enter starting index in second string: ");
        int secondStart = input.nextInt();
        System.out.print("Enter number of characters to compare: ");
        int length = input.nextInt();

        boolean result = first.regionMatches(true, firstStart, second, secondStart, length);
        System.out.printf("The compared regions are %s.%n", result ? "equal" : "not equal");
    }
}
