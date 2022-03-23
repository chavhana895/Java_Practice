package Q5;

public class UserRegistration {
public void registerProfile(String name,int Age,String Country) throws Exception
{
	if(Age<18)
		throw new InvalidAgeException("You are Minor");
	if(name.compareToIgnoreCase("india")!=0)
		throw new InvalidStringException("Other than Indian are not allowed");
	else
		System.out.println("Congrats "+name);
}
}