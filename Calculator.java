import java.util.Scanner;

public class Calculator {

    int n1;
    int n2;

    // Method for addition
    void add() {
        System.out.println("Sum: " + (n1 + n2));
    }

    // Method for subtraction
    void subtract() {
        System.out.println("Difference: " + (n1 - n2));
    }

    // Method for multiplication
    void multiply() {
        System.out.println("Product: " + (n1 * n2));
    }

    // Method for division (handles division by zero)
    void divide() {
        if (n2 == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Quotient: " + ((double) n1 / n2));
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Get input from user
        System.out.print("Enter first number: ");
        calc.n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        calc.n2 = scanner.nextInt();

        // Ask user to choose an operation
        System.out.println("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            calc.add();
        } else if (operator == '-') {
            calc.subtract();
        } else if (operator == '*') {
            calc.multiply();
        } else if (operator == '/') {
            calc.divide();
        } else {
            System.out.println("Invalid operator");
        }

        scanner.close(); // Close the scanner to avoid memory leaks
    }
}
