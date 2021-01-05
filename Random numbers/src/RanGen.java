import java.util.Scanner;
import java.util.Random;

public class RanGen {

	public static void main(String[] args) {
		int numToGuess; //Number the user try to guess
		int guess; //The user's Guess
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		guess = 0;
		
		do
		{
			numToGuess = generator.nextInt(9) + 1;
			System.out.println("Enter a number between 1 to 10");
			guess = scan.nextInt();
			
			if(guess != numToGuess)
			{
				System.out.println("Your guess is incorrect, try again!!!");
				System.out.println("Correct answer is: " + numToGuess);
				System.out.println();
			}
			else
			{
				System.out.println("Your guess is correct, Congratulation!!!");
				System.out.print(numToGuess + " is the correct answer...");
			}
			
		}while(guess != numToGuess);
		
		scan.close();
	}

}
