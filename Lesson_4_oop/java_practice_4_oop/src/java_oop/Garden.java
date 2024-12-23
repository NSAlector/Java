package java_oop;
//import java.lang.*;
import java.util.*;

//Agregation

public class Garden {
	private String name;
	private List<String> flowers;
	
	public Garden(String tname)
	{
		this.name = tname;
		this.flowers = new ArrayList<String>();
	}
	
	public void AddFlower(String tf)
	{
		this.flowers.add(tf);
	}
	
	public void DeleteFlower(String tf)
	{
		this.flowers.remove(tf);
	}
	
	public void PrintInfo()
	{
		System.out.print("It's garden of ");
		System.out.println(this.name);
		System.out.println();
		
		System.out.println("The following flowera are in the garden: ");
		for(String fl:this.flowers)
		{
			System.out.print(" - ");
			System.out.println(fl);
		}
	}
}
