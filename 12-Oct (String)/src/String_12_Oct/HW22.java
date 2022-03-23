package String_12_Oct;

public class HW22 {

	public static void main(String[] args) {
		
		String s="adcbabcaba";
		String s1="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			int count=0;
			for (int j = 0; j < s1.length(); j++) 
			{
			   if(s1.charAt(j)==ch)
				   count++;
			}
			if(count==0)
				s1=s1+ch;
		}
		char[]ca=s1.toCharArray();
		int []ia=new int [ca.length];
		
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
			for (int j =i+1; j < ia.length; j++) 
			{
				if(ia[i]>ia[j])
				{
					int tempia=ia[i];
					ia[i]=ia[j];
					ia[j]=tempia;
					
					char tempca=ca[i];
					ca[i]=ca[j];
					ca[j]=tempca;
				}
			}
		}
		 for (int i = 0; i < ca.length; i++) 
		 {
			System.out.print(ca[i]+" ");
		}
		 System.out.println();
		 
		 for (int i = 0; i < ia.length; i++) 
		 {
			System.out.print(ia[i]+" ");
		}
		}

}
