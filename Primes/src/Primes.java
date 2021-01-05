
public class Primes {

	public static void main(String[] args) 
	{
		int [] primeNum = {2, 3, 5, 7, 11, 13, 17, 19};
		
		//Display the array length (which is 8)
		System.out.println("Array length " + primeNum.length);
		
		//Display all the prime numbers in the list
		System.out.println("The first few prime number: ");
		//using a for-each loop to go through the list
		for(int prime : primeNum)
			System.out.print(prime + " ");
	}
}
