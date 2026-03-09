import java.util.Scanner;
import java.util.Random;

public class GroupingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("\n---Welcome to Grouping App--- ");
        
        
        System.out.print("\n\nEnter number of persons: ");
        int numberOfpersons = input.nextInt();
        input.nextLine();

        String[] persons = new String[numberOfpersons];
        for (int index = 0; index < numberOfpersons; index++) {
            System.out.print("Enter name of person " + (index + 1) + ": ");
            persons[index] = input.nextLine();
        }

        shuffleArray(persons);

        System.out.print("Enter number of groups: ");
        int numberOfGroups = input.nextInt();

        generateGroups(persons, numberOfGroups);
    }

    public static void shuffleArray(String[] array) {
        Random random = new Random();
        for (int index = array.length - 1; index > 0; index--) {
            int column = random.nextInt(index + 1);
            String temp = array[index];
            array[index] = array[column];
            array[column] = temp;
        }
    }

    public static void generateGroups(String[] persons, int numberOfGroups) {
        System.out.println("\n--- GROUP LIST ---");

        int baseSize = persons.length / numberOfGroups;
        int extra = persons.length % numberOfGroups;

        int personIndex = 0;

        for (int index = 0; index < numberOfGroups; index++) {
            int groupSize = baseSize + (index < extra ? 1 : 0);
            System.out.println("Group " + (index + 1) + ":\n");
            for (int column = 0; column < groupSize; column++) {
                System.out.printf(" %5s,",persons[personIndex]);
                personIndex++;
            }
            System.out.printf("%n%n");
        }
    }
}
