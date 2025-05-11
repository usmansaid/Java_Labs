import java.util.Scanner;
public class Lab2_Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int num2 = scanner.nextInt();

        System.out.println("Inches = " + num1);
        System.out.println("feet = " + num2);

        scanner.close();

    }
}
