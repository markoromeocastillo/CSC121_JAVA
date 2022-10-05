
/*
 * Author: Marko Castillo
 * Overview: Converts Military time to Standard Time
 * Input Parameter Format: #### eg: 2300
 * Printed Result:
 *  Enter military time: 
 *  2300
 *  11:00 PM
 */
import java.util.Scanner;

public class MilitaryTimeConverter {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter military time: ");
		int inputTime = console.nextInt();
		int minutes = inputTime % 100;
		int hours = inputTime / 100;
		int militaryHour = hours - 12;

		if (minutes > 59 || inputTime > 2400 || inputTime < 0) {
			System.out.println("Invalid numbers!");
		} else if (inputTime <= 2400 && inputTime >= 1200) {
			if (militaryHour == 0 && minutes < 10) {
				System.out.println(("12") + ":0" + minutes + " PM");
			} else if (militaryHour == 0) {
				System.out.println(("12") + ":" + minutes + " PM");
			} else if (minutes < 10) {
				System.out.println((hours - 12) + ":0" + minutes + " PM");
			} else
				System.out.println((hours - 12) + ":" + minutes + " PM");
		} else if (inputTime >= 0 && inputTime <= 1159) {
			if (minutes < 10) {
				System.out.println((hours) + ":0" + minutes + " AM");
			} else {
				System.out.println((hours) + ":" + minutes + " AM");
			}
		}
	}
}