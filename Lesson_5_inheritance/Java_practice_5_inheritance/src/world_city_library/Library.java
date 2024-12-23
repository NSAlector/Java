package world_city_library;

import java.util.ArrayList; 
import java.util.Collections;

//import Book;
//import Restructurization;

public class Library implements Restructurization {
	static private Library instance = null;
	
	private ArrayList<Book> book_list;
	private ArrayList<Integer> book_popularity;
	private String l_address;
	
	
	private Library() {
		this.l_address = "";
		this.book_list = new ArrayList<Book>();
		this.book_popularity = new ArrayList<Integer>();
		System.out.println("The library was created!");	
		}
	
	public String getAddress()
	{
		return this.l_address;
	}
	
	public void setAddress(String t_addr)
	{
		this.l_address = t_addr;
	}
	
	static public Library get_instance()
	{
		if(instance == null)
			instance = new Library();
		
		return instance;
	}
	
	public void add_book(Book b)
	{
		this.book_list.add(b);
		this.book_popularity.add(0);
	}
	
	public int get_book_count()
	{
		return this.book_list.size();
	}
	
	public void get_book(int idx)
	{
		if(idx < book_popularity.size())
			book_popularity.set(idx,book_popularity.get(idx) + 1);
	}
	
	@Override
	public String toString()
	{
		String str = "\n The library contains the following books : \n";
		for(int i = 0; i < book_list.size(); ++i)
		{
			str = str + " # IDX # " + i + " # INFO # " + book_list.get(i) + " # POP # " + book_popularity.get(i) + " \n"; 
		}
		return str;
	}

	public String building_address()
	{
		return l_address;
	}
	
	@Override
	public void change_structure()
	{
		int min_idx = this.book_popularity.indexOf(Collections.min(this.book_popularity));
		this.book_popularity.remove(min_idx);
		this.book_list.remove(min_idx);
	}
	
	
	
	
	
	
	
}
