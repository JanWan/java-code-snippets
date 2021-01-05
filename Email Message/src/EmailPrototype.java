import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EmailPrototype extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTextArea to, cc, bbc, subject, message;
	private JLabel t, c, b, s, m;
	private JButton send;
	
	public EmailPrototype()
	{
		send = new JButton("Send");
		
		t = new JLabel("To:");
		c = new JLabel("CC:");
		b = new JLabel("BBC:");
		s = new JLabel("Subject:");
		m = new JLabel("Message:");
		
		to = new JTextArea(1, 20);
		cc = new JTextArea(1, 20);
		bbc = new JTextArea(1, 19);
		subject = new JTextArea(1, 17);
		message = new JTextArea(1, 16);
		
		send.addActionListener(new EmailListener());
		
		add(t);
		add(to);
		add(c);
		add(cc);
		add(b);
		add(bbc);
		add(s);
		add(subject);
		add(m);
		add(message);
		add(send);
		
		setPreferredSize(new Dimension(250, 200));
		setBackground(Color.yellow);
	}

//******************** ACTION LISTENER ***************************
	
	private class EmailListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String To = to.getText();			
			String Cc = cc.getText();
			String Bc = bbc.getText();
			String sub = subject.getText();
			String mess = message.getText();
			
			System.out.println("Email Info:");
			System.out.println("*******************************");
			System.out.println("To: " + To);
			System.out.println("CC: " + Cc);
			System.out.println("BBC: " + Bc);
			System.out.println("Subject: " + sub);
			System.out.println("Message: " + mess);
			System.out.println("*******************************");
		}
	}
}
