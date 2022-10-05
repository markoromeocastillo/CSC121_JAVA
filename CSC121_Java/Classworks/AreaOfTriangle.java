/*
 *  Author: Marko Castillo
 *  Overview: Calculates area of triangle
 *   - Calculate Area of a triangle based on user input
 *   - Prints out the result of the area
 *   
 *   Results:
 *   Enter base: 12
	Enter height: 12
	The area of the triangle is: 72.0
 *   
 *   
 */

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // for input

		System.out.print("Enter base: "); // asks the user
		double base = console.nextInt(); // Enter base input is saved

		System.out.print("Enter height: ");
		double height = console.nextInt(); // Enter height

		double area = .5 * base * height; // Formula calculate area of triangle

		System.out.println("The area of the triangle is: " + area);
	}
}