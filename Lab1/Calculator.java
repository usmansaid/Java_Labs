//1. Simple Calculator (Syntax Errors)
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, sum;
        
        System.out.println("Enter first number: "); // Missing semicolon
        num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        
        sum = num1 + num2;

        System.out.println("Sum is: " + sum); // Missing closing parenthesis and semicolon
        
        scanner.close();
    }
}
