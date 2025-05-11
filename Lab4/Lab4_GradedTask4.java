import java.util.Scanner;

public class Lab4_GradedTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minimum of two numbers
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Smaller number: " + Math.min(a, b));

        // Minimum of two numbers (Repeated)
        System.out.print("Enter two numbers again: ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Smaller number: " + Math.min(c, d));

        // Sign function (used to give sign of a number if it is greater than 0(+), less
        // than 0(-)).
        System.out.print("Enter a number for sign check: ");
        int x = scanner.nextInt();
        int sign = (x > 0) ? 1 : (x < 0) ? -1 : 0; // Ternary Operator
        System.out.println("Sign: " + sign);

        // Minimum of three numbers
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("Smallest number: " + min);

        scanner.close();
    }
}
