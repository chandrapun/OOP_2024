import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
	
	    System.out.println("To convert miles to kilometers");
	    System.out.println("------------------------------");

        // Prompt the user to enter miles
        System.out.print("Please enter a miles: ");

        // Read miles from the user
        float miles = scanner.nextFloat();

        // Convert miles to kilometers
        double kilometers = miles * 1.60935;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

        // Close the scanner
        scanner.close();
    }
}
