import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class beverages extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Instantiate variables
	private JButton orderTheseBeverages;
	private JTextField fPunch,  pepUp, DrPepper, Sprite, Lemonade, RLemonade, BWater;
	private JPanel panelSet, mainPanel, subPanel1, subPanel2, orderPanel;
	private JLabel NOS;
	private int [] num = new int[6];
	private int count, total;
	public beverages()
	{
	
	//************************** SUB-PANEL1 *****************************
		subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(300, 200));
		subPanel1.setBorder (BorderFactory.createTitledBorder ("Beverages"));
		subPanel1.setLayout(new GridLayout(9, 9));
		
		fPunch = new JTextField();
		pepUp = new JTextField();
		DrPepper = new JTextField();
		Sprite = new JTextField();
		Lemonade = new JTextField();
		RLemonade = new JTextField();
		BWater = new JTextField();
		
		subPanel1.add(new JLabel(""));
		subPanel1.add(new JLabel("          Quantity"));
		subPanel1.add(new JLabel("Fruit Punch"));
		subPanel1.add(fPunch);
		subPanel1.add(new JLabel("PepUp"));
		subPanel1.add(pepUp);
		subPanel1.add(new JLabel("Dr. Pepper"));
		subPanel1.add(DrPepper);
		subPanel1.add(new JLabel("Sprite"));
		subPanel1.add(Sprite);
		subPanel1.add(new JLabel("Lemonade"));
		subPanel1.add(Lemonade);
		subPanel1.add(new JLabel("Raspberry Lemonade"));
		subPanel1.add(RLemonade);
		subPanel1.add(new JLabel("Bottled Water"));
		subPanel1.add(BWater);
		
	//****************************************************************
		orderTheseBeverages = new JButton("Order These Beverages");
		buttonListener listener = new buttonListener();	
		orderTheseBeverages.addActionListener(listener);
		orderPanel = new JPanel();
		orderPanel.setLayout(new GridLayout(1, 1));
		orderPanel.setPreferredSize(new Dimension(500, 30));
		orderPanel.add(orderTheseBeverages);
		
//***********************************************************************
		mainPanel = new JPanel();
		mainPanel.add(subPanel1);
		mainPanel.add(orderPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		panelSet = new JPanel();
		panelSet.setLayout(new BorderLayout());
		panelSet.add(orderPanel);
		
		subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(500, 100));
		subPanel2.setBorder(BorderFactory.createTitledBorder("Current Order"));
		subPanel2.setLayout(new BorderLayout());
		NOS = new JLabel("Number of Beverage: " + total);
		subPanel2.add(NOS);
	
		
		add(mainPanel);
		add(panelSet);
		add(subPanel2);
		setPreferredSize(new Dimension(500, 500));
	}
	
	private class buttonListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == orderTheseBeverages)
			{
				
				String fp = fPunch.getText();
				String pep = pepUp.getText();
				String Dr = DrPepper.getText();
				String Sp = Sprite.getText();
				String lem = Lemonade.getText();
				String RLem = RLemonade.getText();
				String BW = BWater.getText();
				
			total = 0;
			int num1, num2, num3, num4;
				num1 = Integer.parseInt(fp);	
				
				num2 = Integer.parseInt(pep);
				
				num3 = Integer.parseInt(Dr);

				num4 = Integer.parseInt(lem);

				//num[4] = Integer.parseInt(RLem);
				
					total = num1 + num2 + num3 + num4;
					NOS.setText("" + total);
					JOptionPane.showMessageDialog(null, "count: " + total);
			}
				
				/*for(int val : num)
					count += val;
				System.out.println(count);
				NOS.setText(Integer.toString(count));
				JOptionPane.showMessageDialog(null, "count: " + count);*/
		}
	}


}
