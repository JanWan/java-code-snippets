package dinerParty;
/*
 * DONE BY:
 * --------------
 * JOHN WALKER
 * RENAE WILLIAMS
 * -------------------------
 * FINAL PROJECT: DINER
 * PRINCIPLE OF PROGRAMMING 2
 * DECEMBER 2, 2013
 */

import java.awt.*;

import javax.swing.*;

public class Diner extends JApplet
{
	private static final long serialVersionUID = 1L;
	
	private DinerInfo Kyle, Kim, Peter, Shanay, James, Rebecca, Harry, Jody;
	
//***********************************************************************	
	public void init()
	{	
		setSize(550, 400);
			
		Kyle = new DinerInfo("Kyle", "male", 50, 30);
		Kim = new DinerInfo("Kim", "female", 165, 30);
		Peter = new DinerInfo("Peter", "male", 275, 30);
		Shanay = new DinerInfo("Shanay", "female", 390, 30);
		James = new DinerInfo("James", "male", 50, 250);
		Rebecca = new DinerInfo("Rebecca", "female", 165, 250);
		Harry = new DinerInfo("Harry", "male", 275, 250);
		Jody = new DinerInfo("Jody", "female", 390, 250);
	}	
	
//*******************************************************************	
	public void paint(Graphics dine)
	{
		super.paintComponents(dine);
		
		dine.setColor(Color.black);
		dine.fillRect(50, 135, 450, 110);
		
		Kyle.draw(dine);
		Kim.draw(dine);
		Peter.draw(dine);
		Shanay.draw(dine);
		James.draw(dine);
		Rebecca.draw(dine);
		Harry.draw(dine);
		Jody.draw(dine);	
	}
}


