import java.util.Scanner;
public class Lab3_GradedTask1{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        double amount = scanner.nextDouble();

       double totalCents = Math.round(amount * 100);
       System.out.println("Total cents: " + totalCents);

       int dollars = (int)totalCents / 100;
       System.out.println("Dollars are: " + dollars);

       int remainingCents = (int)totalCents % 100;
       System.out.println("Remaining cents are: " + remainingCents);

       int quarters = remainingCents / 25;
       System.out.println("Quarters are: " + quarters);

       remainingCents %= 25;

       int dimes = remainingCents / 10;
       System.out.println("Dimes are: " + dimes);

       remainingCents %= 10;

       int nickles = remainingCents / 5;
       System.out.println("Nickles are: " + nickles);

       remainingCents %= 5;
       System.out.println("Remaining " + remainingCents + " are Pennies.");

       scanner.close();

    }
}
