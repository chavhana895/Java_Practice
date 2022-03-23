package oct12;

public class reversecharinString {
// 1. Reverse Character in String
	public static void main(String[] args) {
		String s="abc pqr stu xyz";
		String [ ]sa=s.split(" ");
		for (int i = 0; i < sa.length; i++)
		{
			String s1=sa[i];
			for (int j = s1.length()-1; j >=0 ; j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.println();
		} 
		
		
		// Reverse String
	//	for (int i = sa.length-1; i >=0 ; i--) 
	//	{
	//		System.out.println(sa[i ]);
	//	}

	}

}
