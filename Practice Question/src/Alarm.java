import java.util.Scanner;


public class Alarm {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a;
		
		System.out.println("Enter a number: ");
		a = scan.nextInt();
		
		
		if(a < 1)
		{
			System.out.println("Error");
		}
		else
		for(int i = 0; i < a; i++)
		{
			System.out.println("Alarm...");
		}

	}

}
