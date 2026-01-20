package babu;

import java.util.Scanner;

public class StudentResultSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double totalMarks = 100;
		
		while (true) {
			System.out.println("*******result Calculating Sys******");
			// Take the user input
			System.out.println("ENTER STUDENT MARKS (0 TO 100 )");
			double marks = sc.nextDouble();

			// validation Check up
			if (marks < 0 || marks >= 100) {
				System.out.println("Invalid marks!... pleased enter the marks in between 0 ro 100");
				continue; // skip this iteration and ask again
			}

//		// here we consider as  already percentage has been calculated 
//		 int per =marks;//assuming percentage is out of 100
				double per = (marks * 100.0) / totalMarks;

				String grade;
				if (per >= 75) {
					grade = "A";
				} else if (per >= 60) {
					grade = "B";
				} else if (per >= 50) {
					grade = "C";
				} else if (per >= 35) {
					grade = "c";
				} else {
					grade = "Fail";
				}
				System.out.println("\n-----Student Result------\n");
				System.out.println("Marks     :" + marks);
				System.out.println("percentage   :" + per + "%");
				System.out.println("Grade  :" + grade);
				System.out.println("\n-------------------\n");
				// now asking for another student
				System.out.println("Do you want to enter another student? (yes/no):");
				String choice = sc.next();

				if (choice.equalsIgnoreCase("NO")) {
					System.out.println("\n Thank you for exiting!---\n");
					break;
				}

			}
			sc.close();

		}
	}
