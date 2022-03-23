
public class StringReverse {

	public static void main(String[] args)
	{
		String s="Avinash";
		
		for (int i = s.length()-1;i>=0; i--) 
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		System.out.println(s);
	}

}
