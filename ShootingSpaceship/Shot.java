import java.awt.Graphics;
import java.awt.Color;

public class Shot
{
	private int x_pos;
	private int y_pos;

	private final int radius = 3;

	public Shot(int x, int y)
	{
		x_pos = x;
		y_pos = y;
	}

	public int getYPos()
	{
		return y_pos;
	}

	public void moveShot(int speed)
	{
		y_pos += speed;
	}

	public void drawShot(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(x_pos, y_pos, radius, radius);
	}
}