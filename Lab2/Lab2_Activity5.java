import java.util.Scanner;

public class Lab2_Activity5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Enter Radius of the Circle: ");
        int radius = scanner.nextInt();

        double radiusSquare = Math.pow(radius, 2);

        double result = PI * radiusSquare;
        System.out.println("Area of circle is = " + result);

        scanner.close();
    }
}
