import java.util.Scanner;

public class Lab4_GradedTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int num;

        // User input and initialization
        System.out.print("Enter any number from 1 to 10: ");
        num = scanner.nextInt();

        // By switch statement
        switch (num) {
            case 1:
                System.out.println("Roman Version of your entered number is: I");
                break;

            case 2:
                System.out.println("Roman Version of your entered number is: II");
                break;

            case 3:
                System.out.println("Roman Version of your entered number is: III");
                break;

            case 4:
                System.out.println("Roman Version of your entered number is: IV");
                break;

            case 5:
                System.out.println("Roman Version of your entered number is: V");
                break;

            case 6:
                System.out.println("Roman Version of your entered number is: VI");
                break;

            case 7:
                System.out.println("Roman Version of your entered number is: VII");
                break;

            case 8:
                System.out.println("Roman Version of your entered number is: VIII");
                break;

            case 9:
                System.out.println("Roman Version of your entered number is: IX");
                break;

            case 10:
                System.out.println("Roman Version of your entered number is: X");
                break;

            default:
                System.out.println("Entered number is out of Range!");
                break;
        }
        scanner.close();
    }
}