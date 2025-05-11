import java.util.Scanner;

public class Lab3_GradedTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double SALARY_PER_HOUR = 15.50;
        final double PARENTS_SPENDING = 0.50;
        //Below all are percentages
        final double TAX = 0.14;
        final double CLOTHES_SPENDING = 0.1;
        final double SCHOOL_SPENDINGS = 0.01;
        final double BONDS_SPENDING = 0.25;

        

        System.out.print("Enter the number of hours you worked for a week: ");
        int hoursEachWeek = scanner.nextInt();

        double totalIncome = hoursEachWeek * 5 * SALARY_PER_HOUR; 
        double taxes = totalIncome * TAX;
        double netIncome = totalIncome - taxes;
        double clothesSpendings = netIncome * CLOTHES_SPENDING;
        double schoolSpendings = netIncome * SCHOOL_SPENDINGS;
        double remainingIncome = netIncome - ( clothesSpendings + schoolSpendings );
        double bondsSpendings = remainingIncome * BONDS_SPENDING;
        double parentSpendings = bondsSpendings * PARENTS_SPENDING;

        System.out.printf("Your Salary before Taxes: $%.2f\n ", totalIncome);
        System.out.printf("Your Salary after Taxes: $%.2f\n ", netIncome);
        System.out.printf("Your Clothes Spendings: $%.2f\n ", clothesSpendings);
        System.out.printf("Your School Spendings: $%.2f\n ", schoolSpendings);
        System.out.printf("Your Bonds Spendings: $%.2f\n ", bondsSpendings);
        System.out.printf("Your Parents' Spendings for your saving bonds: $%.2f\n ", parentSpendings);

        scanner.close();
    }
}