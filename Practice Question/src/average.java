import java.util.*;
import java.text.*;
public class average 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int w, x, y, z;
		double sum;
		
		System.out.println("Enter 4 numbers: ");
		w = scan.nextInt();
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		sum = (double)(w+x+y+z)/4;
		
		System.out.println("Sum: " + sum);
		
		DecimalFormat s = new DecimalFormat("0.##");
		System.out.println("Sum = "+ s.format(sum));
		
		scan.close();
	}

}
