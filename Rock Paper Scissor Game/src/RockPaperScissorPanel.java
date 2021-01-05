import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class RockPaperScissorPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private ImageIcon Rock, Paper, Scissors, Comp, replaceIm;
	private JLabel Label1, Label2;
	private JButton playGame, butt1, butt2, butt3, butt4;
	private JPanel mainPanel, subPanel, subPanel2, txtPanel;
	private int tCount = 0, wCount = 0, lCount = 0, comCountW = 0, comCountL = 0, count = 0 ;
	private String Win;
	private int comHolder;
	private int playerHolder;
	
	Random gen = new Random();
	int computer; 
	
//**************** Constructor *****************************	
	public RockPaperScissorPanel()
	{		
		setLayout(new BorderLayout());
		
		playGame = new JButton("Play Game");
		playGame.setForeground(Color.red);
		playGame.setBackground(Color.green);
		
		Rock = new ImageIcon("Rock.jpg");
		Paper = new ImageIcon("Paper.jpg");
		Scissors = new ImageIcon("Scissors.jpg");
		Comp = new ImageIcon("Computer.jpg");
		
//Add image to label
		Label1 = new JLabel("Player", SwingConstants.CENTER);
		Label2 = new JLabel("Computer");
		
//Player Random button
		butt1 = new JButton(Rock);
		butt2 = new JButton(Paper);
		butt3 = new JButton(Scissors);
		butt4 = new JButton(Comp);
		
		Comp = replaceIm;
		
//Create new button listener
		ButtonListener listener = new ButtonListener();
		playGame.addActionListener(listener);
		
		butt1.addActionListener(listener);
		butt2.addActionListener(listener);
		butt3.addActionListener(listener);
		
//Create sub-panel 1 for label & add it to the panel
		txtPanel = new JPanel();
		txtPanel.setLayout(new GridLayout(1,1));
		txtPanel.add (Box.createRigidArea (new Dimension (150, 50)));
		txtPanel.setBackground(Color.LIGHT_GRAY);
		txtPanel.add(Label1);
		txtPanel.add (Box.createRigidArea (new Dimension (0, 0)));
		txtPanel.add(Box.createHorizontalGlue());
		txtPanel.add(Label2);
		
//Create sub-panel 2 & add button to the panel
		subPanel = new JPanel();
		subPanel.setBorder (BorderFactory.createLoweredBevelBorder ());
		subPanel.setLayout (new GridLayout(1, 1));
		subPanel.setBackground(Color.cyan);
		subPanel.add(butt1);
		subPanel.add(butt2);
		subPanel.add(butt3);
		subPanel.add(Box.createRigidArea(new Dimension(30, 60)));
		subPanel.add(butt4);
		
//Create sub-panel 3 & add button to the panel
		subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(300, 60));
		subPanel2.setBackground(Color.LIGHT_GRAY);
		subPanel2.add(playGame);

//**************************************************************
		//Create Main panel & add it to the sub-panel panel
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(150, 30));
		setBackground(Color.gray);
		add(txtPanel, BorderLayout.NORTH);
		add(subPanel, BorderLayout.CENTER);
		add(subPanel2, BorderLayout.SOUTH);
		
		setPreferredSize(new Dimension(400, 200));
		setBackground(Color.cyan);
	}
	
	//************ Action Listener **************************
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{			
			Object source = event.getSource();
			
			if(source == playGame)
				computer = gen.nextInt(3) + 1;
			
				if(source == butt1)
				{
					playerHolder = 1;
					randomChange();
					System.out.println("Player: rock");
					compVSplay();
				}
				
				if(source == butt2)
				{
					playerHolder = 2;
					randomChange();
					System.out.println("Player: paper");
					compVSplay();					
				}
			
				if(source == butt3)
				{
					playerHolder = 3;
					randomChange();
					System.out.println("Player: scissors");
					compVSplay();
				}
		}
	}
//****************** COMPUTER RANDOM PICK FUNCTION **********************
	public void randomChange()
	{
		switch(computer)
		{
		case 1:
			replaceIm = Rock;
			butt4.setIcon(replaceIm);
			System.out.println("Computer: Rock*");
			comHolder = 1;
			break;
		case 2:
			replaceIm = Paper;
			butt4.setIcon(replaceIm);
			System.out.println("Computer: paper*");
			comHolder = 2;
			break;
		case 3:
			replaceIm = Scissors;			
			butt4.setIcon(replaceIm);
			System.out.println("Computer: scissors*");
			comHolder = 3;
			break;
		}
		repaint();
	}

//************ PLAYER VS COMPUTER *************************************
	public void compVSplay()
	{
		
		if(playerHolder == 1 && comHolder == 1)
		{
			System.out.println("Tie\n");
			tCount++;
		}
		else if(playerHolder == 2 && comHolder == 2)
		{
			System.out.println("Tie\n");
			tCount++;
		}
		else if(playerHolder == 3 && comHolder == 3)
		{
			System.out.println("Tie\n");
			tCount++;
		}
		
//*************************************************************
		
		if(playerHolder == 1 && comHolder == 2)
		{
			System.out.println("computer wins\n");
			Win = "Computer";
			lCount++;
			comCountW++;
		}
		else if(playerHolder == 1 && comHolder == 3)
		{
			System.out.println("Player Wins\n");
			Win = "Player";
			wCount++;
			comCountL++;
		}
		else if(playerHolder == 2 && comHolder == 1)
		{
			System.out.println("Player Wins\n");
			Win = "Player";
			wCount++;
			comCountL++;
		}
		else if(playerHolder == 3 && comHolder == 1)
		{
			System.out.println("computer win\n");
			Win = "Computer";
			lCount++;
			comCountW++;
		}
		else if(playerHolder == 3 && comHolder == 2)
		{
			System.out.println("player win\n");
			Win = "Player";
			wCount++;
			comCountL++;
		}
		else if(playerHolder == 2 && comHolder == 3)
		{
			System.out.println("computer win\n");
			Win = "Computer";
			lCount++;
			comCountW++;
		}
		count++;
//***************************************************************		
		if(comHolder == playerHolder)
		{
			JOptionPane.showMessageDialog(null, "Tie");
		}
		else
		{
			JOptionPane.showConfirmDialog(null, "Winner: " + Win + "\n\n** Player ******** Computer **" + 
					"\n Win:   " + wCount + " |  ******  | " + comCountW + 
					"\n Loss: " + lCount + " |  ******  | " + comCountL + 
					"\n Tie:     " + tCount + " |  ******  | " + tCount + "\n\n\tGame Played: " + count +
					" -- Play again... ", 
					"RPS Game Summary...", JOptionPane.YES_NO_OPTION);
		}
	}
//**********************************************************************
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Comp = replaceIm;
		repaint();
	}
}
//***********************************************************************