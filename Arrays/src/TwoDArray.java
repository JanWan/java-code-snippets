
public class TwoDArray
{

	public static void main(String[] args) 
	{
		int[][] table = new int[5][10];
		
		//load the table with the variable
		for(int row = 0; row < table.length; row++)
			for(int col = 0; col < table[row].length; col++)
				table[row][col] = row * 10 + col;
		
		//print the table
		for(int row = 0; row < table.length; row++)
		{
			for(int col = 0; col < table[row].length; col++)
				System.out.println(table[row][col] + "\t");
			System.out.println();
		}

	}

}
