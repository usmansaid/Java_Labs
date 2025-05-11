import java.util.Scanner;

public class Lab3_GradedTask5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cartonCapacity = 3.78;
        double oneLitreMilkCost = 0.38;
        double oneCartonProfit = 0.27;

        System.out.print("Enter Total number of milk produced: ");
        double totalMilk = scanner.nextDouble();

        int cartons = (int)Math.ceil(totalMilk / cartonCapacity);
        System.out.println("Number of cartons required: " + cartons);

        double totalMilkCost = totalMilk * oneLitreMilkCost;
        System.out.printf("Total cost of milk produced is: $ %.2f\n", totalMilkCost);

        double profitPerLitre = oneCartonProfit / cartonCapacity; // Calculates profit of one litre.
        //We will not count profit for total cartons b/c if a carton contain 1litre of milk, then profit would exceed
        double totalProfit = profitPerLitre * totalMilk;
        System.out.printf("Total Profit in total litres of Milk: $ %.2f\n", totalProfit);

        scanner.close();
    }
}