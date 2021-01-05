/**
 * 
 */

/**
 * @author JWAN
 *
 */
import java.util.*; //Import from library function

public class sumProdDiff {
	//Declare a scanner that copy integer from input
	private static Scanner copy;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, sum, product, difference;
		
		//new scanner to copy from input
		copy = new Scanner(System.in);
		
		//Prompt user to enter number
		System.out.println("Enter two number: ");
		num1 = copy.nextDouble(); //input number 1
		num2 = copy.nextDouble(); //input number 2
		
		//Calculate values
		sum = num1 + num2;
		product = num1 * num2;
		difference = num1 - num2;
		
		//Print value to the screen
		System.out.println("\nThe sum is " + sum + "\nThe product is " + product + "\nThe difference is "+ difference);	
	}
}
