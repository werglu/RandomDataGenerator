package random_data_generator;

public class Person {

	public String name;
	public String surname;
	public String pesel;
	public String city;
	public String street;
	public String idCardNumber;
	public String bankAccount;
	
	public Person()
	{
		
	}
	
	@Override
	public String toString()
	{
		return name + " " +surname + " " + pesel + " " + city;
	}

}
