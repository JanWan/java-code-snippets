package catchACreature;

import javax.swing.JFrame;

public class GameDriver 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame gameHolder = new JFrame("Catch-the-Creature"); 
		gameHolder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gameHolder.getContentPane().add(new Game());
		gameHolder.setVisible(true);
		gameHolder.pack();
	}
}
