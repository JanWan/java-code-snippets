/*
 * DONE BY:
 * --------------
 * JOHN WALKER
 * RENAE WILLIAMS
 * -------------------------
 * FINAL PROJECT: FLASH CARD
 * PRINCIPLE OF PROGRAMMING 2
 * DECEMBER 2, 2013
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.*;

public class flashCardPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private JButton resetButton, nextButton;
	private JComboBox <String> equType;
	private JPanel subPanel,nextPanel, scorePanel, ansPanel, mainPanel, equPanel, showValPanel, resultPanel;
	private JLabel answerLabel, equationType, resultLabel, value1, value2, signLabel, scoreResult;
	private JLabel label1;
	private JTextField userAns;
	private static String[] option = {"Addition", "Subtraction", "Multiplication", "Division"};
	private int num1, num2, count = 0, count1 = 0, one, two;
	private String sign = " ";
	private int result;
	
	
	public flashCardPanel()
	{
		
	//Declare a new instance of JCombobox
		equPanel = new JPanel();
		equType = new JComboBox<String>(option);
		equationType = new JLabel("Equation type: ");
		equType.setForeground(Color.red);
		equType.setBackground(Color.green);
		equType.setToolTipText("Select equation type from the list");
		equPanel.add(equationType);
		equPanel.add(equType);
	
	//initialize the two variable
		num1 = 1;
		num2 = 2;
		
//************************ DISPLAY VALUES *******************************
//	Calculate the two variables
//***********************************************************************
		if(equType.getSelectedIndex() == 0)
		{
			result = getAddition();
			resultLabel = new JLabel("" + result);
		}
		if(equType.getSelectedIndex() == 1)
		{
			result = getSubtraction();
			resultLabel = new JLabel("" + result);
		}
		
		if(equType.getSelectedIndex() == 2)
		{
			result = getMultiply();
			resultLabel = new JLabel("" + result);
		}
		
		if(equType.getSelectedIndex() == 3)
		{
			result = getDivide();
			resultLabel = new JLabel("" + result);
		}
//--------------------------------------------------------------		
		value1 = new JLabel("" + num1); //display number 1
		value1.setFont(new Font("Serif",Font.BOLD, 36));
		signLabel = new JLabel("+");
		signLabel.setFont(new Font("Serif",Font.BOLD, 36));
		value2 = new JLabel("" + num2); //display number 2
		value2.setFont(new Font("Serif",Font.BOLD, 36));
//--------------------------------------------------------------		
		resultPanel = new JPanel();
		resultPanel.setPreferredSize(new Dimension(270, 20));
		resultPanel.setLayout(new GridLayout(1, 1));
		resultLabel = new JLabel("Enter your answer above ^"); //Display the final result (answer)
		resultPanel.add(resultLabel);
//---------------------------------------------------------------		
	//Set up a panel for the number to display	
		label1 = new JLabel();
		showValPanel = new JPanel();
		showValPanel.setPreferredSize(new Dimension(290, 100));
		showValPanel.setLayout(new GridLayout(2, 2));
		showValPanel.setBorder(BorderFactory.createEtchedBorder());
		showValPanel.add(Box.createVerticalGlue());
		showValPanel.add(label1);
		showValPanel.add(value1);
		showValPanel.add(Box.createVerticalGlue());
		showValPanel.add(signLabel);
		showValPanel.add(value2);
		
	//***************** Reset button & Next button ******************
		resetButton = new JButton("Reset Score");
		resetButton.setToolTipText("Reset score to 0/0");
		nextButton = new JButton("Next");
		nextButton.setToolTipText("Display the next question");
		nextButton.setForeground(Color.black);
		
	//***************************************************************
	//	create listener object for the button and the combo box
		
	//**************** BUTTON LISTENER ******************************
		buttonListener listener = new buttonListener();
		nextButton.addActionListener(listener);
		resetButton.addActionListener(listener);
		
	//******************** Combo box ACTIONLISTENER *****************************	
		equType.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event)
					{
						resultLabel.setForeground(Color.black);
						
						if(equType.getSelectedItem()=="Addition")
						{
							signLabel.setText("+");
							resultLabel.setText("Lets try some addition");
							result = getAddition();
						}
						if(equType.getSelectedItem()=="Subtraction")
						{
							signLabel.setText("-");
							resultLabel.setText("Lets try some subtraction");
							result = getSubtraction();
						}
						if(equType.getSelectedItem()=="Multiplication")
						{
							signLabel.setText("*");
							resultLabel.setText("Lets try some multiplication");
							result = getMultiply();
						}
						if(equType.getSelectedItem()=="Division")
						{
							signLabel.setText("÷");
							resultLabel.setText("Lets try some division");
							result = getDivide();
						}
					}
				}
		);		
	//***************** score button & panel**************************
		scorePanel = new JPanel();
		scorePanel.setPreferredSize(new Dimension(290, 50));
		scorePanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
		JLabel SResult = new JLabel("Score: ");
		
		scoreResult = new JLabel(count + " / " + count1);
		scoreResult.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		
		scoreResult.setFont(new Font("seriff", Font.BOLD, 20));
		scorePanel.add(SResult);
		scorePanel.add(scoreResult);
		scorePanel.add(resetButton);
		
	//******************* Answer Panel *******************************	
		ansPanel = new JPanel();
		ansPanel.setPreferredSize(new Dimension(200, 50));
		ansPanel.setLayout(new GridLayout(1, 1));
		ansPanel.setToolTipText("Result area");
	//----------------------------------------------------------------	
		answerLabel = new JLabel("Answer: ");
		userAns = new JTextField("0");
		userAns.setFont(new Font("seriff", Font.PLAIN, 30));
		userAns.setToolTipText("Enter your answer here, then press next!");
		
		ansPanel.add(answerLabel);
		ansPanel.add(userAns);
		
	//Add Text field and panel to sub-panel	
		JPanel make = new JPanel();
		make.setPreferredSize(new Dimension(200, 80));
		make.setLayout(new GridLayout(1, 1));
		make.add(ansPanel);
		
	//***************** NEXT BUTTON PANEL ***************************	
		nextPanel = new JPanel();
		nextPanel.setLayout(new GridLayout());
		nextPanel.setPreferredSize(new Dimension(290, 30));
		nextPanel.add(nextButton);
		subPanel = new JPanel();
		subPanel.setPreferredSize(new Dimension(290, 40));
		subPanel.add(nextPanel);
	
	//******************* MAIN PANEL *****************************
		mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEtchedBorder());
		mainPanel.setPreferredSize(new Dimension(290, 370));
		mainPanel.add(equPanel);
		mainPanel.add(scorePanel);
		mainPanel.add(showValPanel);
		mainPanel.add(make);
		mainPanel.add(subPanel);
		mainPanel.add(resultPanel);
		
		add(mainPanel);
		
		setPreferredSize(new Dimension(300, 380));
	//------------------------------------------------------------
	}
	//************************************************************
	// implement the action listener class for for the buttons
	//-----------------  ACTIONLISTER CLASS  ---------------------
	private class buttonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int holdResult;
				
		if(event.getSource() == nextButton)
		{			
			holdResult = result; //store previous result
			one = num1; //store previous num1
			two = num2; //store previous num2
			 
			resultLabel.setText(""+result);
		
		//Get user answer from keyboard
			String userAnswer = null;
			
		//Convert the String variable to integer
			int userChoice = 100;
			try
			{
				userAnswer = userAns.getText();
					
				userChoice = Integer.parseInt(userAnswer);
				throw new NumberFormatException();
			}
			catch(NumberFormatException e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
								
		//Generate two random numbers
			Random gen = new Random();
			num1 = gen.nextInt(20) + 1;
			num2 = gen.nextInt(20) + 1;	
	
		//Display the num1 & num2 on the frame
			value1.setText(""+num1);
			value2.setText(""+num2);
				
/*
*******************************************************************	
*	Calculate the values generate by the random number
*******************************************************************
*/				
			if(equType.getSelectedIndex() == 0)
			{
				resultLabel.setText(""+result);
				sign = " + ";
				result = getAddition();
					
				scoreCounter(holdResult, userChoice);
			}
			if(equType.getSelectedIndex() == 1)
			{
				resultLabel.setText(""+result);
				
				sign = " - ";
				result = getSubtraction();
					
				scoreCounter(holdResult, userChoice);
			}
			if(equType.getSelectedIndex() == 2)
			{
				resultLabel.setText(""+result);
				sign = " * ";
				result = getMultiply();
					
				scoreCounter(holdResult, userChoice);	
			}
			if(equType.getSelectedIndex() == 3)
			{					
				resultLabel.setText(""+result);
				sign = " ÷ ";
				result = getDivide();
					
				scoreCounter(holdResult, userChoice);
			}
			}
		}
			
	//********************  RESET SCORE ***************************************
		if(event.getSource() == resetButton)
		{
			reset(); //Reset the score to 0/0
			resultLabel.setForeground(Color.black);
			resultLabel.setText("Score reset: 0/0");
		}
	//*************************************************************************
		}
	}

/*
 *****************************************************************
 *	 			ADDITION FUNCTION
 *****************************************************************
 */
	public int getAddition()
	{		
		int sum = num1 + num2;
		return sum;
	}
/*
 *****************************************************************	
 *			 MULTIPLICATION FUNCTION
 *****************************************************************
 */
	public int getMultiply()
	{
		int value = num1 * num2;
		return value;
	}
/*
 *****************************************************************
 *			DIVISION FUNCTION
 *****************************************************************
*/
	public int getDivide()
	{
		int value = num1/num2;
		return value;
	}
/*
 *****************************************************************
 *			SUBTRACTION FUNCTION
 *****************************************************************
 */
	public int getSubtraction()
	{
		int value = num1 - num2;
		return value;
	}
	
/*
 * ************************************************************************
 * 		RESET FUNCTION
 * ************************************************************************
 */
	public void reset()
	{
		count = 0;
		count1 = 0;
		scoreResult.setText(count + " / " + count1);
	}
/*
 *****************************************************************
 *			COUNTER FUNCTION
 *****************************************************************
 */
	public void scoreCounter(int HoldResult, int user)
	{
		if(HoldResult == user)
		{
			count++;	
		}
			count1++;
			scoreResult.setText(count + " / " + count1);	
//*******************************************************************************		
		if(HoldResult == user)
		{
			resultLabel.setText("Good job!" );
			resultLabel.setForeground(Color.black);
			nextButton.setForeground(Color.green);
		}
		else
		{
			resultLabel.setText("The correct answer is " + one + sign + two + " = " + HoldResult); 
			resultLabel.setForeground(Color.red);
			nextButton.setForeground(Color.red);
		}
		JOptionPane.showMessageDialog(null, "Answer: " + one + " " + sign + " " +  two + " = " + 
				HoldResult + " [ " + user +" ] "+ count + "/" + count1);
	}
}

