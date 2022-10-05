/*
 * Author: Marko Castillo
 * Overview: Game Of Nim with marbles
 * Rules:
 * Number of mables is randomly generated
 * Player that picks the last marble loses.
 * Players can't take more than half the pile.
 * 
 * Printed Result:
 * Welcome to a game of NIM! 
Player that picks the last marble loses. 
Players can't take more than half the pile.
Flipping a coin to see who goes first..

Tails! Computer goes first!

There are 19 marble(s) left.
The computer takes 4 marble(s).
There are 15 marble(s) left.
How many marbles do you want to take? 7
There are 8 marble(s) left.
The computer takes 1 marble(s).
There are 7 marble(s) left.
How many marbles do you want to take? 4
Pick a valid number!

There are 7 marble(s) left.
How many marbles do you want to take? 3
There are 4 marble(s) left.
The computer takes 1 marble(s).
There are 3 marble(s) left.
How many marbles do you want to take? 1
There are 2 marble(s) left.
The computer takes 1 marble(s).
There are 1 marble(s) left.
How many marbles do you want to take? 1
You lose.
 */

//determine initial pile size
//determine who goes first
//flip a coin
//if heads => human, else computer goes first
// set turn = appropriate player

//while (numbeOfMarbhles > 0)
// Display number of marbles left in pile

// if (turn == human )
// ask human how many marbles he wants
// ensure human isn't cheating!!
//Subtract marbles from pile
// set turn - computer
// else
// computer's turn
// computer needs to determine "pick-size"
// try to  leave 2^n-1 marbles in pile after picking
// see web site notes on how to proceed..
// if not possible, pick a random # of marbles <= 1/2 pile size
// set turn = human 
// determine winner;

import java.util.Scanner;
import java.util.Random;

public class GameOfNim {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner console = new Scanner(System.in);

		int pileSize = rnd.nextInt(101);
		int coin = rnd.nextInt(2);
		int turn = coin;
		int pick = 0;
		boolean gameOver = false;

		System.out.println("Welcome to a game of NIM! " + "\nPlayer that picks the last marble loses. "
				+ "\nPlayers can't take more than half the pile." + "\nFlipping a coin to see who goes first..\n");

		if (coin == 0) {
			System.out.println("Heads! Player goes first!");
			System.out.println("");
		} else {
			System.out.println("Tails! Computer goes first!");
			System.out.println("");
		}

		while (pileSize > 0 && !gameOver) {
			System.out.println("There are " + pileSize + " marble(s) left.");

			if (turn == 0) {

				System.out.print("How many marbles do you want to take? ");
				int playerPick = console.nextInt();

				if (pileSize == 1) {
					System.out.println("You lose.");
					break;
				}

				else if (playerPick <= 0 || playerPick > (pileSize / 2)) {
					System.out.println("Pick a valid number!");
					System.out.println("");
				}

				else {
					pileSize -= playerPick;
					turn = 1;
				}

			}

			else {

				int n = (int) (Math.log(pileSize + 1) / Math.log(2));

				int potentialPick = pileSize - (int) (Math.pow(2, n) - 1);

				Random gen = new Random();

				if (potentialPick <= pileSize / 2 && potentialPick > 0)
					pick = pileSize - (int) (Math.pow(2, n) - 1);
				else if (pileSize > 1)
					pick = gen.nextInt(pileSize / 2) + 1; // can't leave 2^n - 1, so pick a random value
				else {
					pick = 1;
					System.out.println("You win.");
					gameOver = true;
				}

				pileSize -= pick;
				System.out.println("The computer takes " + pick + " marble(s).");
				turn = 0;

			}
		}
	}

}
