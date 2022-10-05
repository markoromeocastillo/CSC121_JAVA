
/*
 * Author: Marko Castillo
 * OverView: Populates an array with a method that randomly generates values. It then calculates the sum and average of the array
 * Printed Result: 
 * Array: [69, 40, 48, 82, 65, 60, 75, 99, 77, 85, 64, 46, 95, 46, 72, 86, 68, 89, 10, 79, 33]
 * The sum of all the array is: 1388
 * The average of the given array is: 66.0952380952381
 */
import java.util.Random;

public class ArrayAddition {
	public static void main(String[] args) {
		int[] values = new int[21];

		printArray(values);

		sum(values);

		average(values);

	}

	public static int sum(int[] sumArray) {
		int totalSum = 0;
		for (int i = 0; i < sumArray.length; i++)
			totalSum += sumArray[i];
		System.out.print("\nThe sum of all the array is: " + totalSum);
		return totalSum;

	}

	public static double average(int[] averageArray) {
		int total = 0;

		for (int i = 0; i < averageArray.length; i++)
			total = total + averageArray[i];
		double average = total / ((double) averageArray.length);
		System.out.print("\nThe average of the given array is: " + average);
		return average;
	}

	public static int rValue(int highestValue) {
		Random rnd = new Random();
		int temp = rnd.nextInt(highestValue);

		return temp;
	}

	public static void printArray(int[] myArray) {

		System.out.print("Array: [");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rValue(101);
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(myArray[i]);
		}
		System.out.print("]");
	}
}