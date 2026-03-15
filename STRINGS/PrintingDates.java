package string;

import java.util.Scanner;

public class PrintingDates {
    static final String[] MONTHS = {"", "January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date (MM/DD/YYYY): ");
        String[] parts = input.nextLine().split("/");

        int month = Integer.parseInt(parts[0]);
        int day   = Integer.parseInt(parts[1]);
        int year  = Integer.parseInt(parts[2]);

        System.out.printf("%s %d, %d%n", MONTHS[month], day, year);
    }
}
