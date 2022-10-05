package assignment4markocastillo;

import java.util.Random;
// Counts the number of streaks for heads out of 100,000 rolls
public class ArrayCoinCounterHomework {
	
	public static void main(String[] args) {
		
		int[] coinValues = new int[100000];
		coinTosser(coinValues);
		
		int[] coinList = coinLister(coinValues);		
		
		//prints results starting from 1, but doesn't print any value < 0
		for (int i = 1; i<25 ; i++)
		{
			if (coinList[i]>0)
			System.out.println(i +": " + coinList[i]);
		}
		
	}
	// fills the coinValues array
	public static void coinTosser(int[] coinTosses) {
		Random rnd = new Random();
		
		for (int i = 0; i < coinTosses.length; i++) 
		coinTosses[i] = rnd.nextInt(2);
		
		
	}
	//fills the streak counter array and returns an array.
	public static int[] coinLister(int[] updatedCoins){
		int A[] = new int[25];
		int counter = 0;
		int streak = 0;
		for(int i = 0; i<updatedCoins.length;i++)
		{
			if (updatedCoins[i] == HEADS)
				counter++;
			else
			{
				A[counter]++;
				if (counter > streak)
				{
					streak = counter;
				}
				counter = 0;
			}
			if(counter>streak)
				streak = counter;
		}
		return A;
		
		
	
	}

	
	private static final int HEADS = 1;

}

