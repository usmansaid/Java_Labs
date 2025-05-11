import java.util.Scanner;
public class Lab3_GradedTask4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in minutes after 12:00AM: ");
        int totalMinutes = scanner.nextInt();

        int hours = (totalMinutes / 60) % 24;
        int minutes = totalMinutes % 60;

        System.out.println(hours + ":" + minutes);

        
        scanner.close();
    }
}
