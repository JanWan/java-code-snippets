import java.util.Random;
import java.io.*;

public class testData 
{

	public static void main(String[] args) throws IOException
	{
		//***************************************************************
		//Creates a file to test data that consists of ten lines each
		//Containing ten integers value in the range 10 to 99
		//***************************************************************
		
		final int MAX = 10;
		
		int value;
		
		String file = "test.dat"; //file name
		
		Random rand = new Random();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		for(int line = 1; line < MAX; line++)
		{
			for(int num = 1; num < MAX; num++)
			{
				value = rand.nextInt(90) + 10;
				outFile.println(value + " ");
			}
			outFile.println();
		}
		outFile.close();
		System.out.println("Output file have been close " + file);
		
	}

}
