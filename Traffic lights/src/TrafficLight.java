import javax.swing.*;

public class TrafficLight 
{
	public static void main(String[] args) 
	{
		JFrame JWAN = new JFrame("Traffic Light");
		JWAN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JWAN.getContentPane().add(new TrafficLightPanel());
		
		JWAN.pack();
		JWAN.setVisible(true);
	}
}
