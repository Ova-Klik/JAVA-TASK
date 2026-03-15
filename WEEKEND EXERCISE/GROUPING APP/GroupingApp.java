import java.util.Scanner;
import java.util.Random;

public class GroupingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int numberOfPeople = input.nextInt();
        input.nextLine();

        String[] people = new String[numberOfPeople];
        for (int row = 0; row < numberOfPeople; row++) {
            System.out.print("Enter name of person " + (row + 1) + ": ");
            people[row] = input.nextLine();
        }

        shuffleArray(people);

        System.out.print("Enter number of groups: ");
        int numberOfGroups = input.nextInt();

        generateGroups(people, numberOfGroups);
    }

    public static void shuffleArray(String[] array) {
        Random random = new Random();
        for (int row = array.length - 1; row > 0; row--) {
            int column = random.nextInt(row + 1);
            String temp = array[row];
            array[row] = array[column];
            array[column] = temp;
        }
    }

    public static void generateGroups(String[] people, int numberOfGroups) {
        System.out.println("\n--- GROUPS ---");

        int baseSize = people.length / numberOfGroups;
        int extra = people.length % numberOfGroups;

        int personIndex = 0;

        for (int row = 0; row < numberOfGroups; row++) {
            int groupSize = baseSize + (row < extra ? 1 : 0);
            System.out.println("Group " + (row + 1) + ":");
            for (int column = 0; column < groupSize; column++) {
                System.out.println(people[personIndex]);
                personIndex++;
            }
            System.out.println();
        }
    }
}
