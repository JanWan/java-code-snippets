import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args)
	{
		String str, Another = "y";
		int left, right;
		
		Scanner scan = new Scanner(System.in);
		
		while(Another.equalsIgnoreCase("y")) //allow y or Y
		{
			System.out.println("Enter potential palindrome: ");
			str = scan.nextLine();
			
			left = 0; 
			right = str.length() - 1;
			
			while(str.charAt(left) == str.charAt(right) && left < right)
			{
				left++;
				right--;
			}
			
			System.out.println();
			
			if(left < right)
				System.out.println("That string is not a palindrome.");
			else
				System.out.println("That string is a palindrome.");
			
			System.out.println();
			System.out.println("Test another palindrome, y/n? ");
			Another = scan.nextLine();
			
		}
		scan.close();
	}

}
