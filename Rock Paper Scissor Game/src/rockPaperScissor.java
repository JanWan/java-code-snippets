import javax.swing.*;

public class rockPaperScissor
{
	public static void main(String []args)
	{
		JFrame Game = new JFrame("Rock Paper Scissors Game");
		Game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RockPaperScissorPanel panel = new RockPaperScissorPanel();
		Game.getContentPane().add(panel);
		Game.pack();
		Game.setVisible(true);
	}
}
