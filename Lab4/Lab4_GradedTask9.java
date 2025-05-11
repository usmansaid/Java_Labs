import java.util.Scanner;

public class Lab4_GradedTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Userinput
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        // Calculation / total cents
        int totalCents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);

        // Conditionals
        if (totalCents == 100) {
            System.out.println("Congratulations! You've made exactly one dollar!");
        } else if (totalCents < 100) {
            System.out.println("The amount entered is less than one dollar. Try again!");
        } else {
            System.out.println("The amount entered is more than one dollar. Try again!");
        }

        scanner.close();
    }
}
