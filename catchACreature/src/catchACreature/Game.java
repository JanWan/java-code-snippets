package catchACreature;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Game extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private JLabel catches, misses, level;
	
	private JPanel words;
	
	private String catchString, missString, levels;
	
	private ImageIcon creature;
	
	private final int WIDTH, HEIGHT, HEIGHT1, IMAGE_SIZE, DOT, SPEED1;
	
	private int moveXCor, moveYCor, grabsX, grabsY, i, l, x, y, speed, lev, levs;
	
	private Timer run;
	
	private Random xPoint, yPoint;
	
	//missString
	public void setMissString(int x){
		missString = "Misses: "+x;
		misses.setText(missString);
	}
	public String getMissString(){
		return missString;
	}
	
	//catchString
	public void setCatchString(int x){
		catchString = "Catches: "+x;
		catches.setText(catchString);
		lev++;
		if(lev==5){
			levs++;
			setLevels(levs);
			setSpeed(getSpeed()-(levs*200));
			run.setDelay(getSpeed());
			lev = 0;
		}
	}
	public String getCatchString(){
		return catchString;
	}
	
	//levels
	public void setLevels(int x){
		levels = "Level: "+x;
		levs = x;
		level.setText(getLevels());
	}
	public String getLevels(){
		return levels;
	}
	
	//moveXCor
	public void setMoveXCor(int x){
		moveXCor = x;
	}
	public int getMoveXCor(){
		return moveXCor;
	}	
	
	//moveYCor
	public void setMoveYCor(int x){
		moveYCor = x;
	}
	public int getMoveYCor(){
		return moveYCor;
	}
	
	//level speeder
	public void setSpeed(int x){
		speed = x;
	}
	public int getSpeed(){
		return speed;
	}
	
	public void ketchme(){
		x = 0; y = 0;
		//explicitly use the image width to get an accurate position of the creature
		if(getMoveXCor()+29>=grabsX && grabsX>=getMoveXCor())
			x++;
		//explicitly use the image height to get an accurate position of the creature
		if(getMoveYCor()+48>=grabsY && grabsY>=getMoveYCor())
			y++;
		if(x>0 && y>0){
			i++;
			setCatchString(i);
		}
		else{
			l++;
			setMissString(l);
		}
		x = 0; y = 0;
	}
	//if the creature got out of range we need to handle it
	public void outOfPanel(){
		if(getMoveXCor() <= 0 || getMoveXCor()>= WIDTH-IMAGE_SIZE)
			setMoveXCor(getMoveXCor()-IMAGE_SIZE);
		
		if(getMoveYCor() <= 0 || getMoveYCor()>= (HEIGHT1-IMAGE_SIZE))
			setMoveYCor(getMoveYCor()-IMAGE_SIZE);
	}
	
	public Game(){
		xPoint = new Random();
		yPoint = new Random();
		
		DOT = 6;
		WIDTH = 565;
		HEIGHT = 565;
		HEIGHT1 = 450;
		IMAGE_SIZE = 39;
		moveXCor = xPoint.nextInt(WIDTH-IMAGE_SIZE);
		moveYCor = yPoint.nextInt(HEIGHT1)+50;
		grabsX = -10;
		grabsY = -10;
		i = 0;
		l = 0;
		x = 0;
		y = 0;
		lev = 0;
		levs = 1;
		SPEED1 = 2500;
		speed = 2500;
		
		run = new Timer(SPEED1, new ActionListener(){
			public void actionPerformed(ActionEvent event){
				setMoveXCor(xPoint.nextInt(WIDTH-IMAGE_SIZE));
				setMoveYCor(yPoint.nextInt(HEIGHT1)+50);
				outOfPanel();
			}
		});
		
		creature = new ImageIcon("creature.gif");
		
		missString = "Misses: 0";
		catchString = "Catches: 0";
		levels = "Level: 1";
		
		catches = new JLabel(catchString);
		catches.setFont(new Font("Arial",Font.BOLD,18));
		misses = new JLabel(missString);
		misses.setFont(new Font("Arial",Font.BOLD,18));
		level = new JLabel(levels);
		level.setFont(new Font("Arial",Font.BOLD,18));
		
		words = new JPanel();

		words.setPreferredSize(new Dimension(WIDTH,30));
		words.setLayout(new GridLayout(1,3));
		words.add(catches);
		words.add(misses);
		words.add(level);
	
		addMouseListener(new listener());
		
		setBackground(Color.white);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(words);
		run.start();
	}
	
	public void paintComponent(Graphics board){
		super.paintComponent(board);
		board.setColor(Color.red);
		board.fillOval(grabsX-DOT, grabsY-DOT, DOT*2, DOT*2);
		creature.paintIcon(this, board, getMoveXCor(), getMoveYCor());
		repaint();
	}
	
	private class listener extends MouseAdapter{
		public void mouseClicked(MouseEvent event) {
			grabsX = event.getX();
			grabsY = event.getY();
			ketchme();
		}
	}
}