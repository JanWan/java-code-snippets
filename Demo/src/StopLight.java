import java.awt.*;
import javax.swing.*;

public class StopLight extends JApplet
{
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		//setBackground(Color.cyan);
		g.setColor(Color.gray);
		g.fillOval(60, 25, 60, 60);
		g.fillOval(60, 90, 60, 60);
		g.fillOval(60, 155, 60, 60);
		
		g.setColor(Color.gray);
		g.drawRect(50, 20, 80, 200);
		g.setColor(Color.red);
		repaint();
	}
}
