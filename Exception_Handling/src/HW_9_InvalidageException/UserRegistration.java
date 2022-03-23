package HW_9_InvalidageException;

public class UserRegistration {

	public void registerProfile(String name,int age,String Country) throws Exception
	{
	  if(age<18)
		  throw new InvalidAgeException ("You are minor");
	  else if(Country.compareToIgnoreCase("india")!=0)
		  throw new InvalidCountryException("British and dogs are not allowed");
	  else
		  System.out.println("congrats "+name);
	}
}