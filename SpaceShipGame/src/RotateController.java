import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RotateController extends JPanel implements MouseMotionListener, MouseListener, KeyListener, Runnable
{
	private Polygon polygon;
	private int shootLaserX, shootLaserY;
	private Thread thread;
	 
    int lastXPos = 0;
    int lastYPos = 0;
    int pointCount = 0;
    
    int laserX = 0;
    int laserY = 0;
    int ExtendX = 0;
    
    
    boolean isMousePressed;
 
  
  public RotateController(Point p1, Point p2, Point p3, Point p4, Point p5 ) 
  {
        polygon = new Polygon();
        polygon.addPoint(p1.x, p1.y);
        polygon.addPoint(p2.x, p2.y);
        polygon.addPoint(p3.x, p3.y);
        polygon.addPoint(p4.x, p4.y);
        polygon.addPoint(p5.x, p5.y);
        
 
        lastXPos = this.getX();
        lastYPos = this.getY();
    
        
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        return;
    }
  
  public void paintComponent(Graphics g) 
  {      
      super.paintComponent(g);
      g.setColor(Color.GREEN);
      g.fillPolygon(polygon);
      g.drawLine(getLaserX()+getExtendX(), getLaserY()+150, getLaserX()+150, getLaserY()+150);
  }

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int xPos = e.getX();
        int[] xPoints = polygon.xpoints;
        for (int i = 0; i < xPoints.length; i++) {
            xPoints[i] = xPoints[i] - (lastXPos - xPos);
        }
        lastXPos = xPos;
        setLaserX(lastXPos);

        int yPos = e.getY();
        int[] yPoints = polygon.ypoints;
        for (int i = 0; i < yPoints.length; i++) {
            yPoints[i] = yPoints[i] - (lastYPos - yPos);
        }
        lastYPos = yPos;
        setLaserY(lastYPos);
        
        repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int paintX = getLaserX();
		int paintY = getLaserY();
				
		isMousePressed = true;
		//while(isMousePressed==true){
		
		paintX = paintX+150 - getExtendX();
		extendX(paintX);
		setLaserY(paintY);
	
		thread = new Thread(this);
		thread.start();
		
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		isMousePressed = false;
		if(isMousePressed == false)
		{
			setLaserX(getLaserX());
			setLaserY(getLaserY());
			extendX(getLaserX());
		}
		repaint();
	}
	
	public void setLaserX(int X)
	{
		
		shootLaserX = X-10;
	}
	
	public int getLaserX()
	{
		return shootLaserX;
	}
	
	public void setLaserY(int Y)
	{
		shootLaserY = Y;
	}
	
	public int getLaserY()
	{
		return shootLaserY;
	}
	
	public void extendX(int X)
	{
		ExtendX = X;
		
	}
	public int getExtendX()
	{
		return ExtendX;
		
	}

	@Override
	public void keyPressed(KeyEvent S_key) {
		// TODO Auto-generated method stub
		int pressedKey = S_key.getKeyLocation();
		
		int paintX = getLaserX();
		int paintY = getLaserY();
		
		System.out.println(pressedKey);
		
		if (pressedKey == KeyEvent.KEY_LOCATION_LEFT) 
		{
			//
			paintX = paintX-10;
			setLaserX(paintX);
			setLaserY(paintY);
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
  	
}
