package assignment5markocastillo;

public class Increment {
	
	public Increment()
	{
		mycounter = 0;
	}
	
	
	public int increment()
	{
		mycounter++;
		return mycounter;
	}
	
	public int increment(int value)
	{
		if(value > 1)
		{
		this.mycounter += value;
		}
		else
		System.out.println("Enter a value greater than 1");
		
		return mycounter;
	}
	
	public int decrement()
	{
		mycounter--;
		return mycounter;
	}
	
	public int decrement(int value)
	{
		if(value > 1)
		mycounter -= value;
		else
		System.out.println("Enter a value greater than 1");
		
		return mycounter;
		
	}
	
	public void reset()
	{
		mycounter = 0;
	}
	
	public String toString()
	{
		return mycounter + "hi";
	}
	
private int mycounter = 0;	
}
