
package oct14;

public class hw17 {

	public static void main(String[] args) 
	{
		String s="abcdefabcd";
		
		int cnt=0;
		System.out.println("dublicate String are:-\t\n");
		for (int i = 0; i <s.length(); i++)
		{
			char ch=s.charAt(i);
			
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt=cnt+1;
					System.out.print(s.charAt(j)+"  ");
					break;
				}
				
			}
		
		}
		System.out.println("\n\ndublicate string count:- "+cnt);
	

	}

}
