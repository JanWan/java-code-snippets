import javax.swing.*;
public class Calculator 
{

	public static void main(String[] args) 
	{
		JFrame cal = new JFrame("Calculator");
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorPanel panel = new calculatorPanel();
		cal.getContentPane().add(panel);
		cal.pack();
		cal.setVisible(true);
	}

}
