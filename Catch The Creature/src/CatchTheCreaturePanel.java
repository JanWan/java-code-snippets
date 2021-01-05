 /*
 * DONE BY:
 * --------------
 * JOHN WALKER		26120334
 * RENAE WILLIAMS	18100906
 * -------------------------
 * FINAL PROJECT: CATCH THE CREATURE
 * PRINCIPLEs OF PROGRAMMING 2
 * DECEMBER 2, 2013
 */
 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.*;

public class CatchTheCreaturePanel extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	private ImageIcon creature;
	private Timer time;
	private JPanel mainPanel, subPanel;
	private JLabel catchCountLab, missCountLab, missedLabel, catchLabel, levelLab;
	private JComboBox <String> level;
	private static String [] Levels = {"Slow","Medium","Fast", "Ultra"};
	private Random Xgen, Ygen;
	private int missedCounter, pressCounter, move_x, move_y, delay, catchX, catchY;
	private final int WIDTH, HEIGHT, IMAGESIZE, CLICK;
	
	
	CatchTheCreaturePanel()
	{
		IMAGESIZE = 50;
		catchX = -10;
		catchY = -10;
		WIDTH = 400; 
		HEIGHT = 350;
		CLICK = 5;
		pressCounter=0;
		missedCounter=0;
		
	//Random generator
	//--------------------------------------------------
		Xgen = new Random();
		Ygen = new Random();
		move_x = Xgen.nextInt(WIDTH-IMAGESIZE);
		move_y = Ygen.nextInt(HEIGHT) + 50;
		
		System.out.println("mx "+move_x);
		System.out.println("cx1 "+catchX);
	//---------------------------------------------------
		delay = 1300;
		
		time = new Timer(delay, new TimerListener());
		creature = new ImageIcon("creature.png"); //image
		
		addMouseListener(new catchListener());
	//****************************************************
		
		level = new JComboBox<String>(Levels);
		levelLab = new JLabel("Levels:");
		level.setForeground(Color.red);
		
		level.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event)
					{
						if(event.getSource()==level){
		
							if(level.getSelectedIndex() == 0)
							{
								delay = 1300;
								time.setDelay(delay);
							}
							if(level.getSelectedIndex() == 1)
							{
								delay = 800;
								time.setDelay(delay);
							}
							if(level.getSelectedIndex() == 2)
							{
								delay = 250;
								time.setDelay(delay);
							}
							if(level.getSelectedIndex() == 3)
							{
								delay = 50;
								time.setDelay(delay);
							}
						}
					}
				});
	//****************************************************
		
	//Labels & panels
	//---------------------------------------------------
		catchLabel = new JLabel("Catches: ");
		catchCountLab = new JLabel("0");
		missedLabel = new JLabel("Misses: ");
		missCountLab = new JLabel("0");
	//----------------------------------------------------	
		subPanel = new JPanel();
		subPanel.setPreferredSize(new Dimension(350, 20));
		subPanel.setLayout(new GridLayout(1, 1));
		subPanel.add(catchLabel);
		subPanel.add(catchCountLab);
		subPanel.add(missedLabel);
		subPanel.add(missCountLab);
		subPanel.add(levelLab);
		subPanel.add(level);
		
		mainPanel = new JPanel();
		mainPanel.add(subPanel);
	
		add(mainPanel);
	
		setPreferredSize(new Dimension(WIDTH, 430));
		setBackground(Color.white);
		time.start();
	}
	
	//********************** Repaint method ************************	
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.green);
			g.fillRect(catchX-CLICK, catchY-CLICK, CLICK*2, CLICK*2);
			creature.paintIcon(this, g, getShiftX(), getShiftY());
			
		}
		
		//********************** time class ****************************
		private class TimerListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
							
				setShiftX(Xgen.nextInt(WIDTH-IMAGESIZE));
				setShiftY(Ygen.nextInt(HEIGHT)+50);
				
				if(getShiftX() <= 0 || getShiftX() >= WIDTH - IMAGESIZE)
					setShiftX(getShiftX()-IMAGESIZE);
				if(getShiftY() <= 0 || getShiftY() >= HEIGHT - IMAGESIZE)
					setShiftY(getShiftY()-IMAGESIZE);
				
				repaint();
			}
		}

	//******************* Mouse listener ***********************
	
	private class catchListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent ea)
		{
			catchX = ea.getX();
			catchY = ea.getY();
			
			System.out.println("cx2 "+catchX);
			System.out.println("gm "+getShiftX());
			
			clickMe();
		}
	}
	
//--------------------------------------------------------------
	public void clickMe()
	{
		if(getShiftX()+30 >= catchX && catchX >= getShiftX() || getShiftY()+ 50 >= catchY && catchY >= getShiftY())
		{
			pressCounter++;
			catchCountLab.setText(""+pressCounter);
		}
		else
		{
			missedCounter++;
			missCountLab.setText(""+missedCounter);
		}
	}
//---------------------------------------------------------------
	//missed counter
	public int missedCount()
	{
		missedCounter = 0;
		return missedCounter;
	}
	
	//catch counter
	public int pressCount()
	{
		pressCounter = 0;
		return pressCounter;
	}
//---------------------------------------------------------------
	//move cursor
	public void setShiftX(int x)
	{
		move_x = x;
	}
	
	public int getShiftX()
	{
		return move_x;
	}
//---------------------------------------------------------------	
	public void setShiftY(int x)
	{
		move_y = x;
	}
	
	public int getShiftY()
	{
		return move_y;
	}
//----------------------------------------------------------------

}
