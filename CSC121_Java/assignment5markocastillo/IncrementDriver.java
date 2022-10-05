package assignment5markocastillo;

public class IncrementDriver {
	
	public static void main (String[] args)
	{
		Increment useCounter = new Increment();
		
		
		useCounter.increment();
		useCounter.increment();
		useCounter.toString();
		
		useCounter.increment(3);
		useCounter.toString();
		
		useCounter.decrement(2);
		useCounter.toString();
		
		useCounter.decrement();
		useCounter.toString();
		
		useCounter.reset();
		useCounter.toString();
		
		
		
	}

}
