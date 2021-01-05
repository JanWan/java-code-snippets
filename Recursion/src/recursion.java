import java.util.*;

public class recursion {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		
		System.out.println("Enter a number: ");
		num1 = scan.nextInt();
	//	System.out.println("Enter a number: ");
		//num2 = scan.nextInt();
		
		
		
		System.out.println(recurSum(num1));
		
		scan.close();
	}
	
	public static int recurSum(int n)
	{
		int result;
		
		//base case
		if(n < 10)
		{
			result = 1;
			System.out.println(result+"..>>");
		}
		else
			//recursive step
			result =  n + recurSum(n % 10);
			System.out.println("<<.." + result);
		return result;
		//return result;
	}
	
	/*public static int recurSum(int n1, int n2)
	{
		//base case
		if(n2 == 0)
			return n2;
		else
			//recursive step
			return n1 + recurSum(n1, n2 - 1);
	}*/
	
	
	public static int power(int base, int exp)
	{
		//base case
		if(exp == 0)
			return 1;
		else
			//recursive step
			return base * power(base, exp - 1);
	}


}
