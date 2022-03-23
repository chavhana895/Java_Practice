package oct12;

public class hw23 {

	public static void main(String[] args)
	{
		String	s="    ssss ssss    ";
		int i=0,j=s.length()-1;
		String s1 ="";
		while(true)
		{
			if(s.charAt(i)==' ')
				i++;
			else
				break;
				
		}
		while(true)
		{
			if(s.charAt(j)==' ')
				j--;
			else
				break;
		}
		for (int k = i; k <= j; k++)
		{
			s1=s1+s.charAt(k);
		}
		System.out.println(s1);
		
		

	}

}
