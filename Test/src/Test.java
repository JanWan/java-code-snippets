
import java.util.Scanner;

import javax.swing.*;

 

public class Test extends JApplet
{
	
StringBuffer strBuffer;
	
	Scanner input;
	
	int NUMCHAR = 26;
	
	int [] upper = new int [NUMCHAR];
	int [] lower = new int [NUMCHAR];
	int [] num_Spaces = new int [NUMCHAR];
	
	int lowerCase = 0, upperCase = 0, SpaceBetweenLet = 0;
	int space = 0;
	char current;
	
	String sentence;
	
    //empty constructor
    public Test()
   {
        System.out.println("Java");
    }
    //single variable constructor
    public Test(String s)
    {
        System.out.println(s);
    }
    //method
    public void method()
    {
        System.out.println("method");
    }
    //init
    public void init()
    {
    	JLabel label1 = new JLabel("Test");
                 System.out.println("Applet initializing");
                 getContentPane().add(new panel());
        method();
        }
        //start
    public void start()
        {
               System.out.println("Applet starting");
        }

        //stop

        public void stop()
        {

                System.out.println("Applet stopping");

        }
        //destroy

        public void destroy()
        {

                System.out.println("Applet destroyed");

        }
    //Panel

    public class panel extends JPanel
    {

        public panel()

        {

            //this is where the diplay items go
        	int hey;
        	hey = Space("gggg");
        	JLabel label1 = new JLabel(" "+hey);
        	
        	

        }

    }

    public  static void main(String[] args)

    {

        JFrame frame = new JFrame("Frame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Test   t = new Test();

        t.init();               // simulate browser call(1)

        frame.setSize(400,600);         // Set the size of the frame

        frame.setVisible(true);         // Show the frame

    }
    
  //****************************************************  
    public int[] upperCase(String Sentence)
	{
    	
		for (int ch = 0; ch < Sentence.length(); ch++)
		{
			current = Sentence.charAt(ch);
			
			if (current >= 'A' && current <= 'Z')
				upper[current- 'A']++;
		}
		return upper;
	}
    //**************************************************
    public int[] LowerCase(String Sentence)
   	{
   		for (int ch = 0; ch < Sentence.length(); ch++)
   		{
   			current = Sentence.charAt(ch);
   			
   			if (current >='a' && current <= 'z')
   				lower [current- 'a']++;
   		}
   		return lower;
   	}
   //***************************************************** 
    int Space(String Sentence)
   	{
   		for (int ch = 0; ch < Sentence.length(); ch++)
   		{
   			current = Sentence.charAt(ch);
   			
   			if (current >= 'A' && current <= 'Z')
				upper [current- 'A']++;
			else if (current >='a' && current <= 'z')
				lower [current- 'a']++;
			else if(current == ' ')
				space ++;
			else
				System.out.println ("No Sentence");
   		}
   		return space;
   	}
   //******************************************************
}
