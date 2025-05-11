import java.util.Scanner;
public class Lab3_GradedTask3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students in class A: ");
        int classA_Students = scanner.nextInt();

        System.out.print("Enter number of students in class B: ");
        int classB_Students = scanner.nextInt();

        System.out.print("Enter number of students in class C: ");
        int classC_Students = scanner.nextInt();

        int seatsA = (classA_Students + 1) / 2;
        int seatsB = (classB_Students + 1) / 2;
        int seatsC = (classC_Students + 1) / 2;

        System.out.println("Minimum number of seats required are: " + (seatsA + seatsB + seatsC));

        scanner.close();

    }
}