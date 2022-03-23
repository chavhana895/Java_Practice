
package oct12;

public class hw17 {

	public static void main(String[] args) 
	{
		String s="abcdefabcd";
		
		int cnt=0;
		for (int i = 0; i <s.length(); i++)
		{
			char ch=s.charAt(i);
			
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt=cnt+1;
					System.out.println(s.charAt(j));
					break;
				}
				
			}
		//	if(cnt==0)
				//s1=s1+s.charAt(i);
		}
		System.out.println(cnt);
	//	System.out.println(s1);

	}

}
