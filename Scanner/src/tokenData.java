import java.util.regex.*;

public class tokenData 
{
	private Pattern pattern;
	private Type type;
	
	public tokenData(Pattern pattern, Type type)
	{
		this.pattern = pattern;
		this.type = type;
	}
	
	public Pattern getPattern()
	{
		return pattern;
	}
	
	public Type getType()
	{
		return type;
	}
}
