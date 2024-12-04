import java.awt.Color;
import java.awt.Graphics;

public class Ball 
{
	//The width and height of the screen
	private int width, height;
	//The (x, y) position of the upper left corner of a square containing the ball
	private int x, y;
	//The diameter of the ball
	private int d;
	//Gravity
	private double g;
	//Time interval
	private double dt;
	//The horizontal and vertical velocities of the ball
	private double vx, vy;
	//The current ball color
	private Color color;

	private int numberOfBounces;

	private boolean left;

	public Ball(int width, int height, int xpos, int ypos, double vx, boolean left)
	{
		this.width = width;
		this.height = height;
		this.left = left;
		this.vx = vx;
		this.vy = 0.00;
		d = 40;
		g = 9.8;
		dt = 0.20;
		//initialize the ball in the center of the screen
		// x = (width - d)/ 2;
		// y = (height - d) / 2;
		x = xpos;
		y = ypos;
		color = getRandomColor1();
	}
	//picks a random color from an array of colors
	private Color getRandomColor1()
	{
		Color[] colors = {Color.red, Color.pink, Color.blue, Color.green, Color.magenta, Color.cyan, Color.white, Color.gray};
		return colors[(int)(Math.random() * colors.length)];
	}
	//Generates a random color using randomly chosen red, green and blue values.
	private Color getRandomColor2()
	{
		return new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
	}
	//Essentially the same as getRandomColor2() but using a single hexadecimal value.
	private Color getRandomColor3()
	{
		return new Color((int)(Math.random() * 0x1000000));
	}
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(x, y, d, d);
	}
	public void move()
	{
		System.out.println("x ---" + y + "---" + width + "vy" + vy);
		if (this.left) 
		{
			vy += g * dt;
			//change the y position based on vertical velocity (y = vt)
			y += vy * dt;
			//bounce if it hits the floor
			if(y + d > height)
			{
				numberOfBounces++;
				vy = -vy;
			}
		}
		else 
		{
			x += vx;
			//bounce if it hits the wall
			if(x >= width || x <= 0)
			{
				numberOfBounces++;
				vx = -1 * vx;
			}
		}
		
	}

	public int getNumberOfBounces() {
		return this.numberOfBounces;
	}
}
