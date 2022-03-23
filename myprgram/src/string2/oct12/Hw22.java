package string2.oct12;


public class Hw22 {

	public static void main(String[] args) 
	{
		String s="ababcbd";
		String s1="";
		int cnt;
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
	//	System.out.println(s1);
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
		for (int i = 0; i < ia.length; i++)
		{
			for (int j = i+1; j < ia.length; j++)
			{
				if(ia[i]>ia[j])
				{
					// swap ia
					int tempia=ia[i];
					ia[i]=ia[j];
					ia[j]=tempia;
					
					// swap ca
					char tempca=ca[i];
					ca[i]=ca[j];
					ca[j]=tempca;				
				}		
			}
		}
		for (int i = 0; i < ia.length; i++) 
		{
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ia[i]+" ");
		}
		System.out.println("\n");
		System.out.println(ca[ca.length-2]+"  "+ ia[ia.length-2]);
	}

}
