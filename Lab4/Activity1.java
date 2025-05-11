
// Leap Year:-
// A year will be a leap year if:
// 1- it is divisible by 4 but not by 100.
// 2- it is divisible by 400.
// You must have to check all the above conditions.

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int year;

        // User Input and initialization
        System.out.print("Enter a year(e.g 2024): ");
        year = scanner.nextInt();

        // By Conditionals
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}