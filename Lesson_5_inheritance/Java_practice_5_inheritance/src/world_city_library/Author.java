package world_city_library;

public class Author {
	private String name;
	private int rate;
	
	public String getName() {
	    return this.name;
	}

	  // Setter
	public void setName(String a_Name) {
	    this.name = a_Name;
	}
	
	public int getRate() {
	    return this.rate;
	}

	  // Setter
	public void setRate(int rate) {
	    this.rate = rate;
	}
	
	public Author()
	{
		this.name = "";
		this.rate = 0;
	}
	
	public Author(String name, int rate)
	{
		this.name = name;
		this.rate = rate;
	}
	
	@Override
	public String toString()
	{
		return this.rate + " R " + this.name;
	}

}
