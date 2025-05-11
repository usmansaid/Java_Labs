import java.util.Scanner;
public class Lab3_GradedTask7 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int classACost = 20;
    final int classBCost = 15;
    final int classCCost = 10;
    final int classDCost = 5;


    System.out.print("Enter Tickets sold for Class A: ");
    int soldTicketsA = scanner.nextInt();

    System.out.print("Enter Tickets sold for Class B: ");
    int soldTicketsB = scanner.nextInt();

    System.out.print("Enter Tickets sold for Class C: ");
    int soldTicketsC = scanner.nextInt();

    System.out.print("Enter Tickets sold for Class D: ");
    int soldTicketsD = scanner.nextInt();


    int classAProfit = soldTicketsA * classACost;
    int classBProfit = soldTicketsB * classBCost;
    int classCProfit = soldTicketsC * classCCost;
    int classDProfit = soldTicketsD * classDCost;

    int totalProfit = classAProfit + classBProfit + classCProfit + classDProfit;

    System.out.println("Your total Profit is: $" + totalProfit);

    scanner.close();


   } 
}
