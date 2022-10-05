/*
 * Author: Marko Castillo
 * Overview: Converts Fahrenheit to Celcius with an if/else control structure
 * Printed Result:
 * Enter temperature in Fahrenheit: 100
 * 100.0 Fahrenheit is equal to 37.77777777777778 Celcius
 */
import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		double tempF = console.nextDouble();

		if (tempF <= -459.67) {
			System.out.println(tempF + " is not valid temperature in Fahrenheit");
		} else {
			double tempC = (tempF - 32) * (5.0 / 9);
			System.out.println(tempF + " Fahrenheit is equal to " + tempC + " Celcius");
		}

	}
}