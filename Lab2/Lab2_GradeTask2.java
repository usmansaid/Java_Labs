import java.util.Scanner;
public class Lab2_GradeTask2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width; 
        System.out.print("Enter the Width: "); 
        width = scanner.nextInt(); 

        int length; 
        System.out.print("Enter the length: "); 
        length = scanner.nextInt(); 

        int area = length * width;

        int perimeter = 2 * (length + width);

        System.out.println("Area of rectangle is: " + area);
        System.out.println("Perimeter of rectangle is: " + perimeter);

        scanner.close();
       

    }
}

