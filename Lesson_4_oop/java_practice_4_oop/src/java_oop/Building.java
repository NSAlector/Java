package java_oop;

import java.util.*;

public class Building {
	private List<String> elems;
	
	public Building()
	{
		elems = new ArrayList<String>();
		elems.add("wall");
		elems.add("window");
		elems.add("roof");
		elems.add("door");
		elems.add("floor");
	}

}
