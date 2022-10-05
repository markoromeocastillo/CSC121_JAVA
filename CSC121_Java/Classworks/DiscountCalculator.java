
/*
 * Author: Marko Castillo
 * Overview: Calculates discount based on customers age and company name
 * Discounts:
 *  10% discount for anyone between 0 and 22 years of age
 *  20% discount for Seniors over 65 years of age
 *  
 *  15% discount for anyone between 0 and 65 years of age that works at ABC, Gillians, McMillian's
 *  25% discount for anyone over 65 years of age that works at ABC, Gillians, McMillian's
 *  
 *  Printed Result:
 *  What is the total price of your item? 100
 *  What is your age? 66
 *  Do you work for ABC, Gillians, McMillian's? yes
 *  You received a 25% discount! Your total price is: $75.0.
 *  
 */
import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("What is the total price of your item? ");
		double salePrice = console.nextDouble();

		if (salePrice <= 0) {
			System.out.print("You need to buy something first!");
			System.exit(0);
		}

		System.out.print("What is your age? ");
		int age = console.nextInt();
		String temp = console.nextLine();

		if (age <= 0) {
			System.out.print("You shouldn't exist!");
			System.exit(0);
		}

		System.out.print("Do you work for ABC, Gillians, McMillian's? ");
		String companyName = console.nextLine();

		if (companyName.equals("ABC") || companyName.equals("Gillians") || companyName.equals("McMillian's")
				|| companyName.equals("abc") || companyName.equals("gillians") || companyName.equals("mcmillian's")
				|| companyName.equals("mcmillians") || companyName.equals("yes")) {
			if (age > 65) {
				System.out.print(
						"You received a 25% discount! Your total price is: $" + (salePrice - (salePrice * .25)) + ".");
			} else if (age > 0 && age <= 65) {
				System.out.print(
						"You received a 15% discount! Your total price is: $" + (salePrice - (salePrice * .15)) + ".");
			}
		}

		else {

			if (age > 0 && age < 22) {
				double discount = .1;
				System.out.print(
						"You received a 10% discount! Your total price is: $" + (salePrice - (salePrice * .1)) + ".");
			} else if (age > 65)

				System.out.print(
						"You received a 20% discount! Your total price is: $" + (salePrice - (salePrice * .2)) + ".");

			else
				System.out.print("No available discounts, your total price is still: $" + salePrice);
		}

	}
}
