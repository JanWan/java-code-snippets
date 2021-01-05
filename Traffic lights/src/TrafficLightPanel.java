import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton change;
	private JPanel But;
	int counter = 1;
	
	public TrafficLightPanel()
	{
		change = new JButton("Change Light");
		
		//Create new action listener
		ButtonListener  listener = new ButtonListener();
		change.addActionListener(listener);
		
		
		//Create button & add it to the panel
		But = new JPanel();
		But.setPreferredSize(new Dimension(150, 40));
		add(change);
		
		//Add button to frame
		setPreferredSize(new Dimension(180, 270));
		setBackground(Color.cyan);
	}
//********************* ACTION LISTENER ************************
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			event.getSource();
			if( counter < 3)
			{
				counter++;
			}
			else
			{
				counter = 1;
			}
		}
	}
	
	//*************************************************************
	
	public void paintComponent(Graphics light)
	{
		super.paintComponent(light);
		
		light.setColor(Color.LIGHT_GRAY);
		light.fillRect(40, 50, 100, 210);
		
		if(counter == 1)
		{ 		
			light.setColor(Color.red);
			light.fillOval(60, 55, 60, 60);
			
			light.setColor(Color.black);
			light.fillOval(60, 125, 60, 60);
				
			light.setColor(Color.black);
			light.fillOval(60, 190, 60, 60);
		}
		if(counter == 2)
		{ 		
			light.setColor(Color.black);
			light.fillOval(60, 55, 60, 60);
			
			light.setColor(Color.yellow);
			light.fillOval(60, 125, 60, 60);
				
			light.setColor(Color.black);
			light.fillOval(60, 190, 60, 60);
		}
		if(counter == 3)
		{ 		
			light.setColor(Color.black);
			light.fillOval(60, 55, 60, 60);
			
			light.setColor(Color.black);
			light.fillOval(60, 125, 60, 60);
				
			light.setColor(Color.green);
			light.fillOval(60, 190, 60, 60);
		}
		repaint();
	}
}
