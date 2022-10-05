/*
 * Author: Marko Castillo
 * Overview: Tosses two coins 1,000 times. Counts the amount of times both coins land with the same face. For example, heads and heads or tail and tail.
 * Printed Result:
 * Number of heads: 252
 * Number of tails: 251
 * 
 */

import java.util.Random;

public class TwoCoinTossCounter {
	public static void main(String[] args) {
		int numberOfHeads = 0;
		int numberOfTails = 0;

		Random rnd = new Random();

		for (int i = 0; i < 1000; i++) {
			int coin = rnd.nextInt(2);
			int coin2 = rnd.nextInt(2);

			if (coin == 0 && coin2 == 0)
				numberOfHeads++;
			if (coin == 1 && coin2 == 1)
				numberOfTails++;
		}
		System.out.println("Number of heads: " + numberOfHeads);
		System.out.println("Number of tails: " + numberOfTails);
	}
}
