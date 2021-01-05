import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sides extends JPanel
{
	//Instantiate variables
	private JButton orderTheseSides;
	private JTextField cheeseBread, breadSticks, BWings, CSalad, GSalad, MSoup, meatballs, spaghetti;
	private JPanel panelSet, mainPanel, ButtonPanel, subPanel1, subPanel2, subPanel3;
	private JLabel count, gTotal;
	private int num1, num2, num3, num4, num5, num6, num7, num8, NumOfSides, total, GrandTotal;
	
	
	public Sides()
	{
		
		
	//***************** Order button ***********************************
		orderTheseSides = new JButton("Order These Sides");
		ButtonPanel = new JPanel();
		ButtonPanel.setLayout(new GridLayout(1, 1));
		ButtonPanel.setPreferredSize(new Dimension(500, 30));
		ButtonPanel.add(orderTheseSides);
		
		buttonListener listener = new buttonListener();
		orderTheseSides.addActionListener(listener);
	//******************************************************************
	subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(300, 200));
		subPanel1.setBorder (BorderFactory.createTitledBorder ("Sides"));
		subPanel1.setLayout(new GridLayout(9, 9));
		
		cheeseBread = new JTextField();
		breadSticks = new JTextField();
		BWings = new JTextField();
		CSalad = new JTextField();
		GSalad = new JTextField();
		MSoup = new JTextField();
		meatballs = new JTextField();
		spaghetti = new JTextField();
		
		subPanel1.add(new JLabel(""));
		subPanel1.add(new JLabel("          Quantity"));
		subPanel1.add(new JLabel("Cheese Bread"));
		subPanel1.add(cheeseBread);
		subPanel1.add(new JLabel("Bread Sticks"));
		subPanel1.add(breadSticks);
		subPanel1.add(new JLabel("Buffalo Wings"));
		subPanel1.add(BWings);
		subPanel1.add(new JLabel("Caesar Salad"));
		subPanel1.add(CSalad);
		subPanel1.add(new JLabel("Greek Salad"));
		subPanel1.add(GSalad);
		subPanel1.add(new JLabel("Minestrone Soup"));
		subPanel1.add(MSoup);
		subPanel1.add(new JLabel("Meatballs"));
		subPanel1.add(meatballs);
		subPanel1.add(new JLabel("Spaghetti"));
		subPanel1.add(spaghetti);
		
	//***********************************************************************
		mainPanel = new JPanel();
		mainPanel.add(subPanel1);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		panelSet = new JPanel();
		panelSet.setLayout(new BorderLayout());
		panelSet.add(ButtonPanel);
		
		subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(500, 100));
		subPanel2.setBorder(BorderFactory.createTitledBorder("Current Order"));
		subPanel2.setLayout(new BorderLayout());
		
		NumOfSides = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
		
		count = new JLabel("Number of Sides: " , NumOfSides);
		subPanel2.add(count);
		
		
		subPanel3 = new JPanel();
		subPanel3.setPreferredSize(new Dimension(400, 20));
		subPanel3.setLayout(new GridLayout(1, 1));
		gTotal = new JLabel("Grand Total:");
		subPanel3.add(gTotal);
		
		add(mainPanel);
		add(panelSet);
		add(subPanel2);
		add(subPanel3);
		
		setPreferredSize(new Dimension(500, 500));
	}
	
	private class buttonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent button)
		{
			Object source = button.getSource();
			
			
			
			String CB = cheeseBread.getText();
			String BS = breadSticks.getText();
			String BW = BWings.getText();
			String CS = CSalad.getText();
			String GS = GSalad.getText();
			String MS = MSoup.getText();
			String MB = meatballs.getText();
			String spag = spaghetti.getText();
			
		
		
			if(source == orderTheseSides)
				num1 = Integer.parseInt(CB);
				double cBread = 20.0;
			
			
				num2 = Integer.parseInt(BS);
				double bSticks = 10.0;
			
			
				num3 = Integer.parseInt(BW);
			
				num4 = Integer.parseInt(CS);
			
				num5 = Integer.parseInt(GS);
			
				num6 = Integer.parseInt(MS);
			
				num7 = Integer.parseInt(MB);
			
				num8 = Integer.parseInt(spag);
			
				NumOfSides = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
			
				count.setText(""+NumOfSides);
			
		}
	}


}
