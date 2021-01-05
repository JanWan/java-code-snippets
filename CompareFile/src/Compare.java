import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Compare 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		//Open file
		File f1 = new File("text1.txt");
        File f2 = new File("text2.txt");
		
        //Read file
		FileReader fR1 = new FileReader(f1);
        FileReader fR2 = new FileReader(f2);
        
        BufferedReader reader1 = new BufferedReader(fR1);
        BufferedReader reader2 = new BufferedReader(fR2);

        String line1 = null;
        String line2 = null;
        int counter = 1;
        
        System.out.println("*******# Comparing Text File 1 with Text File 2 #*******");
        
        while (((line1 = reader1.readLine()) != null) && ((line2 = reader2.readLine()) != null)) 
        {
            if(!line1.equalsIgnoreCase(line2))
            {
            	System.out.println("Line "+counter+": "+line1+" (Not Equal To) "+line2);
            }
            counter++;
        }
        reader1.close();
        reader2.close();
        System.out.println("********************************************************");
	}
}
