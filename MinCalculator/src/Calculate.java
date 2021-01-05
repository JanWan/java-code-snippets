import java.awt.*;
import javax.swing.*;

public class Calculate extends JApplet
{
	private static final long serialVersionUID = 1L;
	private double sum, product, difference;
	
	public void init()
	{
		String num1 = JOptionPane.showInputDialog("Enter first number");
		String num2 = JOptionPane.showInputDialog("Enter second number");
		
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		
		sum = n1 + n2;
		product = n1 * n2;
		difference = n1 - n2;
	}
	
	public void paint(Graphics j)
	{
		super.paint(j);
		//setColor(Color.cyan);
		j.setColor(Color.black);
		j.drawString("Mini Calculator", 50, 15);
		j.drawString("Sum is: "+ sum , 25, 30);
		j.drawString("Product is: "+ product , 25, 45);
		j.drawString("Difference is: "+ difference , 25, 60);
	}
}
