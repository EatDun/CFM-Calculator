import java.util.Scanner;

class Calculator {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static double cfmCalc() {
        System.out.println("Enter Duct Width (in inches):");
        double w = scanner.nextDouble();
        System.out.println("Enter Duct Height (in inches):");
        double h = scanner.nextDouble();
        System.out.println("Enter Air Speed (in feet per minute):");
        double as = scanner.nextDouble();
        return ((w * h) / 144) * as;
    }
    
    public static double airSpeedCalc() {
        System.out.println("Enter Duct Width (in inches):");
        double w = scanner.nextDouble();
        System.out.println("Enter Duct Height (in inches):");
        double h = scanner.nextDouble();
        System.out.println("Enter CFM:");
        double cfm = scanner.nextDouble();
        return cfm / ((w * h) / 144);
    }
    
    public static double ductSizeCalc() {
        System.out.println("Enter Air Speed (in feet per minute):");
        double as = scanner.nextDouble();
        System.out.println("Enter CFM:");
        double cfm = scanner.nextDouble();
        return cfm / as;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Press 1 for CFM\nPress 2 for Air Speed\nPress 3 for Duct Size");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                double answer1 = cfmCalc();
                System.out.println("The CFM is: " + answer1);
                break;
            case 2:
                double answer2 = airSpeedCalc();
                System.out.println("The Air Speed is: " + answer2 + " feet per minute");
                break;
            case 3:
                double answer3 = ductSizeCalc();
                System.out.println("The duct cubic feet is: " + answer3);
                break;
            default:
                System.out.println("Invalid choice.");    
        }
    }    
}
