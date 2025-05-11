public class Lab3_Activity2 {
    
        public static void main(String[] args){

        // Declaration        
        double regularWages; 
        double overtimeWages; 
        double totalWages; 
        
        // Initialization
        double basePay = 25; 
        double regularHours = 40;
        double overtimePay = 37.5; 
        double overtimeHours = 10;

        // Calculation
        regularWages = basePay * regularHours;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;

        // Output
        System.out.println("Wages for this week are $" + totalWages);

}
}
