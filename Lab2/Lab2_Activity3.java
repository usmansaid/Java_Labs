import java.util.Scanner;

public class Lab2_Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your name, age, location, and rollno with spaces: ");

        String name = scanner.next();
        int age = scanner.nextInt();
        String location = scanner.next();
        int rollno = scanner.nextInt();

        System.out.println("Your Name is : " + name);
        System.out.println("Your Age is : " + age);
        System.out.println("Your Location is : " + location);
        System.out.println("Your RollNo is : " + rollno);

        scanner.close();
        
    }
}
