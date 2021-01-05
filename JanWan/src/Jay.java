/**
 * This program run the Applet and prints a few strings
 */
import javax.swing.*;
import java.awt.*;
/**
 * @author JWAN
 *
 */
public class Jay extends JApplet{
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics n){
		super.paint(n);
		n.drawString("My first Java Applet:\n", 25, 15);
		n.drawString("print:>", 25, 30);
		n.drawString("Jan Wan", 25, 45);
		
	}
}
