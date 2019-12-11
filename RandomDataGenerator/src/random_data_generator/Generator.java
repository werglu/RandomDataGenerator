package random_data_generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generator {

	public static void main(String[] args) {
		
		List<String> femaleNames = GetFemaleNames();
		List<String> maleNames = GetMaleNames();


	}
	
	private static List<String> GetFemaleNames()
	{
	    File file = new File("first-f.txt");

		List<String> names = new ArrayList<String>();
		
		try 
		{	
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) 
			{
	            String i = sc.next();	    
	            names.add(i);
	        }
	        sc.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
			
		return names;
	}

	private static List<String> GetMaleNames()
	{
	    File file = new File("first-m.txt");

		List<String> names = new ArrayList<String>();
		
		try 
		{
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) 
			{
	            String i = sc.next();
	            names.add(i);
	        }
	        sc.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
			
		return names;
	}
}
