import java.text.SimpleDateFormat;
import java.util.Calendar;

public class currentTime 
{
	public static void main(String[] args) 
	{
    	Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	
    	System.out.println("HH:MM:SS");
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	System.out.println( sdf.format(cal.getTime()) );
    }
}
