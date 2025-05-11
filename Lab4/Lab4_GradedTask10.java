import java.util.Scanner;

public class Lab4_GradedTask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int booksCount;

        // User Input
        System.out.print("Enter total number of books you purchased: ");
        booksCount = scanner.nextInt();

        // Conditionals :- Here I will use ternary operator for which another variable
        // has to be declared
        int result = booksCount == 0 ? 0 : booksCount == 1 ? 5 : booksCount == 2 ? 15 : booksCount == 3 ? 30 : 60;

        // Output
        System.out.println("You earned " + result + " points");

        scanner.close();
    }
}
