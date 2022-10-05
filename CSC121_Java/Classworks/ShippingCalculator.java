/*
 *  Author: Marko Castillo
 *  Overview: Calculates shipping cost based on item weight
 *  Parameters:
 *  	If weight is between .1 to .9 lbs,  cost is $2.50
 *  	If weight greater than or equal to 1 - 4.9 lbs, cost is $10.00
 *  	If weight is between 5 to 10 lbs then cost is $15.00
 *  	If weight is greater than 10 lbs then cost is $16.00 + $1.50 per pound over 10 lbs.
 *	Printed Result:
 *	What is the name of your item? Refrigerator
 *	What is the weight of your item in lbs? 250.25	
 *	The total cost of shipping Refrigerator is $376.375.
 *
 */

import java.util.Scanner;

public class ShippingCalculator {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("What is the name of your item? ");
		String itemName = console.next();
		System.out.print("What is the weight of your item in lbs? ");
		double itemWeight = console.nextDouble();

		double shippingCost = 0;

		if (itemWeight >= 10) {
			double extraWeight = (itemWeight - 10);
			shippingCost = (16.00 + (extraWeight * 1.50));

		}

		else if (itemWeight >= 5) {
			shippingCost = 15.00;
		}

		else if (itemWeight >= 1) {
			shippingCost = 10.00;
		}

		else if (itemWeight >= .1) {
			shippingCost = 2.500;
		}

		else if (itemWeight < .1) {
			System.out.println("Enter a valid weight!");
			System.exit(0);
		}
		System.out.println("The total cost of shipping " + itemName + " is $" + shippingCost + ".");

	}
}
