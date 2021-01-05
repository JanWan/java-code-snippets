
public class ErrorCheck 
{
	public boolean A = false;

	public static void main(String[] args) 
	{
		int a = 2, b = 1, c;
		c = b;
		
		if(a == b)
		{
			System.out.println("Not an isosceles");
		}
		if(b != c)
		{
			System.out.println("Not n isosceles");
		}
		else
		{
			System.out.println("Is an isosceles");
		}
	}

}
