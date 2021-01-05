/**
 * 
 */

/**
 * @author JWAN
 *
 */
import java.awt.*;
import javax.swing.*;

public class imageOrient 
{

	public static void main(String[] args)
	{
		JFrame JWAN = new JFrame("J.W. PRODUCTION");
		JWAN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Images
		ImageIcon ico = new ImageIcon("JWProduction.jpg");
		ImageIcon ico1 = new ImageIcon("Ball.jpg");
		ImageIcon ico2 = new ImageIcon("Apple.jpg");
		ImageIcon ico3 = new ImageIcon("Mellon.jpg");
		
		JLabel labelA, labelB, labelJ, labelW;
		
		//Label 1
		labelA = new JLabel (ico, SwingConstants.LEFT);
		labelB = new JLabel (ico1, SwingConstants.LEFT);
		
		//Label 2
		labelJ = new JLabel (ico2, SwingConstants.LEFT);
		labelW = new JLabel (ico3, SwingConstants.CENTER);
		
		//Set up panel 1
		JPanel Origin1 = new JPanel();
		Origin1.setBackground(Color.cyan);
		Origin1.setPreferredSize(new Dimension(520, 200));
		Origin1.add(labelA);
		Origin1.add(labelB);
		
		//Set up panel 2
		JPanel Origin2 = new JPanel();
		Origin2.setBackground(Color.yellow);
		Origin2.setPreferredSize(new Dimension(380, 150));
		Origin2.add(labelJ);
		Origin2.add(labelW);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(Color.green);
		MainPanel.add(Origin1);
		MainPanel.add(Origin2);
				
		JWAN.getContentPane().add(MainPanel);
		JWAN.pack();
		JWAN.setVisible(true);
	}
}
