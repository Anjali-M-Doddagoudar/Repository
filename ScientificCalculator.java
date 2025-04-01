import java.util.Scanner;

public class ScientificCalculator extends Calculator {

    // Method for square
    void square() {
        System.out.println("Square of " + n1 + ": " + (n1 * n1));
    }

    // Method for cube
    void cube() {
        System.out.println("Cube of " + n1 + ": " + (n1 * n1 * n1));
    }

    // Method for power
    void power() {
        System.out.println(n1 + " raised to the power " + n2 + ": " + Math.pow(n1, n2));
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        // Get input from user
        System.out.print("Enter first number: ");
        calc.n1 = scanner.nextInt();

        System.out.print("Enter second number (for power, press 0 if not needed): ");
        calc.n2 = scanner.nextInt();

        // Ask user to choose an operation
        System.out.println("Choose an operation: s (square), c (cube), p (power)");
        char operator = scanner.next().charAt(0);

        if (operator == 's') {
            calc.square();
        } else if (operator == 'c') {
            calc.cube();
        } else if (operator == 'p') {
            if (calc.n2 == 0) {
                System.out.println("Invalid input for power. Please enter a non-zero value.");
            } else {
                calc.power();
            }
        } else {
            System.out.println("Invalid operator");
        }

        scanner.close(); // Close the scanner
    }
}
