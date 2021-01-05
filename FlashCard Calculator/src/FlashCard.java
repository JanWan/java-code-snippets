/*
 * DONE BY:
 * -------------
 * JOHN WALKER
 * RENAE WILLIAMS
 * -------------------------
 * FINAL PROJECT: FLASH CARD
 * PRINCIPLE OF PROGRAMMING 2
 * DECEMBER 2, 2013
 */

import javax.swing.*;

public class FlashCard
{
	public static void main(String[] args) throws Exception
	{
		JFrame card = new JFrame("Flash Cards");
		card.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		flashCardPanel panel = new flashCardPanel();
		
		card.getContentPane().add(panel);
		card.pack();
		card.setVisible(true);
	}

}
