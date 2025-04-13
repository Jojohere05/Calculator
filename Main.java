/*
Name: Jhotika Raja
PRN: 23070126050
Batch: A2
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Display calculator operation menu
            System.out.println("Welcome to Java Calculator");
            System.out.println("Choose Operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square\n6. Cube\n7. Square Root");

            int choice = sc.nextInt();

            // Validate choice
            while (choice < 1 || choice > 7) {
                System.out.println("Invalid choice. Please enter a number between 1 and 7:");
                choice = sc.nextInt();
            }

            // Read first number
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            double num2;

            // Switch block for each operation
            switch (choice) {
                case 1:
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + Addition.add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + Subtraction.subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + Multiplication.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + Division.divide(num1, num2));
                    break;
                case 5:
                    System.out.println("Square: " + Square.square(num1));
                    break;
                case 6:
                    System.out.println("Cube: " + Cube.cube(num1));
                    break;
                case 7:
                    System.out.println("Square Root: " + Squareroot.squareRoot(num1));
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter numeric values only.");
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner to release resources
        }
    }
}
