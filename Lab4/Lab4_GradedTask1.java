public class Lab4_GradedTask1 {
    public static void main(String[] args) {
        
        // Variable Declaration
        int x;
        int y;
        int z;

        // Initialization (value assigning)
        x = 10;
        y = 15;
        z = 20;

        // Solution
        System.out.println(!(x > 10)); // true because x is not greater than 10, but equals.

        System.out.println(x <= 5 || y < 15); // false because niether x is less than or equal to 5 nor y is less than 15.

        System.out.println((x != 5 ) && (y != z)); // true because is x is not equal to 5 and y is not equal to z also.

        System.out.println(x >= z || (x + y >= z)); // true because x + y is greater than z.
        
        System.out.println((x <= y - 2) && (y >= z) || (z - 2 != 20)); // true because z-2 is not equal to 20
    }
}
