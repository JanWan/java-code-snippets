
public class Book {
	private String Title, Author, Publisher;
	private int Copyright;
	
	//*****************************************************
	
	public Book(String T, String A, String P, int C)
	{
		Title = T;
		Author = A;
		Publisher = P;
		Copyright = C;
	}
	
	//*****************************************************
	
	public void setTitle(String T)
	{
		Title = T;
	}
	
	public String getTitle()
	{
		return Title;
	}
	//*****************************************************
	public void setAuthor(String A)
	{
		Author = A;
	}
	
	public String getAuthor()
	{
		return Author;
	}
	//*****************************************************
	
	public void setPublisher(String P)
	{
		Publisher = P;
	}
	
	public String getPublisher()
	{
		return Publisher;
	}
	
	//*****************************************************
	public void setCopyright(int C)
	{
		Copyright = C;
	}
	
	public int getCopyright()
	{
		return Copyright;
	}
	
	//*****************************************************
	public String toString()
	{
		return "Title: " + Title + "\nAuthor: " + Author + "\nPublisher: " + Publisher + "\nCopyright Date: " + Copyright;
	}
	//*****************************************************
}
