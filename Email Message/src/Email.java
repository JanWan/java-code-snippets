
import javax.swing.JFrame;


public class Email
{
	public static void main(String[] args) 
	{
		JFrame JMail = new JFrame("Email Prototype");
		JMail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EmailPrototype panel = new EmailPrototype();
		JMail.getContentPane().add(panel);
		
		JMail.pack();
		JMail.setVisible(true);
	}
}
