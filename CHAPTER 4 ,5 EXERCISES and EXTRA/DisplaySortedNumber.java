import java.util.Scanner;

public class DisplaySortedNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[3]; 
       
        for (int index = 0; index < 3; index++) {
            System.out.printf("Enter number #%d: ", i + 1);
            numbers[i] = input.nextDouble();
        }
        
        double number1 = numbers[0];
        double number2 = numbers[1];
        double number3 = numbers[2];


      
        SortedNumber(number1, number2, number3);
    }

    
    public static void SortedNumber(double number1, double number2, double number3) {
    double temp;

    if (number1 < number2) {
        temp = number1;
        number1 = number2;
        number2 = temp;
    }

    if (number1 < number3) {
        temp = number1;
        number1 = number3;
        number3 = temp;
    }

    if (number2 < number3) {
        temp = number2;
        number2 = number3;
        number3 = temp;
    }

    System.out.printf(
        "The numbers in decreasing order are: %.2f, %.2f, %.2f%n",
        number1, number2, number3
    );
}


}

