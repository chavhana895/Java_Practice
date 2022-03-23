package HW9;

public class UserRegistration {

	public void userregistration(String name, int age, String Country)throws Exception
	{
		if(age<18)
			throw new InvalidAgeException("You are minor");
		else if(Country.compareToIgnoreCase("india")!=0)
			throw new InvalidCountryException("British And Dogs are not allowed");
		else 
			System.out.println("Congrats "+name);
	}
}
