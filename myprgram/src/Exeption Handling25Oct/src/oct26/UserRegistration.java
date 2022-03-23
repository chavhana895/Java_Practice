package oct26;

public class UserRegistration {

	public void registerProfile(String name, int age, String contry) throws Exception
	{
		if(age<18)
		{
			throw new InvalidAgeException("you are Minor");
		}
		else if(contry.compareToIgnoreCase("india")!=0)
		{
			throw new InvalidCountryException("British and dog not allowed");
		}
		else
		{
			System.out.println("congratulatioon"+name);
		}
		
	}

}
