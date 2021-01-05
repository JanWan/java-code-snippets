import java.util.*;

public class Time {

	public static void main(String[] args) {
		int MM = 60, SS = 60, HH = 86400;
		
		Scanner copy = new Scanner(System.in);
		
		
		/*System.out.println("Enter time values: ");
		HH = copy.nextInt();
		MM = copy.nextInt();
		SS = copy.nextInt();
		*/
		MM = HH/MM;
		SS = MM/SS;
		
		System.out.println("Time: " + SS);
		
		copy.close();
	}

}
