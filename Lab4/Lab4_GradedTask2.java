public class Lab4_GradedTask2 {
    public static void main(String[] args) {
        
        // Variable Declaration
        int x;
        int y;
        int z;
        int w;

        // Initialization
        x = 3;
        y = 4;
        z = 7;
        w = 1;

        // Output and Processing
        System.out.println("x == y: " + (x == y )); // False
        System.out.println("x != z: " + (x != z )); // True
        System.out.println("y == z - 3: " + (y == z - 3) ); // True
        System.out.println("!(z > w): " + ! (z > w)); // False
        System.out.println("x + y < z: " + (x + y < z)); // False

    }
}
