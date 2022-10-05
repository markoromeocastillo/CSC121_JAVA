
/*
 * Author: Marko Castillo
 * Overview: Calculates Area of Circle
 * Printed Result:
 * Enter a radius: 13
 * The area of the circle is 530.929158456675 units square
 */
import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Enter a radius: ");
		int radius = console.nextInt();

		if (radius <= 0) {
			System.out.println("Enter a radius over 0");
		} else {
			double area = Math.PI * radius * radius;
			System.out.println("The area of the circle is " + area + " units square");
		}
	}
}