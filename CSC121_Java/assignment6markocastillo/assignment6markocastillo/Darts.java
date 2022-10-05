package assignment6markocastillo;

// simpleShapes.java: Display simple shapes and text on aJPanel
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.util.Random;
public class Darts 
{
	public static void main(String[] args) 
	{
	JFrame frame = new JFrame("Simple Shapes");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(730, 750);
	Shapesone component = new Shapesone();
	frame.add(component);
	frame.setVisible(true);
	Random rnd = new Random();
 
	int hits = 0;
	// Throws darts Attempts times. Calculates if hit by distance formula
	// center of circle is 350,350 so subtract that in formula
	// radius is 350
	// if distance <= radius
	for (int i = 0; i < ATTEMPTS; i++)
		{
		int x = rnd.nextInt(700);
		int y = rnd.nextInt(700);		
		double distance = Math.sqrt(((x-350)*(x-350)) + ((y-350)*(y-350)));		
		if (distance <= 350.00)
			hits++;
		}
		
	System.out.println("Throws: " + ATTEMPTS + "; Hits: " + hits +
						"; Ratio: " + (4*(double)hits/(double)ATTEMPTS));
	}
	private static final int ATTEMPTS = 10000;
}
