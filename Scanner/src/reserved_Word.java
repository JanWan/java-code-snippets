
public class reserved_Word 
{
	private String[] reserved = {"const", "double","int","else","break","else if","if","switch","case",
			"default","char","for","while","do","float","void","short","continue","print","class"};
	
	public reserved_Word(String[] reserved)
	{
		this.reserved = reserved;
	}
	
	public String[] getReservedWord()
	{
		return reserved;
	}
}
