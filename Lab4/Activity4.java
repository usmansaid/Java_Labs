import java.util.Scanner;

public class Activity4{
public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);
    
    // Variable Declaration
    int score;

    // User input and initialization
    System.out.print("Enter your score: ");
    score = scanner.nextInt();

    // By Conditionals
    if (score >= 90){
    System.out.println("Your grade is A");
    }
    else if (score >= 80){
    System.out.println("Your grade is B");
    }
    else if (score >= 70){
    System.out.println("Your grade is C");
    }
    else if (score >= 60){
    System.out.println("Your grade is D");
    }
    else{
    System.out.println("Your grade is F");
    }

    scanner.close();


}
}
