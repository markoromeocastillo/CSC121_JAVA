

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.util.Random;

class Shapesone extends JComponent
{
	public Shapesone()
	{
	}
	public void paintComponent(Graphics g)
	{
	Graphics2D gc = (Graphics2D)g;
	Rectangle square = new Rectangle(0,0, 700, 700);
	gc.draw(square);
	Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 700, 700);
	gc.draw(circle);
	Random rnd = new Random();
		
	Pointone[] pts  = new Pointone[10000];
		
	for (int i = 0; i < pts.length; i++)
		{
		pts[i] = new Pointone(rnd.nextInt(700),rnd.nextInt(700));	
		}

	for (int i = 0; i < pts.length; i++)
		{
			// System.out.println(pts[i]);
		Rectangle box = new Rectangle(pts[i].x, pts[i].y, 1,1);
		gc.draw(box);
		}	
 
 }
 static final int HEIGHT = 10;
 static final int WIDTH = 10;
 static final int TOP_LEFT_X = 100;
 static final int TOP_LEFT_Y = 100;
}