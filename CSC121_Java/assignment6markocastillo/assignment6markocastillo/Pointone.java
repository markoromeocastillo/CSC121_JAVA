package assignment6markocastillo;

public class Pointone
{
	public Pointone() {  //default constructor
		x = 0;
		y = 0;
	}
	
	public Pointone(int x0, int y0) {  // non default constructor
		x = x0;
		y = y0; 
		
	}
	
	public void moveTo(int newX, int newY) {
		x = newY;
		y = newY;
	}
	
	public void print() {
		System.out.println("("+x+ ", " + y+")");
		
	}
	
	public String toString()
	{
		return ("(" + x + "," + y +")");
	}

int x;
int y;
}