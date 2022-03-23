package String;

public class splitStringREV {

	public static void main(String[] args)
	{
		 String[] s= {"Monday","Tuesday","Thursday","Friday","Saturday"};
		
		 for (int i = 0; i < s.length; i++)
		 {
			String s1= s[i];
			
			int j=0;
			int k=s1.length()-1;
			char[]ch=s1.toCharArray();
			
			while(j<k)
			{
				char temp=ch[j];
				ch[j]=ch[k];
				ch[k]=temp;
				j++;k--;
			}
			
			String s2=new String(ch);
			System.out.print(s2.toString()+" ");
		 }
	}

}
