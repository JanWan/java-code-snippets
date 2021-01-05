import java.awt.*;
import javax.swing.*;

public class MoveSpaceShip extends JFrame
{
	public MoveSpaceShip() {
        init();
    }
	
	private void init() 
	{
        this.setTitle("Space Ship Wars");
        
        RotateController g = new RotateController(new Point(150, 150), new Point(250, 70), new Point(380, 70),new Point(400, 40),new Point(400, 150));
        g.setPreferredSize(new Dimension(600, 500));
        g.setBackground(Color.BLACK);
        this.add(g);
        pack();
	}
	
	public static void main(String[] args) 
	{
		MoveSpaceShip frame = new MoveSpaceShip();
        frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
