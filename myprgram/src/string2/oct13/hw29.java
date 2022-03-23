package oct13;

public class hw29 {

	public static void main(String[] args) {
		String [] s= {"abd","aacd","ccad4","sdafghfjkg","ff","asas"};
		System.out.println("____Array are_____ \n");
		for(String sa: s)
		{
			System.out.println(sa);
		}
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s.length; j++)
			{
				if(s[i].length()<s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
//				else if(s[i].length()==s[j].length()) /// its logic for  its string are same bus
//				{
//					if(s[i].compareTo(s[j])>0)
//					{
//						
//						String temp=s[i];
//						s[i]=s[j];
//						s[j]=temp;
//					}
//				}
			}
		}
		System.out.println("\n_____Assending Order________ \n");
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s.length; j++)
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("\n________Desending  Order __________\n");
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
