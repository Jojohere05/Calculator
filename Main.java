/*
Name: Jhotika Raja
PRN: 23070126050
Batch: A2
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu for calculator operations
        System.out.println("Welcome to Java Calculator");
        System.out.println("Choose Operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square\n6. Cube\n7. Square Root");

        int choice = sc.nextInt();
        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            double num2;
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
            catch (Exception e) {
                System.out.println("Error occurred: " + e.getMessage());}
            finally {
                    sc.close();
                }

        }
    }
}