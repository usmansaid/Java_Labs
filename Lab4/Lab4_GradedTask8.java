import java.util.Scanner;

public class Lab4_GradedTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable Declaration
        int day;
        int month;
        int year;

        // User Input
        System.out.print("Enter day, month, and two digit year. (2 4 18), separated by spaces: ");

        // VAlue assigning from input
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        // Calculation
        int magicYear = day * month;

        // Conditionals
        if (magicYear == year) {
            System.out.println("You entered a magical Year date!");
        } else {
            System.out.println("Your entered date is not magical.");
        }

        scanner.close();
    }
}
