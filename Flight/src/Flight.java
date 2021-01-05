
public class Flight 
{
	private String Name;
	private int Number;
	private String Origin;
	private String Destination;
	private double Cost;
	
	public Flight(String FlName, int FlNum, String Orig, String Dest, int cost)
	{
		Name = FlName;
		Number = FlNum;
		Origin = Orig;
		Destination = Dest;
		Cost = cost;
	}
	//*******************************
	public void setName(String N)
	{
		Name = N;
	}
	
	public String getName()
	{
		return Name;
	}
	//*******************************
	public void setNum(int num)
	{
		Number = num;
	}
	
	public int getNum()
	{
		return Number;
	}
	//*******************************
	public void setOrigin(String Or)
	{
		Origin = Or;
	}
	
	public String getOrigin()
	{
		return Origin;
	}
	//*******************************
	public void setDest(String D)
	{
		Destination = D;
	}
	
	public String getDest()
	{
		return Destination;
	}
	//*******************************
	public void setCost(double C)
	{
		Cost = C;
	}
	
	public double getCost()
	{
		return Cost;
	}
	//*******************************
	
	public String toString()
	{
		return "Airline Name: " + Name + " | Flight Number: " + Number + " | Origin: " + Origin + " | Destination: " + Destination + " | Cost: " + Cost;
	}
}

