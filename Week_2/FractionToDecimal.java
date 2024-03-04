import java.util.Scanner;

public class FractionToDecimal {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the numerator of the fraction
        System.out.print("Enter the numerator of the fraction: ");
        int numerator = scanner.nextInt();

        // Prompt the user to enter the denominator of the fraction
        System.out.print("Enter the denominator of the fraction: ");
        int denominator = scanner.nextInt();

        // Calculate the decimal equivalent of the fraction
        float decimalEquivalent =  (float) numerator / denominator;

        // Display the decimal equivalent of the fraction
        System.out.println("Decimal equivalent of the fraction: " + decimalEquivalent);

    }
}
