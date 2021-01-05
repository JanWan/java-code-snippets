/**
 * 
 */

/**
 * @author JWAN
 *
 */

import java.util.Random;
import java.util.Scanner;

public class username 
{
	private static Scanner copy;
	
	public static void main(String[] args)
	{
		//Variables declaration
		int F, M, L, num; //Counters
		String fName, lName, mName;
		
		copy = new Scanner(System.in);
		Random J = new Random();
		
		System.out.print("Enter your First Name: ");
		//Input first name
		fName = copy.nextLine();
		String N1 = fName;
		for(F = 0; F < N1.length(); F++){}
		
		//Input middle name
		System.out.print("Enter your Middle Name: ");
		mName = copy.next();
		String N2 = mName;
		for(M = 0; M < N2.length(); M++){}
		
		//Input last name
		System.out.print("Enter your Last Name: ");
		lName = copy.next();
		String N3 = lName;
		for(L = 0; L < N3.length(); L++){}
		
		//Generate random value
		num = J.nextInt(60)+51;
		
		//Display user name characters
		System.out.print("Username: " + (N1.charAt(0)));
		System.out.print(N3.substring(0, 5));
		System.out.print(N2.substring(0, 3)); 
		System.out.print(num); //Print random number
	}
}
