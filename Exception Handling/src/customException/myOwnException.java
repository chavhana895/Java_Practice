package customException;

public class myOwnException extends Exception
{
  public myOwnException(String s) 
  {
	super(s);
	System.out.println(s);
  }
}
