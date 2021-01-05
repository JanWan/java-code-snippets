import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculatorPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private JButton butt_0, butt_1, butt_2, butt_3, butt_4, butt_5, butt_6, butt_7, butt_8, butt_9;
	private JButton butt_multiply, butt_plus, butt_minus, butt_divide;
	private JPanel buttPanel, screenPanel, equPanel1, equPanel2, mainPanel;
	private JLabel Screen;
	private JLabel numLabel1, numLabel2;
	private int result = 0, value = 1;
	
	public calculatorPanel()
	{
		
		numLabel1 = new JLabel();
		numLabel2 = new JLabel();
	
	screenPanel = new JPanel();
		screenPanel.setPreferredSize(new Dimension(200, 40));
		screenPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		screenPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
		screenPanel.setLayout(new GridLayout(1, 1));
		Screen = new JLabel();
		screenPanel.add(Screen);
		
		screenPanel.add(numLabel1);
		screenPanel.add(numLabel2);
		
	equPanel1 = new JPanel();
		equPanel1.setPreferredSize(new Dimension(10, 10));
		equPanel1.setLayout(new GridLayout(2, 2));
		
		
	equPanel2 = new JPanel();
		equPanel2.setForeground(Color.blue);
		equPanel2.setPreferredSize(new Dimension(10, 10));
		equPanel2.setLayout(new GridLayout(2, 2));
		
		butt_multiply = new JButton("x");
		butt_multiply.setFont(new Font("Seriff", Font.BOLD, 14));
		butt_plus = new JButton("+");
		butt_plus.setFont(new Font("Seriff", Font.BOLD, 16));
		butt_minus = new JButton("-");
		butt_minus.setFont(new Font("Seriff", Font.BOLD, 16));
		butt_divide = new JButton("÷");
		butt_divide.setFont(new Font("Seriff", Font.BOLD, 16));
		
		equPanel1.add(butt_multiply);
		equPanel1.add(butt_plus);
		equPanel2.add(butt_minus);
		equPanel2.add(butt_divide);
		
	buttPanel = new JPanel();
		butt_1 = new JButton("1");
		butt_1.setForeground(Color.blue);
		butt_2 = new JButton("2");
		butt_2.setForeground(Color.blue);
		butt_3 = new JButton("3");
		butt_3.setForeground(Color.blue);
		butt_4 = new JButton("4");
		butt_4.setForeground(Color.blue);
		butt_5 = new JButton("5");
		butt_5.setForeground(Color.blue);
		butt_6 = new JButton("6");
		butt_6.setForeground(Color.blue);
		butt_7 = new JButton("7");
		butt_7.setForeground(Color.blue);
		butt_8 = new JButton("8");
		butt_8.setForeground(Color.blue);
		butt_9 = new JButton("9");
		butt_9.setForeground(Color.blue);
		butt_0 = new JButton("0");
		butt_0.setForeground(Color.blue);
		
		buttonListener press = new buttonListener();
		butt_1.addActionListener(press);
		butt_2.addActionListener(press);
		butt_3.addActionListener(press);
		butt_4.addActionListener(press);
		butt_5.addActionListener(press);
		butt_6.addActionListener(press);
		butt_7.addActionListener(press);
		butt_8.addActionListener(press);
		butt_9.addActionListener(press);
		butt_0.addActionListener(press);
		
		
		buttPanel.setPreferredSize(new Dimension(200, 210));
		buttPanel.setLayout(new GridLayout(4, 5));
		buttPanel.setForeground(Color.blue);
		buttPanel.add(butt_1);
		buttPanel.add(butt_2);
		buttPanel.add(butt_3);
		buttPanel.add(butt_4);
		buttPanel.add(butt_5);
		buttPanel.add(butt_6);
		buttPanel.add(butt_7);
		buttPanel.add(butt_8);
		buttPanel.add(butt_9);
		buttPanel.add(butt_0);
		buttPanel.add(equPanel1);
		buttPanel.add(equPanel2);
		
		mainPanel = new JPanel();
		mainPanel.add(buttPanel);
		
		add(screenPanel);
		add(mainPanel);
		setPreferredSize(new Dimension(210, 280));
		
	}
	
	private class buttonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Object source = e.getSource();
			
			String val = "";
			
			if(source == butt_1)
			{
				
					val = String.valueOf(value + 0);
					numLabel1.setText(val);
				
			}
			
			if(source == butt_2)
			{
				int r =	power(value);
				System.out.println(r);
				
				val = String.valueOf(value + 1);
				System.out.println(value);
				
					numLabel2.setText(val);
					
					System.out.println(val);
			}
			
			if(source == butt_3)
			{
				val = String.valueOf(value + 2);
				numLabel2.setText(val);
			}
			
			if(source == butt_4)
			{
				val = String.valueOf(value + 3);
				numLabel2.setText(val);
			}
			
			if(source == butt_5)
			{
				val = String.valueOf(value + 4);
				numLabel2.setText(val);
			}
			
			if(source == butt_6)
			{
				val = String.valueOf(value + 5);
				numLabel2.setText(val);
			}
			
			if(source == butt_7)
			{
				val = String.valueOf(value + 6);
				numLabel2.setText(val);
			}
			
			if(source == butt_8)
			{
				val = String.valueOf(value + 7);
				numLabel2.setText(val);
			}
			
			if(source == butt_9)
			{
				val = String.valueOf(value + 8);
				numLabel2.setText(val);
			}
			
			if(source == butt_0)
			{
				val = String.valueOf(value + 9);
				numLabel2.setText(val);
			}
			
		}
	}
	
	public static int power(int n)
	{
		//base case
		if(n == 0)
			return n;
		else
			//recursive step
			return n + power(n * 10);
	}
}
