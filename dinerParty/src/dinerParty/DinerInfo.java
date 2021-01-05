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

public class DinerInfo
{
	private String name;
	private String gender;
	private int x, y;
	Color pickColor;
	
//*********************** CONSTRUCTOR ******************************
	public DinerInfo(String name, String gender, int x, int y)
	{
		this.name = name;
		this.gender = gender;
		this.x = x;
		this.y = y;
		
		pickColor = (gender.equals("male") == true) ? Color.BLUE : Color.PINK;	
	}
//****************** NAME MUTATOR & ACCESSOR *********************	
	public void setName(String Name)
	{
		name = Name;
	}
	
	public String getName()
	{
		return name;
	}
//****************** GENDER MUTATOR & ACCESSOR *******************
	public void setGender(String Gender)
	{
		gender = Gender;
	}
	
	public String getGender()
	{
		return gender;
	}
//***************** X-AXIS MUTATOR & ACCESSOR ********************
	public void setX(int X)
	{
		x = X;
	}
	
	public int getX()
	{
		return x;
	}
//***************** Y-AXIS MUTATOR & ACCESSOR ********************
	public void setY(int Y)
	{
		y = Y;
	}
	
	public int getY()
	{
		return y;
	}
//************ DRAW & FILLOVAL with COLOR & add NAME  ***********
	public void draw(Graphics g)
	{
		g.setColor(pickColor);
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.red);
		g.setFont(new Font("caliba", Font.BOLD, 14));
		g.drawString(name, x + 30, y + 50);
	}
}
//****************************************************************
