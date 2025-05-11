import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable Declaration
        int num;

        // User input and initialization
        System.out.print("Enter a whole number: ");
        num = scanner.nextInt();

        // By Conditionals
        if (num % 5 == 0 && num % 2 != 0) {
            System.out.println("This number is a multiple of five.");
        } else if (num % 2 == 0 && num % 5 != 0) {
            System.out.println("This number is a multiple of 2.");
        } else {
            System.out.println("This number is multiple both of five and two.");
        }
        scanner.close();
    }
}
