import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable initialization
        int weekDay;

        // User Input and initialization
        System.out.print("Enter a number from 1 to 7(week starts from monday): ");
        weekDay = scanner.nextInt();

        // By Switch statement
        switch (weekDay) {
            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;

            case 6:
                System.out.println("Today is Saturday");
                break;

            case 7:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Invalid Entry!");
                break;
        }

        scanner.close();
    }
}
