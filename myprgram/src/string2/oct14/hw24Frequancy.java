package oct14;


public class hw24Frequancy {

	public static void main(String[] args) 
	{
		String s="abcdakkkkkk";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			int count=0;
			char ch=s.charAt(i);
			for (int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(j)==ch)
					count++;
			}
			if(count==0)
				s1=s1+ch;
		}
		//System.out.println(s1);
		char[] ca=s1.toCharArray();
		
		int[] ia=new int[ca.length];
		for (int i = 0; i < ca.length; i++)
		{
			char ch=ca[i];
			int count=0;
			for (int j = 0; j < s.length(); j++)
			{
				if(s.charAt(j)==ch)
					count++;
			}
			ia[i]=count;
			
		}	
		for (int i = 0; i < ia.length  ||  i < ia.length; i++)
		{
			System.out.println(ca[i]+" = "+ia[i]);
		}

	}

}
