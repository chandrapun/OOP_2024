import java.util.Scanner;

public class SquareProperties {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("To find the perimeter and area");
        System.out.println("------------------------------");

        // Prompt the user to enter the length of the square's side
        System.out.print("Enter the length of the square: ");

        // Read the length of the square's side from the user
        int Length = scanner.nextInt();

        // Calculate the perimeter of the square
        int perimeter = 4 * Length;

        // Calculate the area of the square
        int area = Length * Length;

        // Display the perimeter and area of the square
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);
    }
}
