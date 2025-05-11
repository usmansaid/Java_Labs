import java.util.Scanner;

public class Lab3_GradedTask2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int students = scanner.nextInt();

        System.out.print("Enter the number of Apples: ");
        int apples = scanner.nextInt();

        int studentsGetApples = apples / students;
        System.out.println("Number of Apples every student should get: " + studentsGetApples);

        int remainingApples = apples % students;
        System.out.println("Apples remained in Bsket: " + remainingApples);

        scanner.close();
    }
}
