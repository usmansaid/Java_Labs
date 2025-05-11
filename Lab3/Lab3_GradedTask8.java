import java.util.Scanner;
public class Lab3_GradedTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (0 to 1000): ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int sum = digit1 + digit2 + digit3;
        System.out.println("Sum of each digit of your number is: " + sum);
        
        scanner.close();
    }
}
