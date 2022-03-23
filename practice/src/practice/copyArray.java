package practice;

public class copyArray {

	public static void main(String[] args) {
		int []s= {1,2,3,4,5};
		int []s1=new int[s.length];
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s1.length; j++) 
			{
				s1[j]=s[i];

			}
		
		}
	}

}
