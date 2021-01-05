import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class scanner
{
	/**
	 * 
	 */
	private ArrayList<tokenData> Data;
	private String str;
	private Token lastToken;
	private boolean pushBack;
	
	public scanner(String str)
	{
		this.Data = new ArrayList<tokenData>();
		this.str = str;
		
		Data.add(new tokenData(Pattern.compile("^([a-zA-Z][a-zA-Z0-9_]*)"), Type.identifier));
		Data.add(new tokenData(Pattern.compile("^([0-9]+)"), Type.number));
		Data.add(new tokenData(Pattern.compile("^(\".*\")"), Type.string));
		Data.add(new tokenData(Pattern.compile("^(\'.*\')"), Type.charToken));
		
		
		//Reserved Word
		for(String Reserved : new String[]{"const", "double","int","else","break","else if","if","switch","case",
			"default","char","for","while","do","float","void","short","continue","print","class"})
		{
			Data.add(new tokenData(Pattern.compile(Reserved), Type.reserved_word));
		}
		
		//Special Symbols
		for(String Symbol : new String[]{"~","!","@","%","*","-","+","=","/",";","?","<",">","++","--","&&","||","*=","-=","+="})
		{
			Data.add(new tokenData(Pattern.compile(Symbol), Type.special_Symbol));
			System.out.println("Symbol");
		}
		
	}
	
//************************************************
	//
	public Token nextToken()
	{
		str = str.trim();
		
		//PushBack Method
		if(pushBack)
		{
			pushBack = false;
			return lastToken;
		}
		
		//Check if string is empty
		if(str.isEmpty())
		{
			return (lastToken = new Token(" ", Type.whiteSpace));
		}
		
		//go through token and remove the quotation from the string
		for(tokenData data : Data)
		{
			Matcher matcher = data.getPattern().matcher(str);
			
			if(matcher.find())
			{
				String tok = matcher.group().trim();
				str = matcher.replaceFirst("");
				
				if(data.getType() == Type.string)
				{
					return (lastToken = new Token(tok.substring(1, tok.length() - 1), Type.string));
				}
				else
				{
					return (lastToken = new Token(tok, data.getType()));
				}
			}
		}
		
		//Throw an exception error
		
		throw new IllegalStateException("Error: could not parse " + str);
	
	}//End of nextToken
	
//***********************************************
	
	//hasNextToken method
	public boolean hasNextToken()
	{
		return !str.isEmpty();
	}
	
	//PushBack Method
	public void pushBack()
	{
		if(lastToken != null)
		{
			this.pushBack = true;
		}
	}	

	
	//*************************************************
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		String code;
		
		System.out.println("Enter you statement here: ");
		code = new Scanner(System.in).nextLine();
		
		
		scanner scan = new scanner(code);
		while(scan.hasNextToken())
		{
			System.out.println(scan.nextToken().getToken());
		}
	}
}
