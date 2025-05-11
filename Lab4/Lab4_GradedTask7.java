import java.util.Scanner;

public class Lab4_GradedTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable Declaration
        double length1;
        double width1;
        double length2;
        double width2;
        int area1;
        int area2;

        // User Input
        System.out.print("Enter length for first rectangle: ");
        length1 = scanner.nextDouble();
        System.out.print("Enter width for first rectangle: ");
        width1 = scanner.nextDouble();

        System.out.print("Enter length for second rectangle: ");
        length2 = scanner.nextDouble();
        System.out.print("Enter width for second rectangle: ");
        width2 = scanner.nextDouble();

        // Calculation
        area1 = (int) (length1 * width1);
        area2 = (int) (length2 * width2);

        // Conditional Statements

        if (area1 > area2) {
            System.out.println("Reactangle-1 is larger.");
        } else if (area1 < area2) {
            System.out.println("Rectangle-2 is larger.");
        } else {
            System.out.println("Both Rectangles are Equal.");
        }

        scanner.close();
    }

}