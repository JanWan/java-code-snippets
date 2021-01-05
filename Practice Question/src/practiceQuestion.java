import java.util.*;

public class practiceQuestion 
{

	public static void main(String[] args) 
	{
		System.out.println("\"Thank you all for coming to my home \n tonight,\" he said mystriously.");
		
		Random gen = new Random();
		int x;
		
		x = gen.nextInt(10) + 1;
		
		boolean done = false;
		check(x);
		
		System.out.println("Value: " + x);
		
	}
	
	public static int check(int x)
	{
		boolean done = false;
		
		if(x != 5 && done == false)
			return x;
		else
			return x;
	}

}
