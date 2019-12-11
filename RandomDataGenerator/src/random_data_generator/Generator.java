package random_data_generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Generator {

	 static List<String> femaleNames = GetFemaleNames();
	 static List<String> maleNames = GetMaleNames();
	 static List<String> surnames = GetSurnames();
	 static List<String> pesels = GetPesel();
	 static List<String> cities = GetCities();
     static List<Person> people = new ArrayList<Person>();
	 
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();	
		GeneratePeople(i);
	}
	
	private static void GeneratePeople(int numberOfPeople)
	{
		for(int i=0; i< numberOfPeople; i++)
		{
			Random rand = new Random();
		
			Person person = new Person();
			boolean isFemale = rand.nextBoolean();
			person.surname = surnames.get(rand.nextInt(surnames.size()));
			person.pesel = pesels.get(rand.nextInt(pesels.size()));
			person.city = cities.get(rand.nextInt(cities.size()));

			if(isFemale)
			{
				person.name = femaleNames.get(rand.nextInt(femaleNames.size()));
				person.surname = person.surname.replace("ski", "ska");
				person.surname = person.surname.replace("cki", "cka");
				person.surname = person.surname.replace("dzki", "dzka");
				char genderNumber = person.pesel.charAt(person.pesel.length()-2);
				while(genderNumber == '1' || genderNumber == '3' || genderNumber == '5' || genderNumber == '7' || genderNumber == '9')
				{
					person.pesel = pesels.get(rand.nextInt(pesels.size()));
					genderNumber = person.pesel.charAt(person.pesel.length()-2);
				}
			}
			else
			{
				person.name = maleNames.get(rand.nextInt(maleNames.size()));
				char genderNumber = person.pesel.charAt(person.pesel.length()-2);
				while(genderNumber == '0' || genderNumber == '2' || genderNumber == '4' || genderNumber == '6' || genderNumber == '8')
				{
					person.pesel = pesels.get(rand.nextInt(pesels.size()));
					genderNumber = person.pesel.charAt(person.pesel.length()-2);
				}
			}
			
			people.add(person);
			System.out.println(person.toString());
		}
		
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
	
	private static List<String> GetSurnames()
	{
	    File file = new File("last.txt");
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
	
	private static List<String> GetPesel()
	{
	    File file = new File("pesel.txt");
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
	
	private static List<String> GetCities()
	{
	    File file = new File("cc.txt");
		List<String> names = new ArrayList<String>();
		
		try 
		{
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) 
			{
	            String i = sc.nextLine();
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
