
/*
 * Author: Marko Castillo
 *  Overview: Calculates the are of square
 *   - Calculate volume of a sphere based on user input
 *   - Prints out the result of the volume
 *   
 *   Printed Results:
 *   Enter width: 15
	Enter length: 23
	The area is: 345 square feet

 */
import java.util.Scanner;

public class SquareFootage {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // for input

		System.out.print("Enter width: "); // asks the user
		int width = console.nextInt(); // Enter width input is saved

		System.out.print("Enter length: ");
		int length = console.nextInt(); // Enter length

		int area = length * width;

		System.out.println("The area is: " + area + " square feet");
	}
}