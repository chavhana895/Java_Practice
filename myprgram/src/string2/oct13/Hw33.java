package oct13;

public class Hw33 {
	
	public static void main(String[] args) {
		String s="13521";
		char  []sa=s.toCharArray();
		for (int i = 0; i < sa.length; i++)
		{
			
			// 3 7 5 2 1 //ch 7 ch2 3 // temp 7
			for (int j = i+1; j < sa.length; j++)
			{
				char ch=sa[i];
				char ch2=sa[j];
				if(ch>ch2)
				{
					char temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		sa.toString();
		System.out.println(sa);

	}

}
