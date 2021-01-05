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

import javax.swing.*;

public class CatchTheCreature
{
	public static void main(String[] args) 
	{
		JFrame Creature = new JFrame("Catch The Creature");
		Creature.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Creature.getContentPane().add(new CatchTheCreaturePanel());	//Add to frame
		Creature.pack();
		Creature.setVisible(true);
	}
}
