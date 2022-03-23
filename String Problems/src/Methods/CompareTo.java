package Methods;

public class CompareTo 
{

	public static void main(String[] args) 
	{
	  String s1=new String("Computer");
	  String s2=new String("computer");
	  if(s1.equals(s2))                               //equals()
	  System.out.println("Strings are Same");
	  else
		  System.out.println("Strings are not Same");
	  	  
	 System.out.println();
	 
	 if(s1.equalsIgnoreCase(s2))                        //equalIgnoreCase
		  System.out.println("Strings are Same");
		  else
			  System.out.println("Strings are not Same");
	 
	 System.out.println();
	 
	int i=s1.compareTo(s2);                            //compareTo
	if(i==0)
		System.out.println("String is same");
	else if(i>0)
		System.out.println("opposite to dictionary order");
	else
		System.out.println("dictionary order");
	}
}
