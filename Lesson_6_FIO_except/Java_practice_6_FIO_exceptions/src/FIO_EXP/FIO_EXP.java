package FIO_EXP;

import java.io.File;
import java.util.Collections;
import java.io.FileWriter; 
import java.io.FileReader; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.util.Random; 

import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

class FIO_EXP
{ 
	public static int seed = 1;
	
	public static void txt_write() throws IOException
	{
// FILE WRITER
    	try {
        // Accept a string  
        String str = "File Handling in Java using "+ 
                " FileWriter and FileReader"; 
  
        // attach a file to FileWriter  
        FileWriter fw = new FileWriter("output.txt"); 
        
        Random random = new Random();
        ArrayList<Integer> vals = new ArrayList<Integer>();
        vals.add(random.nextInt());
        vals.add(random.nextInt());
        vals.add(random.nextInt());
        
        for(Integer val: vals)
        {
        	fw.write(String.valueOf(val));
        	fw.write("\n");
        }
  
        System.out.println("Writing successful"); 
        //close the file  
        fw.close(); 
        throw new Exception("finished\n");
    	}
    	catch(Exception exp)
    	{
    		System.out.print(exp.getMessage());
    		
    	}
    	finally
    	{
    		System.out.print("Continue execution\n");
    		
    	}
       
	}
	
	public static void csv_write()
	{
        /*
        ArrayList<String> keys = new ArrayList<String>();
        keys.add("one");
        keys.add("two");
        keys.add("three");
        
        
        List<String[]> dataLines = new ArrayList<String[]>();
        
        for (int i = 0; i < vals.size(); ++i)
        	dataLines.add(new String[] { keys.get(i), String.valueOf(vals.get(i))});
        
        FileWriter outputfile = new FileWriter("output.csv"); 
        CSVWriter writer = new CSVWriter(outputfile, ',', 
                CSVWriter.NO_QUOTE_CHARACTER, 
                CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
                CSVWriter.DEFAULT_LINE_END); 
        
        writer.writeAll(dataLines);
        writer.close();
        
        */
	}
	
	
	public static ArrayList<Integer> txt_read() throws IOException
	{
		//ArrayList<Object> data = new ArrayList<Object>();
		
		Scanner scanner = new Scanner(new File("output.txt"));
		ArrayList<Integer> file_vals = new ArrayList<Integer>();
		while(scanner.hasNextInt()){
		   file_vals.add(scanner.nextInt());
		}
		
		//data.add(file_vals);
		
		try {
			//FileReader filereader = new FileReader("output.csv"); 
	
		    //CSVReader csv_reader = new CSVReader(filereader); 
		    
		    //List<String[]> csv_lines = new ArrayList<String[]>();
		    
		    //csv_lines = csv_reader.readAll();
		    
		    //data.add(csv_lines);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}

		return file_vals;
	}
	
	public static List<String[]> csv_read() 
	{
		List<String[]> csv_lines = new ArrayList<String[]>();
		
		try {
			FileReader filereader = new FileReader("output.csv"); 
	
		    var csv_reader = new CSVReader(filereader); 
		   
		    
		    csv_lines = csv_reader.readAll();
		    
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}

		return csv_lines;
	}
	
    public static void main(String[] args) throws IOException 
    { 
    	txt_write();
    	ArrayList<Integer> txt_data = txt_read();
    	System.out.println(txt_data);
    	for (Integer d : txt_data)
    	{
    		System.out.println(d);
    	}
    		
    //<String[]> csv_data = csv_read();
    		
    } 
}