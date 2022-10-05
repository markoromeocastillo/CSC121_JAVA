package assignment4markocastillo;

import java.util.Scanner;
import java.util.Random;
public class ArrayDiceHomework {


		// TODO Auto-generated method stub
		public static void main(String[] args) {
			int pairValue = 0;
			int counter[] = new int[13];// if int[12] last address is 11.
			
			Scanner in = new Scanner(System.in);
			System.out.println("How many times do you want to roll the dice?: ");
			int numberOfRolls = in.nextInt();
			
			
			for (int i = 0; i<numberOfRolls; i++) //roll dice 1000 times
			{
				pairValue = diceRoller();//calls diceRoller method and assigns return value to pairValue
				counter[pairValue]++;// goes to that address and adds 1.
			}
			
			for (int j = 2; j<counter.length;j++) // j = 2 because 2 is minimum value of dice
			{
				System.out.println(j+": "+counter[j]);
			}
			
			int sum = 0;
			for (int b : counter)
			    sum += b;
			
			//int sum = IntStream.of(counter).sum(); // adds all the values of arrays together.
			System.out.println("Number of Rolls = Sum of Counter?: "+ (sum == numberOfRolls)); //checks if number of rolls = sum of counter.
			
		}
		
		public static int diceRoller() {
			Random rnd = new Random();
			int dice1 = rnd.nextInt(6)+1;
			int dice2 = rnd.nextInt(6)+1;
			int diceSum = dice1+dice2;
			return diceSum;
			
		}

	}