import java.util.Scanner;

public class Lab4_GradedTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables Declaration
        int num1;
        int num2;
        int num3;

        // User input and initialization
        System.out.print("Enter three numbers separated by spaces: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        // By Conditionals
        if (num1 == num2 && num2 == num3) {
            System.out.println(3);
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}
