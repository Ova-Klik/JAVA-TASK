import java.util.Scanner;

public class SumMore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers to add");

        int sum = 0;
        int number;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number = input.nextInt();
            sum += number;  
        }

        int average = sum / 10;

        System.out.printf("The Sum of the Ten Numbers is %d and the average is %d", sum, average);
    }
}

