import java.util.*;

public class Time {
	private static Scanner copy;
	
	public static void main(String[] args)
	{
		int hour, min, sec;
		
		copy = new Scanner(System.in);
		
		/*System.out.println("Enter time value: ");
		
		//hour = copy.nextInt();
		min = copy.nextInt();
		sec = copy.nextInt();
		*/
		sec = (60 - 1);
		min = (60 - 1);
		hour = 12;
		
		System.out.print("Time\nHH MM SS\n" + hour + ":");
		System.out.print(min + ":");
		System.out.print(sec);
	}
}
