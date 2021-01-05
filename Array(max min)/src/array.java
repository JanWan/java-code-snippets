import java.util.*;

public class array 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		
		int val=0;
		int [] array = new int[4];
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Enter values: " + (i+1));
			val = scan.nextInt();
			
			array[i] = val;
			
		}
		
		int printVal = computeDifference(array);
		
		System.out.println("Values: " + printVal);

	}
	
	public static int computeDifference(int [] arr)
	{
		int max;
		int min;
		int i;
		
		max = arr[0];
		min = arr[0];
		
		for(i = 0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				System.out.println("max values: " + max);
				return max;				
			}
			else
			if(arr[i] < min)
			{
				min = arr[i];
				System.out.println("min values: " + min);
				return min;
			}
		}
		return max - min;
	}

}
