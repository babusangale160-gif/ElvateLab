package babu;
import java.util.Scanner;
public class ModularCalculator {
    // Method for addition (int)
    static int add(int a, int b) {
        return a + b;
    }

    // Method overloading: addition (double)
    static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division with exception handling
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }

    // Method to show pass-by-value
    static void changeValue(int x) {
        x = 100; // change only local copy
        System.out.println("Inside method x = " + x);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n---- CALCULATOR MENU ----");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you! Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + add(a, b));
                    break;

                case 2:
                    System.out.println("Result = " + subtract(a, b));
                    break;

                case 3:
                    System.out.println("Result = " + multiply(a, b));
                    break;

                case 4:
                    System.out.println("Result = " + divide(a, b));
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        // Pass-by-value demonstration
        int num = 10;
        changeValue(num);
        System.out.println("Outside method num = " + num);

        sc.close();
    }
}


