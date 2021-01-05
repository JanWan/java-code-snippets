/**
 * 
 */

/**
 * @author JWAN
 *
 */
import java.awt.*;
import javax.swing.*;

public class House extends JApplet
{
	public void paint(Graphics H)
	{
		//Display background
		H.setColor(Color.cyan);
		H.fillRect(0, 20, 370, 180);
		//Display the lawn
		H.setColor(Color.green);
		H.fillRect(0, 200, 370, 50);
		//Display the house
		H.setColor(Color.blue);
		H.fillRect(40, 110, 280, 120);
		//Display the window
		H.setColor(Color.yellow);
		H.fillRect(100, 150, 30, 20);
		H.fillRect(240, 150, 30, 20);
		
		H.drawString("John Walker", 2, 245);
		//Sun
		H.fillOval(240, 20, 40, 40);
		//Display the roof
		H.setColor(Color.black);
		H.fillRect(20, 100, 320, 40);
		//Display the door
		H.setColor(Color.white);
		H.fillRect(165, 170, 40, 60);
		//Door knob
		H.setColor(Color.black);
		H.fillOval(190, 200, 10, 10);
		//Chimney
		H.setColor(Color.red);
		H.fillRect(90, 80, 20, 40);
		//Smoke
		H.setColor(Color.gray);
		H.fillOval(90, 60, 20, 20);
		H.fillOval(94, 50, 20, 20);
		H.fillOval(103, 45, 15, 15);
		//Cloud
		H.setColor(Color.white);
		H.fillOval(200, 32, 60, 30);
		H.fillOval(230, 40, 60, 30);
		
	}
}
