import java.util.Scanner;

public class Lab2_GradeTask3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int SECRET = 11;
        double RATE = 12.50;

        int num1;
        int num2;
        int newNum;
        String name;
        double hoursWorked;
        double wages;

        System.out.print("Enter first number: ");
        num1 = console.nextInt();
        System.out.println("num1 = " + num1);

        System.out.print("Enter second number:");
        num2 = console.nextInt();
        System.out.println("num2 = " + num2);

        newNum = (num1 * 2) + num2;
        System.out.println("newNum = " + newNum);

        newNum += SECRET;
        System.out.println("newNum after adding SECRET: " + newNum);

        System.out.print("Enter person last name: ");
        name = console.next();

        System.out.print("Enter a decimal number between 0 and 70: ");
        hoursWorked = console.nextDouble();

        wages = RATE * hoursWorked;

        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);

        console.close();

        

    }
}


   