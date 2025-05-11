import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Variable Declaration
        double hours;
        double wages;
        double rate;

        // User input and initialization
        System.out.print("Enter the working hours: ");
        hours = console.nextDouble();

        System.out.print("Enter the pay rate: ");
        rate = console.nextDouble();

        // By Conditionals
        if (hours > 40) {
            double overtimeHours = hours - 40;
            double overtimePay = overtimeHours * (rate * 1.5);
            wages = (40 * rate) + overtimePay;
        } else {
            wages = hours * rate;
        }

        // Output
        System.out.printf("Line 12: The wages are $%.2f %n", wages);
        console.close();
    }
}