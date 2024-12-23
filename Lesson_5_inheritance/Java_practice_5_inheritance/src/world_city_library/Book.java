package world_city_library;

//import Edition;
//import Author;


public class Book implements Edition {
	private String title;
	private Author author;
	private int edition_count;
	
	public void add_edition()
	{
		this.edition_count++;
	}
	
	public Author getAuthor()
	{
		return this.author;
	}
	
	public void setAuthor(Author t_auth)
	{
		this.author = t_auth;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String t_title)
	{
		this.title = t_title;
	}
	
	public Book()
	{
		this.title = "";
		this.author = new Author();
		this.edition_count = 1;
		//System.out.println("Constructor with no parameters");
	}

	public Book(String _title, Author _author, int ec)
	{
		this.title = _title;
		this.author = _author;
		this.edition_count = ec;
		//System.out.println("Constructor with parameters");
	}
	
	public Book(Book _tb)
	{
		this(_tb.title,_tb.author, _tb.edition_count);
		//System.out.println("Copy Constructor");
	}
	
	@Override
	public String toString()
	{
		return "* edition * "+ this.edition_count +" * " + this.author + " : " + this.title;
	}

}
