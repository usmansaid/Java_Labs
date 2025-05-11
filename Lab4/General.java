import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter nickles: ");
        int nickles = scanner.nextInt() * 5;

        System.out.print("Enter dimes: ");
        int dimes = scanner.nextInt() * 10;

        System.out.print("Enter quarters: ");
        int quarters = scanner.nextInt() * 25;

        int dollar = pennies + nickles + dimes + quarters;

        if(dollar > 100){
            System.out.println("Greater than 1 dollar! Try again");
        }else if(dollar < 100){
            System.out.println("Less than 1 dollar! try again");
        }else{
            System.out.println("Congratulations! equals to 1 dollar");
        }
        scanner.close();
        

}
}
