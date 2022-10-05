
/*
 * Author: Marko Castillo
 *  Overview: Calculates volume of a sphere formatting it with DecimalFormat
 *   - Calculate volume of a sphere based on user input
 *   - Prints out the result of the volume
 *   
 *   Printed Results:
 *   Enter a radius: 12
 *   The volume is: 7238.23 units cubed
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class VolumeOfSphere {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // Create a Scanner object

		System.out.print("Enter a radius: ");
		double radius = console.nextInt(); // Receive radius input

		double volume = Math.PI * radius * radius * radius * 4.0 / 3; // Calculate sphere volume

		DecimalFormat decimalFormat = new DecimalFormat("00.00"); // Create DecimalFormat Object to hold format value
		String output = decimalFormat.format(volume); // Set string to the formatted volume with volume as parameter

		System.out.println("The volume is: " + output + " units cubed");

	}
}