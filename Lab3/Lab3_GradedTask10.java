public class Lab3_GradedTask10 {
    public static void main(String[] args) {

        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        System.out.printf("%-15d%-15.4f%-15.4f%-15.4f%-15.4f%n", degrees, radians, sin, cos, tan);

        degrees = 60;
        radians = Math.toRadians(degrees);
        sin = Math.sin(radians);
        cos = Math.cos(radians);
        tan = Math.tan(radians);

        System.out.printf("%-15d%-15.4f%-15.4f%-15.4f%-15.4f%n", degrees, radians, sin, cos, tan);
    }
}
