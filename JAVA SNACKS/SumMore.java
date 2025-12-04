import java.util.Scanner;

public class SumMore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers to add");

        int sum = 0;
        int number;
        
        for (int count = 0; count < 10; count++) {
            System.out.print("Enter number " + (count + 1) + ": ");
            number = input.nextInt();
            sum += number;  
        }
int average = sum / 10;

System.out.printf("The Sum of the Ten Numbers is %d and the average is %d%n", sum, average);
    }
}

