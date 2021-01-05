import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class mangoesRestaurant {

	public static void main(String[] args) 
	{
		JFrame Food = new JFrame("Mangoes Restaurant");
		Food.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();		
		JLabel name = new JLabel("Mangoes Restaurant");
		panel1.add(name);
		
		
		JTabbedPane restTP = new JTabbedPane();
		restTP.setForeground(Color.red);
		restTP.addTab("Main Course", new mainCourse());
		restTP.addTab("Beverages", new beverages());
		restTP.addTab("Sides", new Sides());
		
		JPanel panel2 = new JPanel();
		panel2.add(restTP);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		
		Food.getContentPane().add(mainPanel);
		Food.pack();
		Food.setVisible(true);
	}

}
