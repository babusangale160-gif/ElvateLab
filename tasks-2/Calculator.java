package babu;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("***CALCULATOR MENU***\n");
		while (true) {
			System.out.println("Press 1: Addition");
			System.out.println("Press 2: Subtracition");
			System.out.println("Press 3: Multiplication");
			System.out.println("Press 4: Divison");
			System.out.println("Press 5: Exit\n");

			System.out.print("Enter Your Choice :- ");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("Thank you!Exiting..");
				break;
			}
			System.out.print("Enter first number : ");
			int num1 = sc.nextInt();

			System.out.print("Enter second number : ");
			int num2 = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\nAddition is = " + (num1 + num2) + "\n");
				break;
			case 2:
				System.out.println("\n subtraction is = " + (num1 - num2) + "\n");
				break;
			case 3:
				System.out.println("\n Multiplication is =" + (num1 * num2) + "\n");
				break;
			case 4:
				 if (num2 != 0) {
				System.out.println("\n divison is = " + (num1 / num2) + "\n");
				 }else {
					System.out.println("\n cannot devide by zero\n"); }
				 break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}
