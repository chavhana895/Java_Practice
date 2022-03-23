
public class RemoveSpecificNo {

	public static void main(String[] args) 
	{
	  String s="hsf7s5qwfha9@DF";
	  char a='@';
	  
	  for (int i = 0; i < s.length(); i++) 
	  {
		if(s.charAt(i)!=a)
			System.out.print(s.charAt(i));
	  }
	}

}
