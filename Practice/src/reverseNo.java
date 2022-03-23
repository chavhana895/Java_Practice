
public class reverseNo {
           
	public static void main(String[] args) 
	{
//		Write a Java program to find the first repeating character in a string.
//	     input : abacbdpqr
//	     output : a
		
		String s="abacbdpqr";
	
		for (int i = 0; i<s.length(); i++) 
		{
			for (int j = i+1; j < s.length()-1; j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println(s.charAt(i));
					return;
				}
				
			}
		}  
	}
}