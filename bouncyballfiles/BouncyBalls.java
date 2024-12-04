import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class BouncyBalls extends JPanel implements Runnable, MouseListener
{
	//The width and height of the window
	private int width, height;
	// private Ball ball;
	private Thread thread;
	private ArrayList<Ball> ballList = new ArrayList<Ball>();

	public BouncyBalls(int width, int height)
	{
		this.width = width;
		this.height = height;
		// ball = new Ball(width, height);
		//Start a thread, calls the run() method
		thread = new Thread(this);
		thread.start();
		addMouseListener(this);
		setBackground(Color.black);
	}
	@Override
	public void run() 
	{
		//Loops until the thread is interruped
		//Sleeps for 50 milliseconds and then calls repaint() which calls paintComponent()
		while(true)
    	{
    		try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) { 
    			System.out.println("Thread stopped");
    			thread.interrupt();
    			return;
    		}
    		repaint();
    	}
	}
	@Override
    public void paintComponent(Graphics g) 
    {
		super.paintComponent(g);
		//move the ball and then redraw it
		for (int index = 0; index < ballList.size(); index++) {
			Ball b = ballList.get(index);
			if (b.getNumberOfBounces() > 3) {
				ballList.remove(b);
			}
			b.move();
			b.draw(g);
		}
		//smooths drawing on linux
        Toolkit.getDefaultToolkit().sync();
    }
	//This method is called every time you click a mouse button on the JPanel.
	@Override
	public void mouseClicked(MouseEvent event) 
	{
		int xpos = event.getX();
		int ypos = event.getY();
		//left click is button 1
		if(event.getButton() == 1)
		{
			System.out.printf("Left Click @ (%d, %d)\n", xpos, ypos);
			Ball myBall = new Ball(width, height, xpos, ypos, 0.0, true);
			ballList.add(myBall);

		}
		//right click is button 2
		else if(event.getButton() == 3)
		{
			Random rand = new Random();
			System.out.printf("Right Click @ (%d, %d)\n", xpos, ypos);
			int random = rand.ints(-40, 40).findFirst().getAsInt();
			System.out.println(random);
			Ball myBall = new Ball(width, height, xpos, ypos, random, false);
			ballList.add(myBall);
			// Ball randomBall = new Ball();
		}
	}
	@Override
	public void mouseEntered(MouseEvent event) {}
	@Override
	public void mouseExited(MouseEvent event) {}
	@Override
	public void mousePressed(MouseEvent event) {}
	@Override
	public void mouseReleased(MouseEvent event) {}
}
