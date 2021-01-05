import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JApplet;


public class ship extends JApplet implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the applet.
	 */
	public ship() 
	{

	}

	private Thread th;
	private Player player;
	private Shot [] shots;

	// speed constants
	private final int shotSpeed = -2;
	private final int playerLeftSpeed = -2;
	private final int playerRightSpeed = 2;

	// move flags
	private boolean playerMoveLeft;
	private boolean playerMoveRight;

	// double buffering
	private Image dbImage;
	private Graphics dbg;

	public void init()
	{
		setBackground (Color.black);
		player = new Player(150, 280);
		shots = new Shot[5];
	}

	public void start ()
	{
		th = new Thread(this);
		th.start ();
	}

	public void stop()
	{
		th.stop();
	}

	public void destroy()
	{
		th.stop();
	}

	public void run()
	{
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		while (true)
		{
			// do operations on shots in shots array
			for(int i=0; i<shots.length; i++)
			{
				if(shots[i] != null)
				{
					// move shot
					shots[i].moveShot(shotSpeed);

					// test if shot is out
					if(shots[i].getYPos() < 0)
					{
						// remove shot from array
						shots[i] = null;
					}

					// other operations
					// ...
					// test for collisions with enemies
					// ...
				}
			}


			// move player
			if(playerMoveLeft)
			{
				player.moveX(playerLeftSpeed);
			}
			else if(playerMoveRight)
			{
				player.moveX(playerRightSpeed);
			}

			// repaint applet
			repaint();

			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException ex)
			{
				// do nothing
			}

			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}

	public boolean keyDown(Event e, int key)
	{
		if(key == Event.LEFT)
		{
			playerMoveLeft = true;
		}
		else if(key == Event.RIGHT)
		{
			playerMoveRight = true;
		}
		else if(key == 32)
		{
			// generate new shot and add it to shots array
			for(int i=0; i<shots.length; i++)
			{
				if(shots[i] == null)
				{
					shots[i] = player.generateShot();
					break;
				}
			}
		}

		return true;
	}

	public boolean keyUp(Event e, int key)
	{
		if(key == Event.LEFT)
		{
			playerMoveLeft = false;
		}
		else if(key == Event.RIGHT)
		{
			playerMoveRight = false;
		}

		return true;
	}


	public void update (Graphics g)
	{
		if (dbImage == null)
		{
			dbImage = createImage (this.getSize().width, this.getSize().height);
			dbg = dbImage.getGraphics ();
		}

		dbg.setColor (getBackground ());
		dbg.fillRect (0, 0, this.getSize().width, this.getSize().height);

		dbg.setColor (getForeground());
		paint (dbg);

		g.drawImage (dbImage, 0, 0, this);
	}

	public void paint (Graphics g)
	{
		// draw player
		player.drawPlayer(g);

		// draw shots
		for(int i=0; i<shots.length; i++)
		{
			if(shots[i] != null)
			{
				shots[i].drawShot(g);
			}
		}
	}

}
