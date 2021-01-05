package Business;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class janBusinessCard extends JApplet 
{
	public void paint(Graphics card)
	{
		card.setColor(Color.blue);
		card.fillRect(10, 10, 350, 200);
		card.setColor(Color.white);
		card.drawArc(20, 100, 150, 200, 250, 300);
		card.setColor(Color.gray);
		card.fillRect(10, 25, 350, 30);
		card.setColor(Color.yellow);
		card.fillRect(10, 150, 350, 40);
		card.drawString("J.W. PRODUCTION", 150, 45);
		card.setColor(Color.black);
		card.drawString("Tel: 584-8443", 25, 180);
		card.drawString("Email: jwalker13@stu.ncu.edu.jm", 165, 180);
		card.setColor(Color.green);
		card.drawString("CEO: John Walker", 25, 75);
		card.drawString("Software Engineer", 60, 95);
		card.fillOval(200, 60, 60, 60);
		card.setColor(Color.red);
		card.drawString("JW", 220, 90);
		card.drawString("P", 225, 100);
		card.setColor(Color.white);
		card.drawString("Unlock Your World With Technology", 160, 140);	
		card.drawString("ADDRESS: Brown's Town, St. Ann", 108, 205);
	}
}
